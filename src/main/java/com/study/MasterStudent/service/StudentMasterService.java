package com.study.MasterStudent.service;

import com.study.MasterStudent.MasterDto.MasterStudentDto;
import com.study.MasterStudent.MasterDto.ResponseDto;

public interface StudentMasterService {
	
	public ResponseDto getStudentDetails(MasterStudentDto masterStudentDto);

}
