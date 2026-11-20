package com.enset.adapter;

import com.enset.AgentContainer;

public class Adapter implements HDMI {

    private VGA vga;

    @Override
    public void afficher(AgentContainer agentContainer) {
        vga.afficher(agentContainer);
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }
}
