package tn.esprit.springproject.Entitys;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe ;
    private String nomEquipe ;
    @Enumerated(EnumType.STRING)
    private Niveau niveau ;
    @ManyToMany(mappedBy = "equipeSet")
    List<Etudiant> etudiantListEquipe ;
    @OneToOne(cascade = CascadeType.ALL) DetailEquipe detailEquipe ; // cascade pour que lor de la creation d une equipe on cree un detail instantanemet


}


