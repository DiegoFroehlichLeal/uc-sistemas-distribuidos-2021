package br.unisul.repositories;


import br.unisul.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

   public List<Cidade> findByNome(String nome);
   public List<Cidade> findByUf(String uf);

}