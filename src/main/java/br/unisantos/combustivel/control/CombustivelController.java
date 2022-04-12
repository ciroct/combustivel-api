package br.unisantos.combustivel.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.unisantos.combustivel.model.Combustivel;
import br.unisantos.combustivel.service.CombustivelService;

@RestController
@RequestMapping("/combustiveis")
public class CombustivelController {
	
	@Autowired
	private CombustivelService service;
	
	@GetMapping("/{etanol}/{gasolina}")
	public ResponseEntity<String> getVariable(@PathVariable("etanol") Float etanol, @PathVariable("gasolina") Float gasolina) {
		Combustivel combustivel = new Combustivel();
		combustivel.setEtanol(etanol);
		combustivel.setGasolina(gasolina);
		return ResponseEntity.ok(service.calcular(combustivel));
	}

	@GetMapping()
	public ResponseEntity<String> getParam(@RequestParam("etanol") Float etanol, @RequestParam("gasolina") Float gasolina) {
		Combustivel combustivel = new Combustivel();
		combustivel.setEtanol(etanol);
		combustivel.setGasolina(gasolina);
		return ResponseEntity.ok(service.calcular(combustivel));
	}
	
	@PostMapping
	public ResponseEntity<String> post(@RequestBody Combustivel combustivel) {
		return ResponseEntity.ok(service.calcular(combustivel));
	}
}
