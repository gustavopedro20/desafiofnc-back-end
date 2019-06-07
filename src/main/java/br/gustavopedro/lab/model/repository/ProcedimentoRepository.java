package br.gustavopedro.lab.model.repository;

import org.springframework.data.repository.Repository;

import br.gustavopedro.lab.model.beans.Procedimento;

public interface ProcedimentoRepository extends Repository<Procedimento, Long> {

	Procedimento save(Procedimento procedimento);

}
