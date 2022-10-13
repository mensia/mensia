package tn.esprit.springproject.Entitys;

import javax.persistence.*;
import java.io.Serializable;

@Entity

public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetailEquipe ;
    private int salle ;
    private String thematique ;

    @OneToOne(mappedBy = "detailEquipe") Equipe equipe ;

}

