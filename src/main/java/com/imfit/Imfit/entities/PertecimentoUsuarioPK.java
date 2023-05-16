package com.imfit.Imfit.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class PertecimentoUsuarioPK {
	
	@ManyToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name="treino_id")
	private Treino treino;
	
	public PertecimentoUsuarioPK() {
		
	}

	public PertecimentoUsuarioPK(Usuario usuario, Treino treino) {
		this.usuario = usuario;
		this.treino = treino;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Treino getTreino() {
		return treino;
	}

	public void setTreino(Treino treino) {
		this.treino = treino;
	}

	@Override
	public int hashCode() {
		return Objects.hash(treino, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PertecimentoUsuarioPK other = (PertecimentoUsuarioPK) obj;
		return Objects.equals(treino, other.treino) && Objects.equals(usuario, other.usuario);
	}
	
	
	
}
