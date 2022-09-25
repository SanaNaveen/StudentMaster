package com.study.MasterStudent.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.MasterStudent.MasterDto.MasterStudentDto;
import com.study.MasterStudent.MasterDto.ResponseDto;
import com.study.MasterStudent.service.StudentMasterService;

@RestController
public class StudentMasterController {
	
	private Logger logger = LoggerFactory.getLogger(StudentMasterController.class);
	
	@Resource
	private StudentMasterService studentMasterService;

	@PostMapping(value = "getStudentDetails")
	public ResponseEntity<ResponseDto> getStudentDetails(@RequestBody MasterStudentDto masterStudentDto){
		
		logger.info("Enter into getStudentDetails Controller");
		
		ResponseDto  responseDto = new ResponseDto();
		
		responseDto = studentMasterService.getStudentDetails(masterStudentDto);
		
		logger.info("Exit into getStudentDetails Controller");
		
		return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
	}
	
}
