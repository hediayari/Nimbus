package com.example.projetnimbus.Service.Classes;

import com.example.projetnimbus.DAO.Entities.Commande;
import com.example.projetnimbus.DAO.Entities.Pannier;
import com.example.projetnimbus.DAO.Repositories.PannierRepository;
import com.example.projetnimbus.Service.Interfaces.IPannierService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PannierService implements IPannierService {
    PannierRepository pannierRepository;

    @Override
    public Pannier ajouterpannier(Pannier pannier) {
        return pannierRepository.save(pannier);
    }

    @Override
    public Pannier modifierpannier(Pannier pannier) {
        return pannierRepository.save(pannier);
    }

    @Override
    public List<Pannier> Afficherpannier() {
        return pannierRepository.findAll();
    }

    @Override
    public Pannier AfficherpannierbyId(int pannierId) {
        return pannierRepository.findById(pannierId).get();
    }

    @Override
    public void deletepannierbyId(int pannierId) {
        pannierRepository.deleteById(pannierId);
    }

    @Override
    public void deleteAllpannier() {
        pannierRepository.deleteAll();
    }
}
