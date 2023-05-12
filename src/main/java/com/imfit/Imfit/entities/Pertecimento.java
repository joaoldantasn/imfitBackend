package com.imfit.Imfit.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pertecimento")
public class Pertecimento {
	
	@EmbeddedId
	private PertecimentoPK id = new PertecimentoPK();
	private Integer series;
	private Integer repeticoes;

	public Pertecimento() {
		
	}

	public Pertecimento(Exercicio exercicio,Treino treino, Integer series, Integer repeticoes) {
		id.setExercicio(exercicio);
		id.setTreino(treino);
		this.series = series;
		this.repeticoes = repeticoes;
	}

	public PertecimentoPK getId() {
		return id;
	}

	public void setId(PertecimentoPK id) {
		this.id = id;
	}

	public Integer getSeries() {
		return series;
	}

	public void setSeries(Integer series) {
		this.series = series;
	}

	public Integer getRepeticoes() {
		return repeticoes;
	}

	public void setRepeticoes(Integer repeticoes) {
		this.repeticoes = repeticoes;
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
		Pertecimento other = (Pertecimento) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
