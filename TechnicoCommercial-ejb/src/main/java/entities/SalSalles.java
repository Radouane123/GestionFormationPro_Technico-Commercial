/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ludoviclajournade
 */
@Entity
@Table(name = "SAL_SALLES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalSalles.findAll", query = "SELECT s FROM SalSalles s")
    , @NamedQuery(name = "SalSalles.findByIdSal", query = "SELECT s FROM SalSalles s WHERE s.idSal = :idSal")
    , @NamedQuery(name = "SalSalles.findByNomSal", query = "SELECT s FROM SalSalles s WHERE s.nomSal = :nomSal")
    , @NamedQuery(name = "SalSalles.findByCapaciteSal", query = "SELECT s FROM SalSalles s WHERE s.capaciteSal = :capaciteSal")})
public class SalSalles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "ID_SAL")
    private String idSal;
    @Size(max = 24)
    @Column(name = "NOM_SAL")
    private String nomSal;
    @Column(name = "CAPACITE_SAL")
    private Integer capaciteSal;

    public SalSalles() {
    }

    public SalSalles(String idSal) {
        this.idSal = idSal;
    }

    public String getIdSal() {
        return idSal;
    }

    public void setIdSal(String idSal) {
        this.idSal = idSal;
    }

    public String getNomSal() {
        return nomSal;
    }

    public void setNomSal(String nomSal) {
        this.nomSal = nomSal;
    }

    public Integer getCapaciteSal() {
        return capaciteSal;
    }

    public void setCapaciteSal(Integer capaciteSal) {
        this.capaciteSal = capaciteSal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSal != null ? idSal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalSalles)) {
            return false;
        }
        SalSalles other = (SalSalles) object;
        if ((this.idSal == null && other.idSal != null) || (this.idSal != null && !this.idSal.equals(other.idSal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.toulouse.miage.SalSalles[ idSal=" + idSal + " ]";
    }
    
}
