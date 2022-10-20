package tn.esprit.springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entitys.Departement;
import tn.esprit.springproject.Service.IDepartementService;

import java.util.List;

@RestController
public class DepartementController {
    @Autowired
    IDepartementService departementService ;
    @DeleteMapping("/deleteDepartenet/{idDepartement}")
    public void deleteDepartement(@PathVariable("idDepartement") int id ) {
        departementService.deleteDepartement(id);
    }
    @GetMapping("/getDepartemt/{idDepartement}")
    public Departement retriveDepartement (@PathVariable("idDepartement") int id){
        return  departementService.retriveDepartement(id);
    }
    @GetMapping("/getAllDepartement")
    public List<Departement> retriveAllDepartement (){
        return departementService.retriveAllDepartement();
    }
    @PutMapping("/updateDepartement")
    public Departement updateDepartement (@RequestBody Departement departement){
        return departementService.updateDepartement(departement);
    }
    @PostMapping("/addDepartement")
    public Departement AddDepartement(@RequestBody Departement departement){
        return departementService.AddDepartement(departement);
    }



}
