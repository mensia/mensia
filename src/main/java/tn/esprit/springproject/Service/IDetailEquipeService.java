package tn.esprit.springproject.Service;

import tn.esprit.springproject.Entitys.DetailEquipe;
import tn.esprit.springproject.Entitys.Equipe;

import java.util.List;

public interface IDetailEquipeService {
    public void deleteDetailEquipe (int id);
    public DetailEquipe retriveDetailEquipe (int id );
    public List<DetailEquipe> retriveAllDetailEquipe ();
    public DetailEquipe updateDetailEquipe (DetailEquipe detailEquipe);
    public DetailEquipe AddDetailEquipe (DetailEquipe detailEquipe);
}
