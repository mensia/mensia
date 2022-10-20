package tn.esprit.springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entitys.Equipe;
import tn.esprit.springproject.Service.IEquipeService;

import java.util.List;

@RestController
public class EquipeController {
    @Autowired
    IEquipeService equipeService ;
    @DeleteMapping("/deleteEquipe/{idEquipe}")
    public void deleteEquipe (@PathVariable("idEquipe") int id ){
        equipeService.deleteEquipe(id);
    }
    @GetMapping("/getEquipe/{idEquipe}")
    public Equipe retriveEquipe (@PathVariable("idEquipe") int id ){
        return  equipeService.retriveEquipe(id);
    }
    @GetMapping("/getAllEquipe")
    public List<Equipe> retriveAllEquipe (){
        return equipeService.retriveAllEquipe();
    }
    @PutMapping("/updateEquipe")
    public Equipe updateEquipe (@RequestBody Equipe equipe){
        return equipeService.updateEquipe(equipe);
    }
    @PostMapping("/addContrat")
    public Equipe AddEquipe (@RequestBody Equipe equipe){
        return equipeService.AddEquipe(equipe);
    }

}
