package tn.esprit.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entitys.Departement;
import tn.esprit.springproject.Repository.DepartementRepository;

import java.util.List;
@Service
public class DepartementServiceImplement implements IDepartementService {

    @Autowired
    DepartementRepository departementRepository ;

    @Override
    public void deleteDepartement(int id) {
        departementRepository.deleteById(id);
    }

    @Override
    public Departement retriveDepartement(int id) {
        return departementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Departement> retriveAllDepartement() {
        return departementRepository.findAll();
    }

    @Override
    public Departement updateDepartement(Departement departement) {
        return departementRepository.save(departement);

    }

    @Override
    public Departement AddDepartement(Departement departement) {
        return departementRepository.save(departement);
    }
}
