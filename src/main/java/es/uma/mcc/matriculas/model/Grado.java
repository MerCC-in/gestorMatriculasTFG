package es.uma.mcc.matriculas.model;

import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Grado {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="nombre", nullable = false)
	private String nombre;

	@Column(name="universidad", nullable = false)
	private String universidad;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "grado_has_asignatura", joinColumns = @JoinColumn(name = "grado_id"), inverseJoinColumns = @JoinColumn(name = "asignatura_id"))
	private Set<Asignatura> asignaturas;
	
	public Grado() {
		
	}

	public Grado(String nombre, String universidad) {
		this.nombre = nombre;
		this.universidad = universidad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, universidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grado other = (Grado) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre) && Objects.equals(universidad, other.universidad);
	}

	@Override
	public String toString() {
		return "Grado [id=" + id + ", nombre=" + nombre + ", universidad=" + universidad + "]";
	}
	
}
