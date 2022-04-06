package br.unisantos.combustivel.model;

import java.io.Serializable;

public class Combustivel implements Serializable {

	private static final long serialVersionUID = 1L;

	private Float etanol;
	private Float gasolina;
	public Combustivel() {
		
	}
	
	public Float getEtanol() {
		return etanol;
	}
	
	public void setEtanol(Float etanol) {
		this.etanol = etanol;
	}
	
	public Float getGasolina() {
		return gasolina;
	}
	
	public void setGasolina(Float gasolina) {
		this.gasolina = gasolina;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((etanol == null) ? 0 : etanol.hashCode());
		result = prime * result + ((gasolina == null) ? 0 : gasolina.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Combustivel other = (Combustivel) obj;
		if (etanol == null) {
			if (other.etanol != null)
				return false;
		} else if (!etanol.equals(other.etanol))
			return false;
		if (gasolina == null) {
			if (other.gasolina != null)
				return false;
		} else if (!gasolina.equals(other.gasolina))
			return false;
		return true;
	}
	
	

	
}
