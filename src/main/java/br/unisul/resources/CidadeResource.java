package br.unisul.resources;

import br.unisul.domain.Aluno;
import br.unisul.domain.Cidade;
import br.unisul.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidade")
public class CidadeResource {

    @Autowired
    CidadeService service;

    @GetMapping("/lista")
    public List<Cidade> listaTodos(){
        return service.listaTodos();
    }

    @PostMapping("/add")
    public void addCidade(@RequestBody Cidade c){
        service.insereCidade(c);
    }

    @GetMapping("id/{id}")
    public Cidade buscaPorId(@PathVariable(name = "id") Integer id) {
        return service.buscaPorId(id);
    }

    @GetMapping("nome")
    public List<Cidade> buscaPorNome(@RequestParam (name = "nome") String nome) {
        return service.buscaPorNome(nome);
    }
    @GetMapping("uf")
    public List<Cidade> buscaPorUF(@RequestParam (name = "uf") String uf) {
        return service.buscaPorUF(uf);
    }

    @DeleteMapping("excluir/{id}")
    public void exclui(@PathVariable(name = "id") Integer id) {
        service.exclui(id);
    }

    @PutMapping("altera/{id}")
    public Cidade altera(@PathVariable(name = "id") Integer id, @RequestBody Cidade c) {
        return service.altera(id, c);

    }



}
