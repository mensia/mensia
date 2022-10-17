package tn.esprit.springproject.Service;

import tn.esprit.springproject.Entitys.Departement;

import java.util.List;

public interface IDepartementService {

    public void deleteDepartement(int id ) ;
    public Departement retriveDepartement (int id);
    public List<Departement> retriveAllDepartement ();
    public Departement updateDepartement (Departement departement);
    public Departement AddDepartement(Departement departement);
}
