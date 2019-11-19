/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ludoviclajournade
 */
@Embeddable
public class FfFormateurFormationPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "ID_FOR")
    private String idFor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "ID_FTR")
    private String idFtr;

    public FfFormateurFormationPK() {
    }

    public FfFormateurFormationPK(String idFor, String idFtr) {
        this.idFor = idFor;
        this.idFtr = idFtr;
    }

    public String getIdFor() {
        return idFor;
    }

    public void setIdFor(String idFor) {
        this.idFor = idFor;
    }

    public String getIdFtr() {
        return idFtr;
    }

    public void setIdFtr(String idFtr) {
        this.idFtr = idFtr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFor != null ? idFor.hashCode() : 0);
        hash += (idFtr != null ? idFtr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FfFormateurFormationPK)) {
            return false;
        }
        FfFormateurFormationPK other = (FfFormateurFormationPK) object;
        if ((this.idFor == null && other.idFor != null) || (this.idFor != null && !this.idFor.equals(other.idFor))) {
            return false;
        }
        if ((this.idFtr == null && other.idFtr != null) || (this.idFtr != null && !this.idFtr.equals(other.idFtr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FfFormateurFormationPK[ idFor=" + idFor + ", idFtr=" + idFtr + " ]";
    }
    
}
