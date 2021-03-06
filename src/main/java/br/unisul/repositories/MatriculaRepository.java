package br.unisul.repositories;

import br.unisul.domain.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {

}