package com.imfit.Imfit.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pertecimento_usuario")
public class PertecimentoUsuario {
	
	@EmbeddedId
	private PertecimentoUsuarioPK id = new PertecimentoUsuarioPK();

	public PertecimentoUsuario() {
		
	}

	public PertecimentoUsuario(Usuario usuario, Treino treino) {
		id.setTreino(treino);
		id.setUsuario(usuario);
	}

	public PertecimentoUsuarioPK getId() {
		return id;
	}

	public void setId(PertecimentoUsuarioPK id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PertecimentoUsuario other = (PertecimentoUsuario) obj;
		return Objects.equals(id, other.id);
	} 
	
	
	
}
