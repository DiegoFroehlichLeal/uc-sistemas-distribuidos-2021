package br.unisul.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import br.unisul.domain.Aluno;

@Service
public class AlunoService {
	
	
	public List<Aluno> listaTodos(){
		List<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno a1 = new Aluno();
		a1.setId(1);
		a1.setNome("Joãozinho");
		a1.setN1(7.0);
		a1.setN2(6.0);
		a1.setN3(5.0);
		
		Aluno a2 = new Aluno();
		a2.setId(2);
		a2.setNome("Mariazinha");
		a2.setN1(7.0);
		a2.setN2(8.0);
		a2.setN3(9.0);
		
		Aluno a3 = new Aluno();
		a3.setId(3);
		a3.setNome("Pedrinho");
		a3.setN1(8.0);
		a3.setN2(8.0);
		a3.setN3(8.0);
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		
		return lista;
	}

}
