package com.example.projetnimbus.Service.Interfaces;

import com.example.projetnimbus.DAO.Entities.Commande;

import java.util.List;

public interface ICommandeService {
    Commande ajouterCmd (Commande commande);
    Commande modifierCmd ( Commande commande);
    List<Commande> Affichercmd ();
    Commande AfficherbyId (int cmdId);
    void deletecmdbyId (int cmdId);
    void deleteAll();
}
