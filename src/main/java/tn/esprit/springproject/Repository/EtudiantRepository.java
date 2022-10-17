package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.Entitys.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant , Integer> {

}
