package com.yulken.osworks.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.yulken.osworks.domain.enums.ServiceOrderStatus;

public class ServiceOrder {
    private Integer id;
    private String description;
    private BigDecimal price;
    private LocalDateTime openingDate;
    private LocalDateTime closingDate;
    private Client client;
    private ServiceOrderStatus sos;
    private List<Comment> comments = new ArrayList<>();

    public ServiceOrder(String description, BigDecimal price, LocalDateTime openingDate, LocalDateTime closingDate) {
        this.description = description;
        this.price = price;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getOpeningDate() {
        return this.openingDate;
    }

    public void setOpeningDate(LocalDateTime openingDate) {
        this.openingDate = openingDate;
    }

    public LocalDateTime getClosingDate() {
        return this.closingDate;
    }

    public void setClosingDate(LocalDateTime closingDate) {
        this.closingDate = closingDate;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ServiceOrderStatus getSos() {
        return this.sos;
    }

    public void setSos(ServiceOrderStatus sos) {
        this.sos = sos;
    }

    public List<Comment> getComments() {
        return this.comments;
    }
    
    public void addComment(Comment comment){
        this.comments.add(comment);
    }

    public void removeComment(Comment comment){
        this.comments.remove(comment);
    }
}
