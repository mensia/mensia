package tn.esprit.springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entitys.Universite;
import tn.esprit.springproject.Service.IUniversiteService;

import java.util.List;

@RestController
public class UniversiteController {
    @Autowired
    IUniversiteService universiteService ;
    @DeleteMapping("/deleteUniversite/{idUniversite}")
    public void deleteUniversite (@PathVariable("idUniversite") int id ){
        universiteService.deleteUniversite(id);
    }
    @GetMapping("getUniversite/{idUniversite}")
    public Universite retriveUniversite (@PathVariable("idUniversite") int id ){
        return universiteService.retriveUniversite(id);
    }
    @GetMapping ("/getAllUniversite")
    public List<Universite> retriveAllUniversite (){
        return universiteService.retriveAllUniversite();
    }
    @PutMapping("/updateUniversite")
    public Universite updateUniversite (@RequestBody  Universite universite){
        return  universiteService.updateUniversite(universite);
    }
    @PostMapping("/addUniversite")
    public  Universite AddUniversite (@RequestBody  Universite universite){
        return universiteService.AddUniversite(universite);
    }
}
