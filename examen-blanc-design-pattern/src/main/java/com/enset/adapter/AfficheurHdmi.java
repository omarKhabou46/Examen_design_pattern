package com.enset.adapter;

import com.enset.AgentContainer;

public class AfficheurHdmi implements HDMI{

    @Override
    public void afficher(AgentContainer agentContainer) {
        System.out.println("afficher utilisant HDMI");
    }
}
