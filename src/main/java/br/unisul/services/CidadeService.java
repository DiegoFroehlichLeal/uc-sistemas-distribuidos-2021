package br.unisul.services;

import br.unisul.domain.Cidade;
import br.unisul.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository repository;



    public List<Cidade> buscaPorNome(String nome){
        return repository.findByNome(nome);
    }
    public List<Cidade> buscaPorUF(String uf){
        return repository.findByUf(uf);
    }
    public void insereCidade(Cidade c){
        repository.save(c);
    }
    public List<Cidade> listaTodos(){
        return repository.findAll();
    }
    public Cidade buscaPorId(Integer id){
        return repository.findById(id).get();
    }

    public void exclui(Integer id){
        Cidade c = buscaPorId(id);
        if(c!=null)
            repository.delete(c);
    }

    public Cidade altera(Integer id, Cidade c){
        Cidade bd = buscaPorId(id);
        bd.setNome(c.getNome());
        bd.setUf(c.getUf());
        repository.save(bd);
        return bd;
    }




}