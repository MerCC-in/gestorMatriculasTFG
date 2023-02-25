package es.uma.mcc.matriculas.model;

import javax.persistence.*;

@Entity
public class Calificacion {

	@EmbeddedId
	private CalificacionId id;

	@Column(name="estado", nullable=false)
	private String estado;

    @Column(name="periodo", nullable=false)
	private String periodo;

	public Calificacion() {
		
	}

    public CalificacionId getId() {
        return id;
    }

    public void setId(CalificacionId id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((periodo == null) ? 0 : periodo.hashCode());
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
        Calificacion other = (Calificacion) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (periodo == null) {
            if (other.periodo != null)
                return false;
        } else if (!periodo.equals(other.periodo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Calificacion [id=" + id + ", estado=" + estado + ", periodo=" + periodo + "]";
    }
    
}
