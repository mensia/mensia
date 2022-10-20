package tn.esprit.springproject.Service;

import tn.esprit.springproject.Entitys.Contrat;

import java.util.List;

public interface IContratService {
    public void deleteContrat(int id ) ;
    public Contrat retriveContart (int id );
    public List<Contrat> retrieveAllContrat();
    public Contrat updateContrat (Contrat contrat) ;
    public Contrat AddContrat (Contrat contrat);


}
