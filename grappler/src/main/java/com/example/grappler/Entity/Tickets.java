package com.example.grappler.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)@Column(name ="ticketId",nullable=false )Long ticketId;

    @ManyToMany
    @JoinTable(name = "ticket_user",
            joinColumns = @JoinColumn(name = "ticketId"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<Users> users;

    @ManyToOne
    private AssignmentHistory assignmentHistory;

    @OneToMany(mappedBy = "tickets" ,cascade=CascadeType.ALL)
    private List<Worklogs> worklogs;

    @OneToMany(mappedBy = "tickets" ,cascade=CascadeType.ALL)
    private List<Ticket_assign>  ticket_assign ;

    @ManyToOne
    @JoinColumn(name = "projectId")
    @JsonIgnore
    private Projects projects;

    @OneToMany(mappedBy = "tickets",cascade =CascadeType.ALL)
    @JsonIgnore
    private List<Planed> planed;

     String title;
     String desciption;
    private LocalDateTime estimatedTime;
    String priority;
    private LocalDateTime start_time;
    private LocalDateTime end_time;

    private List<Long> userIds;

    public List<Long> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public LocalDateTime getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(LocalDateTime estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    public AssignmentHistory getAssignmentHistory() {
        return assignmentHistory;
    }

    public void setAssignmentHistory(AssignmentHistory assignmentHistory) {
        this.assignmentHistory = assignmentHistory;
    }

    public List<Worklogs> getWorklogs() {
        return worklogs;
    }

    public void setWorklogs(List<Worklogs> worklogs) {
        this.worklogs = worklogs;
    }

    public List<Ticket_assign> getTicket_assign() {
        return ticket_assign;
    }

    public void setTicket_assign(List<Ticket_assign> ticket_assign) {
        this.ticket_assign = ticket_assign;
    }

    public List<Planed> getPlaned() {
        return planed;
    }

    public void setPlaned(List<Planed> planed) {
        this.planed = planed;
    }
}
