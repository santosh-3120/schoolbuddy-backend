package com.edupulse.controller;

import com.edupulse.dto.request.AttendanceRequestDTO;
import com.edupulse.dto.response.AttendanceResponseDTO;
import com.edupulse.service.attendance.AttendanceService;
import com.edupulse.util.ApiResponse;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/attendance")
@CrossOrigin("*")
public class AttendanceController {

    private final AttendanceService service;

    public AttendanceController(AttendanceService service) {
        this.service = service;
    }

    @PostMapping
    public ApiResponse<AttendanceResponseDTO> markAttendance(
            @Valid @RequestBody AttendanceRequestDTO request) {

        AttendanceResponseDTO response = service.markAttendance(request);

        return new ApiResponse<>(
                true,
                "Attendance marked successfully",
                response
        );
    }
}