package br.gustavopedro.lab.model.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.gustavopedro.lab.model.beans.Exame;

public interface ExameRepository extends Repository<Exame, Long> {

	List<Exame> findAll();

	Exame save(Exame exame);
	

}
