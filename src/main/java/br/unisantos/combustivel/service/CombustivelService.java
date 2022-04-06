package br.unisantos.combustivel.service;

import org.springframework.stereotype.Service;

import br.unisantos.combustivel.model.Combustivel;

@Service
public class CombustivelService {
	
	public String calcular(Combustivel combustivel) {
		Float proporcao = combustivel.getEtanol() / combustivel.getGasolina();
		if (proporcao > 0.7) {
			return "Abasteca com Gasolina";
		}
		return "Abasteca com etanol";
	}
}
