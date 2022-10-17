package tn.esprit.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entitys.Equipe;
import tn.esprit.springproject.Repository.EquipeRepository;

import java.util.List;

@Service
public class EquipeServiceImplement implements IEquipeService {
  @Autowired
    EquipeRepository equipeRepository ;

    @Override
    public void deleteEquipe(int id) {
        equipeRepository.deleteById(id);

    }

    @Override
    public Equipe retriveEquipe(int id) {
        return equipeRepository.findById(id).orElse(null);

    }

    @Override
    public List<Equipe> retriveAllEquipe() {
        return equipeRepository.findAll();

    }

    @Override
    public Equipe updateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe AddEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }
}
