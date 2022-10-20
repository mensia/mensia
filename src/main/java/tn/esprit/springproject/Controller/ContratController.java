package tn.esprit.springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entitys.Contrat;
import tn.esprit.springproject.Service.IContratService;

import java.util.List;

//@Controller + @ResponseBody
@RestController
public class ContratController  {
    @Autowired
    IContratService contratService ; // assurer le faible couplage
    @DeleteMapping("/deleteContrat/{idContrat}")
    public void deleteContrat(@PathVariable("idContrat") int id ) {
        contratService.deleteContrat(id);
    }
    @GetMapping("/getContrat/{idContrat}")

    public Contrat retriveContart (@PathVariable("idContrat") int id ){
        return contratService.retriveContart(id);
    }
    @GetMapping("/getAllContrat")
    public List<Contrat> retrieveAllContrat(){
        return contratService.retrieveAllContrat();
    }
    @PutMapping("/updateContrat")
    public Contrat updateContrat (@RequestBody Contrat contrat) {
        return contratService.updateContrat(contrat);
    }


    @PostMapping("/addContract")
    public Contrat AddContrat (@RequestBody Contrat contrat){ // si on va injecte dans la base de donnee
        return contratService.AddContrat(contrat) ;

    }
}
