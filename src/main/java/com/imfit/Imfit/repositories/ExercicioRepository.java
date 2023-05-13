package com.imfit.Imfit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.imfit.Imfit.entities.Exercicio;
import com.imfit.Imfit.projections.ExercicioMinProjection;

public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {
	@Query(nativeQuery = true, value = """
			SELECT tb_exercicio.id, tb_exercicio.name, tb_exercicio.muscle_group, tb_pertecimento.series, tb_pertecimento.repeticoes
			FROM tb_exercicio
			INNER JOIN tb_pertecimento ON tb_exercicio.id = tb_pertecimento.exercicio_id
			WHERE tb_pertecimento.treino_id = :treinoId
							""")
	List<ExercicioMinProjection> searchByList(Long treinoId);
}
