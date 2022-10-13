package tn.esprit.springproject.Service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entitys.Contrat;
import tn.esprit.springproject.Repository.ContratReposirory;

import java.util.List;
@Service
@AllArgsConstructor // si il n ya pas de @Autowired
public class ContratServiceImplement implements IContratService {

   // @Autowired non securise
    ContratReposirory contratReposirory ;

    @Override
    public void deleteContrat(int id) {
    contratReposirory.deleteById(id);
    }

    @Override
    public Contrat retriveContart(int id) {
        return contratReposirory.findById(id).orElse(null);
    }

    @Override
    public List<Contrat> retrieveAllContrat() {
        return contratReposirory.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratReposirory.save(contrat);
    }

    @Override
    public Contrat AddContrat(Contrat contrat) {
        return contratReposirory.save(contrat) ;
    }
}
