/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.evaluacion_docente.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ISTA
 */
@Embeddable
public class AsignacionCoevaluacionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_asignacion")
    private int idAsignacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_docente_evaluador")
    private int idDocenteEvaluador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_docente_evaluado")
    private int idDocenteEvaluado;

    public AsignacionCoevaluacionPK() {
    }

    public AsignacionCoevaluacionPK(int idAsignacion, int idDocenteEvaluador, int idDocenteEvaluado) {
        this.idAsignacion = idAsignacion;
        this.idDocenteEvaluador = idDocenteEvaluador;
        this.idDocenteEvaluado = idDocenteEvaluado;
    }

    public int getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(int idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public int getIdDocenteEvaluador() {
        return idDocenteEvaluador;
    }

    public void setIdDocenteEvaluador(int idDocenteEvaluador) {
        this.idDocenteEvaluador = idDocenteEvaluador;
    }

    public int getIdDocenteEvaluado() {
        return idDocenteEvaluado;
    }

    public void setIdDocenteEvaluado(int idDocenteEvaluado) {
        this.idDocenteEvaluado = idDocenteEvaluado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idAsignacion;
        hash += (int) idDocenteEvaluador;
        hash += (int) idDocenteEvaluado;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsignacionCoevaluacionPK)) {
            return false;
        }
        AsignacionCoevaluacionPK other = (AsignacionCoevaluacionPK) object;
        if (this.idAsignacion != other.idAsignacion) {
            return false;
        }
        if (this.idDocenteEvaluador != other.idDocenteEvaluador) {
            return false;
        }
        if (this.idDocenteEvaluado != other.idDocenteEvaluado) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.evaluacion_docente.model.AsignacionCoevaluacionPK[ idAsignacion=" + idAsignacion + ", idDocenteEvaluador=" + idDocenteEvaluador + ", idDocenteEvaluado=" + idDocenteEvaluado + " ]";
    }
    
}
