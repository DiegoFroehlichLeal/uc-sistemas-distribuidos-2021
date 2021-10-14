package br.unisul.resources;

import br.unisul.domain.Matricula;
import br.unisul.services.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matricula")
class MatriculaResource {

    @Autowired
    MatriculaService service;

    @GetMapping("/index")
    public List<Matricula> index(){
        return service.all();
    }

    @GetMapping("/show/{id}")
    public Matricula store(@PathVariable Integer id){
        return service.find(id);
    }

    @PostMapping("/store")
    public void store(@RequestBody Matricula matricula){
        service.insert(matricula);
    }

    @PutMapping("/update/{id}")
    public Matricula update(@PathVariable (name = "id") Integer id, @RequestBody Matricula matricula){
        return service.update(id, matricula);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
