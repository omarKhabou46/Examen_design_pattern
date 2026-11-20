package com.enset.strategy;

import com.enset.models.Agent;
import com.enset.models.Transaction;
import com.enset.models.enums.TrasactionType;

public class ScoringTraitementStrategy implements TraitementNotification {

    @Override
    public void traiterNotification(String nom, Transaction transaction, Agent subscriber) {
     if (transaction.getType() == TrasactionType.VENTE) {
         subscriber.setSolde(subscriber.getSolde() + transaction.getMontant());
     }else {
         subscriber.setSolde(subscriber.getSolde() - transaction.getMontant());
     }
    }
}
