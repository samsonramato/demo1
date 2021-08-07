package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Component
public class StudentService {
    public List<Student> getStudent() {
        return List.of(new Student(1L,
                        "Samson",
                        35,
                        LocalDate.of(2000, Month.JANUARY, 5),
                        "samson@gmail.com"),
                new Student(2L,
                        "Ramato",
                        60,
                        LocalDate.of(2001, Month.MARCH, 5),
                        "ramato@gmail.com"));
    }
}
