package tn.esprit.springproject.Entitys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetailEquipe ;
    private int salle ;
    private String thematique ;

    @OneToOne(mappedBy = "detailEquipe") @JsonIgnore Equipe equipe ; // jsonignore pour eviter une boucle infini dans l affichage


}

