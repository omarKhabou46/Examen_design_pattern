package com.enset;

import com.enset.models.Agent;
import com.enset.models.Transaction;
import com.enset.models.enums.TransactionType;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Agent agent = new Agent("omar");
        Transaction transaction1 = Transaction.builder()
                .id("trs1")
                .date(LocalDateTime.now())
                .montant(100)
                .type(TransactionType.VENTE)
                .build();
        Transaction transaction2 = Transaction.builder()
                .id("trs1")
                .date(LocalDateTime.now())
                .montant(500)
                .type(TransactionType.VENTE)
                .build();
        agent.addTransaction(transaction1);
        agent.addTransaction(transaction2);

        System.out.println(agent.getBiggestAmmountTransaction());

    }
}