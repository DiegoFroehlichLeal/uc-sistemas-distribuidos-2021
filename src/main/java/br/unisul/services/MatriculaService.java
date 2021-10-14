package br.unisul.services;

import br.unisul.domain.Aluno;
import br.unisul.domain.Disciplina;
import br.unisul.domain.Matricula;
import br.unisul.domain.Cidade;
import br.unisul.repositories.AlunoRepository;
import br.unisul.repositories.DisciplinaRepository;
import br.unisul.repositories.MatriculaRepository;
import br.unisul.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {

    @Autowired
    MatriculaRepository repository;

    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    DisciplinaRepository disciplinaRepository;

    public void insert(Matricula matricula){
        Aluno aluno = alunoRepository.getById(matricula.getId().getAluno().getId());
        Disciplina disciplina = disciplinaRepository.getById(matricula.getId().getDisciplina().getId());

        if(aluno != null && disciplina != null){
            matricula.getId().setAluno(aluno);
            matricula.getId().setDisciplina(disciplina);
            repository.save(matricula);
        }
    }

    public List<Matricula> all(){ return repository.findAll();}

    public Matricula find(Integer id){ return repository.findById(id).get();}

    public void delete(Integer id){ repository.delete(find(id));}

    public Matricula update(Integer id, Matricula matricula) {
        Matricula model = find(id);

        Aluno aluno = alunoRepository.getById(matricula.getId().getAluno().getId());
        Disciplina disciplina = disciplinaRepository.getById(matricula.getId().getDisciplina().getId());

        if(aluno != null && disciplina != null){
            model.getId().setAluno(aluno);
            model.getId().setDisciplina(disciplina);
            repository.save(model);
            return model;
        }

        return null;
    }
}