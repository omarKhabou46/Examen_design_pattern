package com.enset.models;

import com.enset.builder.TransactionBuilder;
import com.enset.models.enums.TransactionType;

import java.time.LocalDateTime;

public class Transaction implements Comparable<Transaction>{
    private String id;
    private LocalDateTime date;
    private double montant;
    private TransactionType type;

    public Transaction() {}

    public Transaction(String id, TransactionType type, LocalDateTime date, double montant) {
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

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public static TransactionBuilder builder() {
        return new TransactionBuilder();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", montant=" + montant +
                ", type=" + type +
                '}';
    }

    @Override
    public int compareTo(Transaction o) {
        if (o.getMontant() == this.getMontant()) return 0;
        else if (this.getMontant() < o.getMontant()) return -1;
        return 1;
    }
}
