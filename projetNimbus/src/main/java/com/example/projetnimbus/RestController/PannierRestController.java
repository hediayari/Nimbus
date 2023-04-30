package com.example.projetnimbus.RestController;

import com.example.projetnimbus.DAO.Entities.Commande;
import com.example.projetnimbus.DAO.Entities.Pannier;
import com.example.projetnimbus.Service.Interfaces.ICommandeService;
import com.example.projetnimbus.Service.Interfaces.IPannierService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Pannier")
public class PannierRestController {
    IPannierService iPannierService;

    @PostMapping("/ajouterpannier")
    public Pannier ajouterpannier(Pannier pannier) {
        return iPannierService.ajouterpannier(pannier);
    }
    @PutMapping("/modifierpannier")
    public Pannier modifierpannier(Pannier pannier)
    {
        return iPannierService.modifierpannier(pannier);
    }
    @GetMapping("/afficherpannier")
    public List<Pannier> Afficherpannier()
    {
        return iPannierService.Afficherpannier();
    }
    @GetMapping("/afficherpannierbyid")
    public Pannier AfficherpannierbyId(int pannierId) {
        return iPannierService.AfficherpannierbyId(pannierId);
    }
    @DeleteMapping("/supprimerpannierbyid")
    public void deletepannierbyId(int pannierId){
        iPannierService.deletepannierbyId(pannierId);
    }
    @DeleteMapping("/supprimerpannierall")
    public void deleteAllpannier(){
        iPannierService.deleteAllpannier();
    }

}
