package com.enset.models;

import com.enset.models.enums.TrasactionType;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private LocalDateTime date;
    private double montant;
    private TrasactionType type;

    public Transaction() {}

    public Transaction(String id, TrasactionType type, LocalDateTime date, double montant) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.montant = montant;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public TrasactionType getType() {
        return type;
    }

    public void setType(TrasactionType type) {
        this.type = type;
    }


}
