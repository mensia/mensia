package tn.esprit.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entitys.DetailEquipe;
import tn.esprit.springproject.Repository.DetailEquipeRepository;

import java.util.List;

@Service
public class DetailEquipeServiceImplement implements IDetailEquipeService{
    @Autowired
    DetailEquipeRepository detailEquipeRepository ;
    @Override
    public void deleteDetailEquipe(int id) {
        detailEquipeRepository.deleteById(id);
    }

    @Override
    public DetailEquipe retriveDetailEquipe(int id) {
        return detailEquipeRepository.findById(id).orElse(null);
    }

    @Override
    public List<DetailEquipe> retriveAllDetailEquipe() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe updateDetailEquipe(DetailEquipe detailEquipe) {
        return detailEquipeRepository.save(detailEquipe);
    }

    @Override
    public DetailEquipe AddDetailEquipe(DetailEquipe detailEquipe) {
        return detailEquipeRepository.save(detailEquipe);
    }

}
