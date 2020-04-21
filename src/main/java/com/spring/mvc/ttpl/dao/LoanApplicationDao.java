package com.spring.mvc.ttpl.dao;

import com.spring.mvc.ttpl.entity.LoanApplicationEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dorji.norbu on 08-Feb-2020.
 */
@Repository
public class LoanApplicationDao extends BaseDao {

    @Transactional(value = "txManager", rollbackFor = Exception.class)
    public void saveLoanApplication (LoanApplicationEntity loanApplicationEntity) { em.persist(loanApplicationEntity);}

    @Transactional(readOnly = true)
    public String checkDuplicate(String cidNo) {
        String sqlQuery = properties.getProperty("ChargeAllocationDao.checkDuplicate");
        org.hibernate.Query hQuery = hibernateQuery(sqlQuery);
        hQuery.setParameter("cidNo", cidNo);
        return (String) hQuery.uniqueResult();
    }


}
