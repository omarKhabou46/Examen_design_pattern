package com.enset.builder;

import com.enset.models.Transaction;
import com.enset.models.enums.TransactionType;

import java.time.LocalDateTime;

public class TransactionBuilder {
    private String id;
    private LocalDateTime date;
    private double montant;
    private TransactionType type;
    private Transaction transaction;

    public TransactionBuilder id(String id) {
        this.id = id;
        return this;
    }

    public TransactionBuilder date(LocalDateTime date) {
        this.date = date;
        return this;
    }

    public TransactionBuilder montant(double montant) {
        this.montant = montant;
        return this;
    }

    public TransactionBuilder type(TransactionType type) {
        this.type = type;
        return this;
    }

    public Transaction build() {
        transaction = new Transaction(id, type, date, montant);
        return transaction;
    }
}
