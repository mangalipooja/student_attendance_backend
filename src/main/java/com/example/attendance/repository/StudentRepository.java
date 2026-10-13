package com.example.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.attendance.Student;

public interface StudentRepository
        extends JpaRepository<Student, Long> {
}
