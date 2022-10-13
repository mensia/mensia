package tn.esprit.springproject.Entitys;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Etudiant implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant ;
    private String prenomE ;
    private String nomE ;
    @Enumerated(EnumType.STRING)
    private Option op ;
    @ManyToOne
    private Departement dep ;
    @ManyToMany
    Set<Equipe> equipeSet ;
    @OneToMany(mappedBy = "etudiantContrat")
    Set<Contrat> contratSet ;


}
