package es.uma.mcc.matriculas.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Authority implements Serializable{ //Probar si hace falta el serializable
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String authority;
	
	public String getAuthority() {
		return authority;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getID() {
		return id;
	}

	@Override
	public String toString() {
		return "Authority [id=" + id + ", authority=" + authority + "]";
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
}