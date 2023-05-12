package com.imfit.Imfit.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class PertecimentoPK {
	
	@ManyToOne
	@JoinColumn(name = "exercicio_id")
	private Exercicio exercicio;
	@ManyToOne
	@JoinColumn(name = "treino_id")
	private Treino treino;
	
	public PertecimentoPK() {
		
	}

	public PertecimentoPK(Exercicio exercicio, Treino treino) {
		this.exercicio = exercicio;
		this.treino = treino;
	}

	public Exercicio getExercicio() {
		return exercicio;
	}

	public void setExercicio(Exercicio exercicio) {
		this.exercicio = exercicio;
	}

	public Treino getTreino() {
		return treino;
	}

	public void setTreino(Treino treino) {
		this.treino = treino;
	}

	@Override
	public int hashCode() {
		return Objects.hash(exercicio, treino);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PertecimentoPK other = (PertecimentoPK) obj;
		return Objects.equals(exercicio, other.exercicio) && Objects.equals(treino, other.treino);
	}
	
	
	
}
