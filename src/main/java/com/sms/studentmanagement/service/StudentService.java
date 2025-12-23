package com.sms.studentmanagement.service;

import com.sms.studentmanagement.dto.StudentRequestDTO;
import com.sms.studentmanagement.dto.StudentResponseDTO;

import java.util.List;

public interface StudentService {

    StudentResponseDTO addStudent(StudentRequestDTO dto);

    List<StudentResponseDTO> getAllStudents();

    StudentResponseDTO getStudentById(Long id);

    StudentResponseDTO updateStudent(Long id, StudentRequestDTO dto);

    void deleteStudent(Long id);
}
