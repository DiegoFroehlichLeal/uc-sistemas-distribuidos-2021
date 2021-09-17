package br.unisul.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.unisul.domain.Aluno;
import br.unisul.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	
	@Autowired
    AlunoRepository repository;

    public List<Aluno> listAll() {
        return repository.findAll();
    }

    public void addAluno(Aluno a) {
        repository.save(a);
    }

    public Aluno buscaPorId(Integer id) {
        return repository.findById(id).get();
    }

    public void excluir(Integer id) {
        Aluno a = buscaPorId(id);
        if (a != null)
            repository.delete(a);
    }

    public Aluno altera(Integer id, Aluno a){
        Aluno bd = buscaPorId(id);
        bd.setNome(a.getNome());
        bd.setN1(a.getN1());
        bd.setN2(a.getN2());
        bd.setN3(a.getN3());
        repository.save(bd);
        return bd;

    }

}
