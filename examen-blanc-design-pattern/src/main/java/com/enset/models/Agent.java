package com.enset.models;

import com.enset.annotations.Cachable;
import com.enset.annotations.SecuredBy;
import com.enset.strategy.ScoringTraitementStrategy;
import com.enset.strategy.TraitementNotification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Agent {
    private String nom;
    private List<Transaction> transactions = new ArrayList<>();
    private List<Agent> subscribers = new ArrayList<>();
    private TraitementNotification strategy = new ScoringTraitementStrategy();
    private List<Transaction> history = new ArrayList<>();
    private double solde;

    public Agent(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        notifier(transaction);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void addTransactionToHistory(Transaction transaction) {
        history.add(transaction);
    }

    public void enregistrer(Agent agent) {
        subscribers.add(agent);
    }

    public void supprimer(Agent agent) {
        subscribers.remove(agent);
    }

    public void notifier(Transaction transaction) {
        for (Agent subscriber : subscribers) {
            subscriber.strategy.traiterNotification(nom, transaction, subscriber);
        }
    }


    @Override
    public String toString() {
        return "Agent{" +
                "nom='" + nom + '\'' +
                ", transactions=" + transactions +
                '}';
    }

    //@Cachable
    //@Log
    @SecuredBy(roles = {"ADMIN"})
    public Transaction getBiggestAmmountTransaction() {
        return transactions.stream().max(Comparator.naturalOrder()).get();
    }
}
