/*package br.unisul.resources;

import br.unisul.domain.Aluno;
import br.unisul.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/aluno")
public class calculadora {

    @Autowired
    AlunoService service;

    @GetMapping("/lista")
    public List<Aluno> listaTodos() {
        return service.listaTodos();
    }

    @GetMapping("/somar")
    public Double somaNotas(@RequestParam(name = "n1") double n1, @RequestParam(name = "n2") double n2) {
        return n1 + n2;
    }

    @GetMapping("/subtrair")
    public Double subtraiNotas(@RequestParam(name = "n1") double n1, @RequestParam(name = "n2") double n2) {
        return n1 - n2;
    }

    @GetMapping("/dividir")
    public Double divideNotas(@RequestParam(name = "n1") double n1, @RequestParam(name = "n2") double n2) {
        return n1 / n2;
    }

    @GetMapping("/multiplicar")
    public Double multiplicaNotas(@RequestParam(name = "n1") double n1, @RequestParam(name = "n2") double n2) {
        return n1 * n2;
    }

}*/

