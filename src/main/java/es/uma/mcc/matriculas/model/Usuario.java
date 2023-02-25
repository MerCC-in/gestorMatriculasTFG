package es.uma.mcc.matriculas.model;

import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Usuario {
	
	@Id
	private String user;
	
	@Column(name="password", nullable=false)
	private String password;

	@OneToOne
	private Colaborador colaborador;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "authorities_users", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "authority_id"))
	private Set<Authority> authority;

	public Usuario() {
		super();
	}
	
	public Usuario(String usuario, String password) {
		this.user = usuario;
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String usuario) {
		this.user = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Authority> getAuthority() {
		return authority;
	}

	public void setAuthority(Set<Authority> authority) {
		this.authority = authority;
	}

	@Override
	public int hashCode() {
		return Objects.hash(password, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(password, other.password)
				&& Objects.equals(user, other.user);
	}

	@Override
	public String toString() {
		return "Usuario [usuario=" + user + ", password=" + password  + "]";
	}

}
