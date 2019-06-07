package br.gustavopedro.lab.model.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gustavopedro.lab.model.beans.Exame;
import br.gustavopedro.lab.model.beans.Paciente;
import br.gustavopedro.lab.model.beans.Procedimento;
import br.gustavopedro.lab.model.repository.ExameRepository;
import br.gustavopedro.lab.model.repository.PacienteRepository;
import br.gustavopedro.lab.model.repository.ProcedimentoRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/lab")
public class LabResource {

	@Autowired
	private ExameRepository exameRepo;
	@Autowired
	private PacienteRepository pacienteRepo;
	@Autowired
	private ProcedimentoRepository procedimentoRepo;

	@GetMapping
	public List<Exame> todosOsExames() {
		return this.exameRepo.findAll();
	}

	@PostMapping("/salvar-exame")
	public Exame salvarExame (@RequestBody Exame exame) {
		return exameRepo.save(exame);
	}
	
	@PostMapping("/salvar-paciente")
	public Paciente salvarPaciente (@RequestBody Paciente paciente) {
		return pacienteRepo.save(paciente);
	}
	
	@PostMapping("/salvar-procedimento")
	public Procedimento salvarProcedimento (@RequestBody Procedimento procedimento) {
		return procedimentoRepo.save(procedimento);
	}

}
