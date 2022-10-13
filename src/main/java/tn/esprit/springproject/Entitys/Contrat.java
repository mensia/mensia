package tn.esprit.springproject.Entitys;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat ;
    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat ;
    @Temporal(TemporalType.DATE)
    private Date datefinContrat ;
    private boolean archive ;
    private int montant ;
    @Enumerated(EnumType.STRING)
    private Specialite specialite ;
    @ManyToOne Etudiant etudiantContrat ;
}

