package br.unisul.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.unisul.domain.Aluno;
import br.unisul.domain.Professor;
import br.unisul.domain.Cidade;
import br.unisul.repositories.AlunoRepository;
import br.unisul.repositories.CidadeRepository;


@Service
public class AlunoService {


	@Autowired
    AlunoRepository repository;

    @Autowired
    CidadeRepository cidadeRepository;



    public List<Aluno> buscaPorNome(String nome){
        return repository.findByNome(nome);
    }

    public List<Aluno> listaTodos() {
        return repository.findAll();
    }

    public void addAluno(Aluno a) {
        Cidade c = cidadeRepository.getById(a.getCidade().getId());
        if(c != null) {
            a.setCidade(c);
            repository.save(a);
        }
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
        Cidade c = cidadeRepository.getById(a.getCidade().getId());
        if(c != null){
            a.setCidade(c);
            repository.save(bd);

            return bd;
        }

        return null;


    }
    public List<Aluno> findByNome(String nome){
        return repository.findByNome(nome);
    }

}
