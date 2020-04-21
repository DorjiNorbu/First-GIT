package com.spring.mvc.ttpl.dao;

import com.spring.mvc.ttpl.dto.TaxPayerRegistrationDTO;
import com.spring.mvc.ttpl.entity.TaxPayerRegistrationEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

@Repository
public class TaxPayerRegistrationDao extends  BaseDao{
    @Transactional(value = "txManager", rollbackFor = Exception.class)
    public void registerTaxPayer(TaxPayerRegistrationEntity tEntity) {
        em.persist(tEntity);
    }

    @Transactional(readOnly = true)
    public BigInteger getAutoSerial(String taxPayerType) {
        String sqlQuery = properties.getProperty("ChargeAllocationDao.getAutoSerial");
        org.hibernate.Query hQuery = hibernateQuery(sqlQuery);
        hQuery.setParameter("taxPayerType", taxPayerType);
        return (BigInteger) hQuery.uniqueResult();
    }

    @Transactional(readOnly = true)
    public BigInteger getAutoSerialSecondary(String yearNumber, String monthNumber, String dayNumber) {
        String sqlQuery = properties.getProperty("ChargeAllocationDao.getAutoSerialSecondary");
        org.hibernate.Query hQuery = hibernateQuery(sqlQuery);
        hQuery.setParameter("yearNumber", yearNumber);
        hQuery.setParameter("monthNumber", monthNumber);
        hQuery.setParameter("dayNumber", dayNumber);
        return (BigInteger) hQuery.uniqueResult();
    }

    @Transactional(readOnly = true)
    public String getValidCid(String cid,String type) {
        String sqlQuery = properties.getProperty("ChargeAllocationDao.getValidCid");
        org.hibernate.Query hQuery = hibernateQuery(sqlQuery);
        hQuery.setParameter("cid", cid);
        hQuery.setParameter("type", type);
        return (String) hQuery.uniqueResult();
    }

    @Transactional(readOnly = true)
    public TaxPayerRegistrationDTO getTaxPayerDetails(String cid) {
        String sqlQuery = properties.getProperty("ChargeAllocationDao.getTaxPayerDetails");
        org.hibernate.Query hQuery = hibernateQuery(sqlQuery, TaxPayerRegistrationDTO.class);
        hQuery.setParameter("cid", cid);
        return (TaxPayerRegistrationDTO) hQuery.uniqueResult();
    }
}