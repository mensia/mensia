package tn.esprit.springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entitys.Etudiant;
import tn.esprit.springproject.Service.IEtudiantService;

import java.util.List;

@RestController
public class EtudiantController {
    @Autowired
    IEtudiantService etudiantService ;
@DeleteMapping("/deleteEtudiant/{idEtudiant}")
    public void deleteEtudiant (@PathVariable("idEtudiant") int id ){
    etudiantService.deleteEtudiant(id);
}
@GetMapping("/getEtudiant/{idEtudiant}")
    public Etudiant retriveEtudiant(@PathVariable("idEtudiant") int id ){
    return etudiantService.retriveEtudiant(id);
}
@GetMapping("/getAllEtudiant")
    public List<Etudiant> retriveAllEtudiant (){
    return etudiantService.retriveAllEtudiant();
}
@PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant (@RequestBody Etudiant etudiant ){
    return etudiantService.updateEtudiant(etudiant);
}
@PostMapping("/addEtudiant")
    public Etudiant AddEtudiant (@RequestBody Etudiant etudiant ){
    return etudiantService.AddEtudiant(etudiant);
}

}
