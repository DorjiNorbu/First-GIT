package com.spring.mvc.ttpl.service;


import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.dao.LoanApplicationDao;
import com.spring.mvc.ttpl.dto.LoanApplicationDTO;
import com.spring.mvc.ttpl.entity.LoanApplicationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dorji.norbu on 08-Feb-2020.
 */
@Service
public class LoanApplicationService {

    @Autowired private LoanApplicationDao loanApplicationDao;

    public ResponseMessage saveLoanApplication(LoanApplicationDTO loanApplicationDTO) {
        ResponseMessage responseMessage=new ResponseMessage();

        String cidNo = loanApplicationDTO.getApplicantCid();
        String validCid = loanApplicationDao.checkDuplicate(cidNo);
        if (validCid != null) {
            responseMessage.setResponseStatus(0);
            responseMessage.setResponseText("CID number " + cidNo + " already exist.");
            return responseMessage;
        } else {
            LoanApplicationEntity loanApplicationEntity = convertDtoToEntity(loanApplicationDTO);
            loanApplicationDao.saveLoanApplication(loanApplicationEntity);
            responseMessage.setResponseStatus(1);
            responseMessage.setResponseText("Saved Successfully. Thank you");
        }

       return responseMessage;
    }

    private LoanApplicationEntity convertDtoToEntity(LoanApplicationDTO loanApplicationDTO) {
        LoanApplicationEntity loanApplicationEntity=new LoanApplicationEntity();

        loanApplicationEntity.setApplicantName(loanApplicationDTO.getApplicantName());
        loanApplicationEntity.setApplicantCid(loanApplicationDTO.getApplicantCid());
        loanApplicationEntity.setDob(loanApplicationDTO.getDob());
        loanApplicationEntity.setLoanAmount(loanApplicationDTO.getLoanAmount());
        loanApplicationEntity.setTermPeriod(loanApplicationDTO.getTermPeriod());
        loanApplicationEntity.setLoanType(loanApplicationDTO.getLoanType());

        return loanApplicationEntity;
    }

}
