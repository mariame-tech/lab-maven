package com.isi.dev.services.impl;

import com.isi.dev.services.ICommande;
import org.springframework.stereotype.Service;

@Service
public class CommandeImp implements ICommande {
    @Override
    public String getCommand() {
        return "Commande de vehicules";
    }
}
