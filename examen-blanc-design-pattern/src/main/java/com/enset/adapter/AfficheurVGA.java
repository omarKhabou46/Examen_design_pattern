package com.enset.adapter;

import com.enset.AgentContainer;

public class AfficheurVGA implements VGA {
    @Override
    public void afficher(AgentContainer agentContainer) {
        System.out.println("affciher utilisant VGA");
    }
}
