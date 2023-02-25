package es.uma.mcc.matriculas.model;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class ColaboracionId implements Serializable{
    private static final long serialVersionUID = 1L;

    private String colaborador;
	private String proyecto;
    private String mes_anyo;

    public ColaboracionId() {
		
	}
    
    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getMes_anyo() {
        return mes_anyo;
    }

    public void setMes_anyo(String mes_anyo) {
        this.mes_anyo = mes_anyo;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((colaborador == null) ? 0 : colaborador.hashCode());
        result = prime * result + ((proyecto == null) ? 0 : proyecto.hashCode());
        result = prime * result + ((mes_anyo == null) ? 0 : mes_anyo.hashCode());
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
        ColaboracionId other = (ColaboracionId) obj;
        if (colaborador == null) {
            if (other.colaborador != null)
                return false;
        } else if (!colaborador.equals(other.colaborador))
            return false;
        if (proyecto == null) {
            if (other.proyecto != null)
                return false;
        } else if (!proyecto.equals(other.proyecto))
            return false;
        if (mes_anyo == null) {
            if (other.mes_anyo != null)
                return false;
        } else if (!mes_anyo.equals(other.mes_anyo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ColaboracionId [colaborador=" + colaborador + ", proyecto=" + proyecto + ", mes_anyo=" + mes_anyo + "]";
    }
    
}
