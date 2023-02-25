package es.uma.mcc.matriculas.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class Proyecto {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="nombre", nullable = false)
	private String nombre;

	public Proyecto() {
		//TODO Auto-generated constructor stub
	}
	
	public Proyecto(String nombre) {
		this.nombre = nombre;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proyecto other = (Proyecto) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
