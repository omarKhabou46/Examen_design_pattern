package com.enset;

import com.enset.models.Agent;

import java.util.HashMap;

public class AgentContainer {

    private HashMap<String, Agent> agentHashMap = new HashMap<>();
    private static volatile AgentContainer agentContainer;

    private AgentContainer() {}

    public void addAgent(Agent agent) {
        if (agentHashMap.containsKey(agent.getNom())) {
            throw new RuntimeException("cet agent est deja existe");
        }
        agentHashMap.put(agent.getNom(), agent);
    }

    public void removeAgent(Agent agent) {
        agentHashMap.remove(agent.getNom());
    }

    public Agent searchAgent(String nom) {
        if (!agentHashMap.containsKey(nom)) {
            throw new RuntimeException("cet agent n'existe pas");
        }
        return agentHashMap.get(nom);
    }

    public static AgentContainer getAgentContainer() {

        if (agentContainer == null) {
            synchronized (AgentContainer.class) {
                if (agentContainer == null) {
                    agentContainer = new AgentContainer();
                }
            }
        }
        return agentContainer;
    }
}
