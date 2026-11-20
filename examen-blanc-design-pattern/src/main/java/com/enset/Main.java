package com.enset;

import com.enset.models.Agent;
import com.enset.models.Transaction;
import com.enset.models.enums.TransactionType;
import com.enset.security.SecurityContext;

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
                .id("trs2")
                .date(LocalDateTime.now())
                .montant(500)
                .type(TransactionType.VENTE)
                .build();

        agent.addTransaction(transaction1);
        agent.addTransaction(transaction2);


        Agent agent2 = new Agent("ahmed");

        Transaction transaction3 = Transaction.builder()
                .id("trs3")
                .date(LocalDateTime.now())
                .montant(200)
                .type(TransactionType.ACHAT)
                .build();

        Transaction transaction4 = Transaction.builder()
                .id("trs4")
                .date(LocalDateTime.now())
                .montant(800)
                .type(TransactionType.VENTE)
                .build();

        agent2.addTransaction(transaction3);
        agent2.addTransaction(transaction4);


        Agent agent3 = new Agent("youssef");

        Transaction transaction5 = Transaction.builder()
                .id("trs5")
                .date(LocalDateTime.now())
                .montant(300)
                .type(TransactionType.ACHAT)
                .build();

        Transaction transaction6 = Transaction.builder()
                .id("trs6")
                .date(LocalDateTime.now())
                .montant(600)
                .type(TransactionType.VENTE)
                .build();

        agent3.addTransaction(transaction5);
        agent3.addTransaction(transaction6);


// Tests du cache
        System.out.println("=== Agent Omar ===");
        System.out.println(agent.getBiggestAmmountTransaction());
//        System.out.println(agent.getBiggestAmmountTransaction());

//        System.out.println("=== Agent Ahmed ===");
//        System.out.println(agent2.getBiggestAmmountTransaction());
//        System.out.println(agent2.getBiggestAmmountTransaction());
//
//        System.out.println("=== Agent Youssef ===");
//        System.out.println(agent3.getBiggestAmmountTransaction());
//        System.out.println(agent3.getBiggestAmmountTransaction());

        }
}