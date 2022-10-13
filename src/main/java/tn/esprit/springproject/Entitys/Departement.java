package tn.esprit.springproject.Entitys;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

public class Departement implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idDepartement ;
        private String nomDepartement ;
        @OneToMany( mappedBy = "dep")
        List<Etudiant> etudiantListDepartement ;
}


