package tn.esprit.springproject.Service;

import tn.esprit.springproject.Entitys.Universite;

import java.util.List;

public interface IUniversiteService {
    public void deleteUniversite (int id );
    public Universite retriveUniversite (int id );
    public List<Universite> retriveAllUniversite ();
    public Universite updateUniversite (Universite universite);
    public  Universite AddUniversite (Universite universite);
}
