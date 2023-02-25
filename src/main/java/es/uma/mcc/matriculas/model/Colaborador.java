package es.uma.mcc.matriculas.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Colaborador implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="nombre", nullable=false)
	private String nombre;

	@Column(name="apellidos", nullable=false)
	private String apellidos;

	private char genero;
	
	private Date fechaIngreso;

	@OneToOne (mappedBy = "colaborador", cascade = CascadeType.ALL)
	private Usuario usuario;

	@ManyToOne 
	private Centro centro;

	public Colaborador() {
		//TODO Auto-generated constructor stub
	}
	
	//Constructor con atributos
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, fechaIngreso, genero, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colaborador other = (Colaborador) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(fechaIngreso, other.fechaIngreso)
				&& genero == other.genero && Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", genero=" + genero
				+ ", fecha_nac=" + fechaIngreso + "]";
	}
	
	

}
