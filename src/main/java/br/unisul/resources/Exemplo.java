package br.unisul.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemplo")
public class Exemplo {

	@GetMapping("/home")
	public String boasVindas(@RequestParam(name = "nome") String nome, @RequestParam(name = "idade") int idade) {
		String ret = nome + "Seja bem vindo";
		if (idade >= 18)
			ret += "\nVocê é de maior";
		else
			ret += "\nVocê é de menor";

		return ret;
	}
	@GetMapping("/dinamica/{nome}")
	public String boasvindas2(@PathVariable(name="nome")String nome) {
		String ret=nome+ " Seja bem vindo";
		return ret;
		
	}

}
