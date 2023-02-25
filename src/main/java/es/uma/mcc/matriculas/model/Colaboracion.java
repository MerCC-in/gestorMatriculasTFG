package es.uma.mcc.matriculas.model;

import javax.persistence.*;

@Entity
public class Colaboracion {

    @EmbeddedId
	private ColaboracionId id;

	private String funciones;

	public Colaboracion() {
		
	}

    public ColaboracionId getId() {
        return id;
    }

    public void setId(ColaboracionId id) {
        this.id = id;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((funciones == null) ? 0 : funciones.hashCode());
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
        Colaboracion other = (Colaboracion) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (funciones == null) {
            if (other.funciones != null)
                return false;
        } else if (!funciones.equals(other.funciones))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Colaboracion [id=" + id + ", funciones=" + funciones + "]";
    }
    
}
