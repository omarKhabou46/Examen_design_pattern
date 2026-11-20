package com.enset.strategy;

import com.enset.models.Agent;
import com.enset.models.Transaction;

public interface TraitementNotification {

    void traiterNotification(String nom, Transaction transaction, Agent subscriber);
}
