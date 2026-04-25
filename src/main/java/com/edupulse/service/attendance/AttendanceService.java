package com.edupulse.service.attendance;

import com.edupulse.dto.request.AttendanceRequestDTO;
import com.edupulse.dto.response.AttendanceResponseDTO;

public interface AttendanceService {

    AttendanceResponseDTO markAttendance(AttendanceRequestDTO request);
}