package com.spring.mvc.ttpl.service;

import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.dao.LeaveDao;
import com.spring.mvc.ttpl.dto.LeaveDTO;
import com.spring.mvc.ttpl.entity.LeaveEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nzepa on 2/7/2020.
 */
@Service
public class LeaveService {
    @Autowired
    private LeaveDao leaveDao;

    public ResponseMessage saveLeave(LeaveDTO leaveDTO) {
        ResponseMessage responseMessage = new ResponseMessage();
        LeaveEntity leaveEntity = convertDtoToEntity(leaveDTO);
        leaveDao.saveLeave(leaveEntity);

        responseMessage.setResponseStatus(1);
        responseMessage.setResponseText("Saved Successful");

        return responseMessage;
    }

    /**
     * convert DTO to entity
     *
     * @param leaveDTO -- LeaveDTO
     * @return --- LeaveEntity
     */
    private LeaveEntity convertDtoToEntity(LeaveDTO leaveDTO) {
        LeaveEntity leaveEntity = new LeaveEntity();
        leaveEntity.setApplicantName(leaveDTO.getApplicantName());
        leaveEntity.setFromDate(leaveDTO.getFromDate());
        leaveEntity.setToDate(leaveDTO.getToDate());
        leaveEntity.setReason(leaveDTO.getReason());
        return leaveEntity;
    }

    public ResponseMessage getApplicant(String applicantName) {
        ResponseMessage responseMessage = new ResponseMessage();
        LeaveDTO leaveDTO = leaveDao.getApplicant(applicantName);
        if (leaveDTO != null) {
            responseMessage.setResponseStatus(1);
            responseMessage.setResponseDTO(leaveDTO);
        } else {
            responseMessage.setResponseStatus(0);
            responseMessage.setResponseText("No result found matching " + applicantName + " .Please " +
                    "search with different name");
        }
        return responseMessage;
    }
}
