package com.study.MasterStudent.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.study.MasterStudent.MasterDto.MasterStudentDto;
import com.study.MasterStudent.MasterDto.ResponseDto;
import com.study.MasterStudent.service.StudentMasterService;


@Service
public class StudentMasterServiceImpl implements StudentMasterService{
	
	private Logger logger = LoggerFactory.getLogger(StudentMasterServiceImpl.class);

	@Override
	public ResponseDto getStudentDetails(MasterStudentDto masterData) {
		
		logger.info("StudentMasterServiceImpl : Enter into getStudentDetails");
		
		ResponseDto responseDto = new ResponseDto<>();
		
		MasterStudentDto masterStudentDto = new MasterStudentDto();
		
		if(null != masterData.getId()) {
			try {
				masterStudentDto.setId("101");
				masterStudentDto.setFristName("Sana Naveen");
				masterStudentDto.setLastName("D");
				masterStudentDto.setEmail("Test@test.com");
			} catch (Exception e) {
				logger.error("StudentMasterServiceImpl : Error into getStudentDetails",e);
			}
			
			
		}
		
		logger.info("StudentMasterServiceImpl : Exit into getStudentDetails");
		responseDto.setResponseData(masterStudentDto);
	
		
		
		return responseDto;
	}
	
	
	

}
