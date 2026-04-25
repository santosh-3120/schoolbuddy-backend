package com.edupulse.mapper;

import com.edupulse.dto.response.AttendanceResponseDTO;
import com.edupulse.entity.Attendance;

public class AttendanceMapper {

    public static AttendanceResponseDTO toDTO(Attendance attendance) {
        AttendanceResponseDTO dto = new AttendanceResponseDTO();
        dto.setId(attendance.getId());
        dto.setStudentId(attendance.getStudentId());
        dto.setStatus(attendance.getStatus());
        return dto;
    }
}