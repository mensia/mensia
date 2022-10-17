package tn.esprit.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entitys.Etudiant;
import tn.esprit.springproject.Repository.EtudiantRepository;

import java.util.List;
@Service
public class EtudiantServiceImplement implements IEtudiantService{
@Autowired
    EtudiantRepository etudiantRepository ;
    @Override
    public void deleteEtudiant(int id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant retriveEtudiant(int id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Etudiant> retriveAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant AddEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
