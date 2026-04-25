package com.edupulse.service.attendance;

import com.edupulse.dto.request.AttendanceRequestDTO;
import com.edupulse.dto.response.AttendanceResponseDTO;
import com.edupulse.entity.Attendance;
import com.edupulse.mapper.AttendanceMapper;
import com.edupulse.repository.AttendanceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    private final AttendanceRepository repository;

    public AttendanceServiceImpl(AttendanceRepository repository) {
        this.repository = repository;
    }

    @Override
    public AttendanceResponseDTO markAttendance(AttendanceRequestDTO request) {

        Attendance attendance = new Attendance();
        attendance.setStudentId(request.getStudentId());
        attendance.setStatus(request.getStatus());
        attendance.setDate(LocalDateTime.now());
        attendance.setMarkedBy(1L); // later replace with auth

        Attendance saved = repository.save(attendance);

        return AttendanceMapper.toDTO(saved);
    }
}