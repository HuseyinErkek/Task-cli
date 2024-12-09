package com.example.Task_cli.Entity;

import com.beust.jcommander.Parameter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Task {
    private int id;
    private String title;
    private String description;
    private String priority; // Low, Medium, High
    private String status;   // To Do, In Progress, Done
    private LocalDate dueDate;
}
