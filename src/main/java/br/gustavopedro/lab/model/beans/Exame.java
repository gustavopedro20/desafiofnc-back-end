package br.gustavopedro.lab.model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exame")
public class Exame {
	@Id
	@Column
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String dataColeta;
	@Column
	private String dataEntrega;
	@Column
	private String paciente;
	@Column
	private String procedimento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDataColeta() {
		return dataColeta;
	}
	public void setDataColeta(String dataColeta) {
		this.dataColeta = dataColeta;
	}
	public String getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	public String getProcedimento() {
		return procedimento;
	}
	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}
	
	@Override
	public String toString() {
		return "Exame [id=" + id + ", dataColeta=" + dataColeta + ", dataEntrega=" + dataEntrega + ", paciente="
				+ paciente + ", procedimento=" + procedimento + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Exame other = (Exame) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
