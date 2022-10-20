package tn.esprit.springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entitys.DetailEquipe;
import tn.esprit.springproject.Service.IDetailEquipeService;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
public class DetailEquipeController {
    @Autowired
    IDetailEquipeService detailEquipeService ;
    @DeleteMapping("/deleteDetailEquipe/{idDetailEquipe}")
    void deleteDetailEquipe (@PathVariable("idDetailEquipe") int id){
        detailEquipeService.deleteDetailEquipe(id);
    }
    @GetMapping("/getDetailEquipe/{idDetailEquipe}")
    public DetailEquipe retriveDetailEquipe (@PathVariable("idDetailEquipe") int id ){
        return detailEquipeService.retriveDetailEquipe(id);
    }
    @GetMapping("getAllDetailEquipe")
    public List<DetailEquipe> retriveAllDetailEquipe (){
        return detailEquipeService.retriveAllDetailEquipe();
    }
    @PutMapping("/updateDetailEquipe")
    public DetailEquipe updateDetailEquipe (@RequestBody  DetailEquipe detailEquipe){
        return detailEquipeService.updateDetailEquipe(detailEquipe);
    }
    @PostMapping("/addDetailEquipe")
    public DetailEquipe AddDetailEquipe (@RequestBody DetailEquipe detailEquipe){
        return detailEquipeService.AddDetailEquipe(detailEquipe);
    }
}
