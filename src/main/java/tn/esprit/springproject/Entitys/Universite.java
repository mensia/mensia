package tn.esprit.springproject.Entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Universite {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idUniversite ;
        private String nomUniversite ;
}
