package tn.esprit.springproject.Service;

import tn.esprit.springproject.Entitys.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public void deleteEtudiant (int id );
    public Etudiant retriveEtudiant(int id );
    public List<Etudiant> retriveAllEtudiant ();
    public Etudiant updateEtudiant (Etudiant etudiant );

    public Etudiant AddEtudiant (Etudiant etudiant );

}
