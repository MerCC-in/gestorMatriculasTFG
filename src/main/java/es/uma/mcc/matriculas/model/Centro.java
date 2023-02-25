package es.uma.mcc.matriculas.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Centro implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCentro;

	@Column(name="nombre", nullable=false)
	private String nombre;

	@Enumerated(EnumType.STRING)
	@Column(name="tipoCentro", nullable=false)
	private TipoCentro tipoCentro;  // 1 --> Populorum   2 --> CCJ   

	@OneToMany (mappedBy = "centro")
	private Set<Colaborador> colaboradores;
	
	public Centro() {
		
	}

	public Centro(String nombre, TipoCentro tipoCentro) {
		this.nombre = nombre;
		this.tipoCentro = tipoCentro;
	}

	public Long getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(Long idCentro) {
		this.idCentro = idCentro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoCentro getTipoCentro() {
		return tipoCentro;
	}

	public void setTipoCentro(TipoCentro tipoCentro) {
		this.tipoCentro = tipoCentro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCentro, nombre, tipoCentro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Centro other = (Centro) obj;
		return Objects.equals(idCentro, other.idCentro) && Objects.equals(nombre, other.nombre) && tipoCentro == other.tipoCentro;
	}

}
