package com.example.projetnimbus.Service.Classes;

import com.example.projetnimbus.DAO.Entities.Commande;
import com.example.projetnimbus.DAO.Repositories.CommandeRepository;
import com.example.projetnimbus.Service.Interfaces.ICommandeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CommandeService implements ICommandeService {

    CommandeRepository commandeRepository;

    @Override
    public Commande ajouterCmd(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande modifierCmd(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public List<Commande> Affichercmd() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande AfficherbyId(int cmdId) {
        return commandeRepository.findById(cmdId).get();
    }

    @Override
    public void deletecmdbyId(int cmdId) {
        commandeRepository.deleteById(cmdId);
    }

    @Override
    public void deleteAll() {
    commandeRepository.deleteAll();
    }
}
