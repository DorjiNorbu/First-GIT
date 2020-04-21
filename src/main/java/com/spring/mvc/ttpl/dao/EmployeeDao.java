package com.spring.mvc.ttpl.dao;

import com.spring.mvc.ttpl.dto.EmployeeDTO;
import com.spring.mvc.ttpl.entity.EmployeeEntity;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by  on 2/5/2020.
 */
@Repository
public class EmployeeDao extends BaseDao{

    @Transactional(value = "txManager", rollbackFor = Exception.class)
    public void saveEmployee(EmployeeEntity employeeEntity ) {
        em.persist(employeeEntity);
    }

    @Transactional(readOnly = true)
    public String checkDuplicateCid(String cidNo) {
        String sqlQuery = properties.getProperty("ChargeAllocationDao.checkDuplicateCid");
        org.hibernate.Query hQuery = hibernateQuery(sqlQuery);
        hQuery.setParameter("cidNo", cidNo);
        return (String) hQuery.uniqueResult();
    }


    @Transactional(readOnly = true)
    public EmployeeDTO getEmployee(String employeeCid) {
        String query = properties.getProperty("ChargeAllocationDao.getEmployee");
        org.hibernate.Query hQuery = hibernateQuery(query, EmployeeDTO.class);
        hQuery.setParameter("cidNo", employeeCid);
        return (EmployeeDTO) hQuery.uniqueResult();
    }


    public List<EmployeeDTO> getEmployeeList() {
        String sqlQuery = properties.getProperty("ChargeAllocationDao.getEmployeeList");
        Query hQuery = hibernateQuery(sqlQuery, EmployeeDTO.class);
        return hQuery.list().isEmpty() ? null : hQuery.list();
    }
}
