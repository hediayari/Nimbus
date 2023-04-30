package com.example.projetnimbus.RestController;

import com.example.projetnimbus.DAO.Entities.Commande;
import com.example.projetnimbus.Service.Interfaces.ICommandeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Commande")
public class CommandeRestController {
    ICommandeService iCommandeService;

  @PostMapping("/ajoutercmd")
  public Commande ajouterCmd(Commande commande) {
      return iCommandeService.ajouterCmd(commande);
  }
  @PutMapping("/modifiercmd")
  public Commande modifierCmd(Commande commande)
  {
      return iCommandeService.modifierCmd(commande);
  }
@GetMapping("/affichercmd")
public List<Commande> Affichercmd()
    {
        return iCommandeService.Affichercmd();
    }
    @GetMapping("/afficherbyid")
    public Commande AfficherbyId(int cmdId) {
      return iCommandeService.AfficherbyId(cmdId);
    }
    @DeleteMapping("/supprimercmdbyid")
    public void deletecmdbyId(int cmdId){
       iCommandeService.deletecmdbyId(cmdId);
    }
    @DeleteMapping("/supprimercmdall")
    public void deleteAll(){
      iCommandeService.deleteAll();
    }
}
