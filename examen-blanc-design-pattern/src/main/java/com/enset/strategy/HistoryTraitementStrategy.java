package com.enset.strategy;

import com.enset.models.Agent;
import com.enset.models.Transaction;
import com.enset.models.enums.TrasactionType;

public class HistoryTraitementStrategy implements TraitementNotification {

    @Override
    public void traiterNotification(String nom, Transaction transaction, Agent subscriber) {
      subscriber.addTransactionToHistory(transaction);
    }
}
