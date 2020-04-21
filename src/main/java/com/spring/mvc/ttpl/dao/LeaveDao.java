package com.spring.mvc.ttpl.dao;

import com.spring.mvc.ttpl.dto.LeaveDTO;
import com.spring.mvc.ttpl.entity.LeaveEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by nzepa on 2/7/2020.
 */
@Repository
public class LeaveDao extends BaseDao {

    @Transactional(value = "txManager", rollbackFor = Exception.class)
    public void saveLeave(LeaveEntity leaveEntity) {
        em.persist(leaveEntity);
    }

    @Transactional(readOnly = true)
    public LeaveDTO getApplicant(String applicantName) {
        String query = properties.getProperty("ChargeAllocationDao.getApplicant");
        org.hibernate.Query hQuery = hibernateQuery(query, LeaveDTO.class);
        hQuery.setParameter("aName", applicantName);
        return (LeaveDTO) hQuery.uniqueResult();
    }
}
