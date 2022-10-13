package tn.esprit.springproject.Entitys;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor // constructeur avec tt les attribue
@NoArgsConstructor // constructeur par default
@RequiredArgsConstructor // construvteur avec seulment les nonull
@Builder // constructeur avec autant d attribu que je desire
@ToString
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @NonNull
    private int idContrat ;
    @Temporal(TemporalType.DATE)
   // @NonNull
    private Date dateDebutContrat ;
    @Temporal(TemporalType.DATE)
    private Date datefinContrat ;
    private boolean archive ;
    private int montant ;
    @Enumerated(EnumType.STRING)
    private Specialite specialite ;
    @ManyToOne Etudiant etudiantContrat ;

    // Contrat c = new Contrat.Builder().attribueVolue(true) ;
}

