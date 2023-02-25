package es.uma.mcc.matriculas.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CalificacionId implements Serializable{
    private static final long serialVersionUID = 1L;

	private String colaborador;
	private String asignatura;
    private String anyo;
	
	public CalificacionId() {

    }

    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getAnyo() {
        return anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((colaborador == null) ? 0 : colaborador.hashCode());
        result = prime * result + ((asignatura == null) ? 0 : asignatura.hashCode());
        result = prime * result + ((anyo == null) ? 0 : anyo.hashCode());
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
        CalificacionId other = (CalificacionId) obj;
        if (colaborador == null) {
            if (other.colaborador != null)
                return false;
        } else if (!colaborador.equals(other.colaborador))
            return false;
        if (asignatura == null) {
            if (other.asignatura != null)
                return false;
        } else if (!asignatura.equals(other.asignatura))
            return false;
        if (anyo == null) {
            if (other.anyo != null)
                return false;
        } else if (!anyo.equals(other.anyo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CalificacionId [colaborador=" + colaborador + ", asignatura=" + asignatura + ", anyo=" + anyo + "]";
    }
	
}
