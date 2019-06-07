package br.gustavopedro.lab.model.repository;

import org.springframework.data.repository.Repository;

import br.gustavopedro.lab.model.beans.Paciente;

public interface PacienteRepository extends Repository<Paciente, Long> {

	Paciente save(Paciente paciente);

}
