package es.uma.mcc.matriculas.model;

import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Asignatura {

	@Id
	private String codigo;

	@Column(name="nombre", nullable=false)
	private String nombre;

	@ManyToMany(mappedBy = "asignaturas")
	private Set<Grado> grados;

	public Asignatura() {
		
	}

	public Asignatura(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(nombre, other.nombre);
	}

}
