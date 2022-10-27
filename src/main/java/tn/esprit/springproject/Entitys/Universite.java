package tn.esprit.springproject.Entitys;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Universite implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idUniversite ;
        private String nomUniversite ;
        @OneToMany(cascade = CascadeType.ALL)

        Set<Departement> departementSet ;
}


