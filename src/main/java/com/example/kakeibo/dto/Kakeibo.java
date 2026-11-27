package com.example.kakeibo.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Kakeibo {
    private long id;
    private String title;
    private long amount;
    private String type;
    private String category;
    private LocalDate date;
    private String memo;
}
