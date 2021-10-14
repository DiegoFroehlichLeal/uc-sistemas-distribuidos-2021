package br.unisul.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.unisul.domain.Aluno;
import br.unisul.services.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {

	@Autowired
	AlunoService service;

	@GetMapping("/lista")
	public List<Aluno> listAll() {
		return service.listAll();
	}

	@PostMapping("/add")
	public void addAluno(@RequestBody Aluno s) {
		service.addAluno(s);
	}

	@GetMapping("id/{id}")
	public Aluno buscaPorId(@PathVariable(name = "id") Integer id) {
		return service.buscaPorId(id);
	}

	@GetMapping("nome")
	public List<Aluno> buscaPorNome(@RequestParam (name = "nome") String nome) {
		return service.buscaPorNome(nome);
	}

	@DeleteMapping("excluir/{id}")
	public void excluir(@PathVariable(name = "id") Integer id) {
		service.excluir(id);
	}

	@PutMapping("altera/{id}")
	public Aluno altera(@PathVariable(name = "id") Integer id, @RequestBody Aluno a) {
		return service.altera(id, a);

	}
	@GetMapping("/procura")
	public List<Aluno> search(@RequestParam(name = "nome") String nome){
		return service.findByNome(nome);
	}

}