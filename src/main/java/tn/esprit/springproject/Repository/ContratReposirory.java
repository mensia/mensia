package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entitys.Contrat;

//@Repository annotetion optionnel
public interface ContratReposirory extends JpaRepository<Contrat , Integer> {


}
