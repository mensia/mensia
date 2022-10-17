package tn.esprit.springproject.Service;

import tn.esprit.springproject.Entitys.Equipe;

import java.util.List;

public interface IEquipeService {

public void deleteEquipe (int id );
public Equipe retriveEquipe (int id );
public List<Equipe> retriveAllEquipe ();
public Equipe updateEquipe (Equipe equipe);
public Equipe AddEquipe (Equipe equipe);
}

