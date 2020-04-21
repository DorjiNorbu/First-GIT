package com.spring.mvc.ttpl.service;

import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.dao.TaxPayerRegistrationDao;
import com.spring.mvc.ttpl.dto.TaxPayerRegistrationDTO;
import com.spring.mvc.ttpl.entity.TaxPayerRegistrationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * Created by nzepa on 2/25/2020.
 */
@Service
public class TaxPayerRegistrationService {
    @Autowired
    private TaxPayerRegistrationDao taxPayerRegistrationDao;

    public ResponseMessage saveTaxPayer(TaxPayerRegistrationDTO taxPayerRegistrationDTO) {
        ResponseMessage responseMessage = new ResponseMessage();
        TaxPayerRegistrationEntity tEntity = new TaxPayerRegistrationEntity();

        String cid=taxPayerRegistrationDTO.getCidNumber();
        String type=taxPayerRegistrationDTO.getType().toString();
        String validCid=taxPayerRegistrationDao.getValidCid(cid,type);
        if (validCid != null){
            TaxPayerRegistrationDTO taxPayerDTO=taxPayerRegistrationDao.getTaxPayerDetails(cid);
            responseMessage.setResponseStatus(2);
            responseMessage.setResponseDTO(taxPayerDTO);
        }else{
            String tpn = generateTpn(taxPayerRegistrationDTO);
            String secondaryTpn = generateSecondaryTpn();

            tEntity.setTpn(tpn);
            tEntity.setTaxPayerName(taxPayerRegistrationDTO.getTaxPayerName());
            tEntity.setCidNumber(taxPayerRegistrationDTO.getCidNumber());
            tEntity.setDob(taxPayerRegistrationDTO.getDob());
            tEntity.setMobileNumber(taxPayerRegistrationDTO.getMobileNumber());
            tEntity.setAgency(taxPayerRegistrationDTO.getAgency());
            tEntity.setType(taxPayerRegistrationDTO.getType());
            tEntity.setSetDate(new Date());
            tEntity.setSecondaryTpn(secondaryTpn);

            taxPayerRegistrationDao.registerTaxPayer(tEntity);
            responseMessage.setResponseStatus(1);
            responseMessage.setResponseText("resgistered successfully");
        }
        return responseMessage;
    }

    private String generateSecondaryTpn() {

        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        Integer year = cal.get(Calendar.YEAR);
        Integer month = cal.get(Calendar.MONTH) + 1;
        Integer day = cal.get(Calendar.DAY_OF_MONTH);
        String yearNumber = year.toString().substring(2, 4);
        String monthNumber;
        String dayNumber;

        if (month.toString().length() == 1) {
            monthNumber = "0" + month.toString();
        } else {
            monthNumber = month.toString();
        }
        if (day.toString().length() == 1) {
            dayNumber = "0" + day.toString();
        } else {
            dayNumber = day.toString();
        }

        BigInteger autoSerial = taxPayerRegistrationDao.getAutoSerialSecondary(yearNumber, monthNumber, dayNumber);
        if (autoSerial == null) {
            autoSerial = BigInteger.ONE;
        } else {
            autoSerial = autoSerial.add(BigInteger.ONE);
        }

        String autoSerialString;

        if (autoSerial.toString().length() == 1) {
            autoSerialString = "000" + autoSerial.toString();
        } else if (autoSerial.toString().length() == 2) {
            autoSerialString = "00" + autoSerial.toString();
        } else if (autoSerial.toString().length() == 3) {
            autoSerialString = "0" + autoSerial.toString();
        } else {
            autoSerialString = autoSerial.toString();
        }

        return yearNumber + monthNumber + dayNumber + autoSerialString;

    }

    private String generateTpn(TaxPayerRegistrationDTO taxPayerRegistrationDTO) {
        String taxPayerName = taxPayerRegistrationDTO.getTaxPayerName();
        String firstLetter = taxPayerName.substring(0, 1).toUpperCase();
        Character randomAlphabet = null;
        Random random = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 27; i++) {
            randomAlphabet = alphabet.charAt(random.nextInt(alphabet.length()));
        }
        String taxPayerType = taxPayerRegistrationDTO.getType().toString();

        BigInteger autoSerial = taxPayerRegistrationDao.getAutoSerial(taxPayerType);
        if (autoSerial == null) {
            autoSerial = BigInteger.ONE;
        } else {
            autoSerial = autoSerial.add(BigInteger.ONE);
        }

        String autoSerialString;

        if (autoSerial.toString().length() == 1) {
            autoSerialString = "000" + autoSerial.toString();
        } else if (autoSerial.toString().length() == 2) {
            autoSerialString = "00" + autoSerial.toString();
        } else if (autoSerial.toString().length() == 3) {
            autoSerialString = "0" + autoSerial.toString();
        } else {
            autoSerialString = autoSerial.toString();
        }
        return firstLetter + randomAlphabet + taxPayerType + autoSerialString;
    }
}