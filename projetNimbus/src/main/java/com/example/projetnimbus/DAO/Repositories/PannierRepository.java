package com.example.projetnimbus.DAO.Repositories;

import com.example.projetnimbus.DAO.Entities.Commande;
import com.example.projetnimbus.DAO.Entities.Pannier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PannierRepository extends JpaRepository<Pannier,Integer> {

}
