package tn.esprit.springproject.Entitys;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity

public class Universite implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idUniversite ;
        private String nomUniversite ;
        @OneToMany
        Set<Departement> departementSet ;
}


