package com.yulken.osworks.domain.model;

import java.time.LocalDateTime;

public class Comment {
    private Long id;
    private String description;
    private LocalDateTime sendDate;
    private ServiceOrder so;

    public Comment(String description, LocalDateTime sendDate) {
        this.description = description;
        this.sendDate = sendDate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getSendDate() {
        return this.sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }


    public ServiceOrder getSo() {
        return this.so;
    }

    public void setSo(ServiceOrder so) {
        this.so = so;
    }

}