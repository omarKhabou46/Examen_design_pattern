package com.enset.strategy;

import com.enset.models.Agent;
import com.enset.models.Transaction;

public class HistoryTraitementStrategy implements TraitementNotification {

    @Override
    public void traiterNotification(String nom, Transaction transaction, Agent subscriber) {
      subscriber.addTransactionToHistory(transaction);
    }
}
