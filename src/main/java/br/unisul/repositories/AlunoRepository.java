package br.unisul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unisul.domain.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}