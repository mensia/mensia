package tn.esprit.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entitys.Universite;
import tn.esprit.springproject.Repository.UniversiteRepository;

import java.util.List;

@Service
public class UniversiteServiceImplement implements IUniversiteService{
    @Autowired
    UniversiteRepository universiteRepository;
    @Override
    public void deleteUniversite(int id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public Universite retriveUniversite(int id) {
        return universiteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Universite> retriveAllUniversite() {

        return universiteRepository.findAll();
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite AddUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

}
