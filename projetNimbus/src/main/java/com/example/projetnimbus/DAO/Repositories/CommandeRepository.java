package com.example.projetnimbus.DAO.Repositories;

import com.example.projetnimbus.DAO.Entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository <Commande,Integer> {
}
