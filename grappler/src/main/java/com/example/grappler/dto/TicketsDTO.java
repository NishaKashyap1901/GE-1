package com.example.grappler.dto;

import com.example.grappler.Entity.Worklogs;

import java.time.LocalDateTime;
import java.util.List;

public class TicketsDTO {
    private Long ticket_id;
    private String title;
    private String description;
    private LocalDateTime estimatedTime;
    private String priority;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<Long> userIds;
    private List<Worklogs> worklogs;

}

