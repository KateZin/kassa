package ru.zinyakova.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class Schedule {
    private Long id;
    private Date date;
}
