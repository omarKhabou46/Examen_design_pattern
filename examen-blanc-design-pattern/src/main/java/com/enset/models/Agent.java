package com.enset.models;

import java.util.ArrayList;
import java.util.List;

public class Agent {
    private String nom;
    private List<Transaction> transactions = new ArrayList<>();
    private List<Agent> subscribers = new ArrayList<>();


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void enregistrer(Agent agent) {
        subscribers.add(agent);
    }

    public void supprimer(Agent agent) {
        subscribers.remove(agent);
    }


}
