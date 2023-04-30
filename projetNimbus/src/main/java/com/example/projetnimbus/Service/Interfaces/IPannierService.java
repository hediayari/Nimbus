package com.example.projetnimbus.Service.Interfaces;

import com.example.projetnimbus.DAO.Entities.Commande;
import com.example.projetnimbus.DAO.Entities.Pannier;

import java.util.List;

public interface IPannierService {
    Pannier ajouterpannier (Pannier pannier);
    Pannier modifierpannier (Pannier pannier);
    List<Pannier> Afficherpannier ();
    Pannier AfficherpannierbyId (int pannierId);
    void deletepannierbyId (int pannierId);
    void deleteAllpannier();
}
