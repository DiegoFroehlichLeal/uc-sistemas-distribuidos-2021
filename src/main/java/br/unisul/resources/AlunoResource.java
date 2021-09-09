/*package br.unisul.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unisul.domain.Aluno;
import br.unisul.services.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {
	
	@Autowired
	AlunoService service;
	
	
	@GetMapping("/lista")
	public List<Aluno> listaTodos(){
		
		return service.listaTodos();
	}
	
	
	
	

}*/
