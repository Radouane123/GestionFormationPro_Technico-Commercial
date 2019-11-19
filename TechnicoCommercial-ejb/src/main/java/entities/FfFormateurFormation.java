/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ludoviclajournade
 */
@Entity
@Table(name = "FF_FORMATEUR_FORMATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FfFormateurFormation.findAll", query = "SELECT f FROM FfFormateurFormation f")
    , @NamedQuery(name = "FfFormateurFormation.findByIdFor", query = "SELECT f FROM FfFormateurFormation f WHERE f.ffFormateurFormationPK.idFor = :idFor")
    , @NamedQuery(name = "FfFormateurFormation.findByIdFtr", query = "SELECT f FROM FfFormateurFormation f WHERE f.ffFormateurFormationPK.idFtr = :idFtr")})
public class FfFormateurFormation implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FfFormateurFormationPK ffFormateurFormationPK;
    @JoinColumn(name = "ID_FOR", referencedColumnName = "ID_FOR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ForFormation forFormation;
    @JoinColumn(name = "ID_FTR", referencedColumnName = "ID_FTR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FtrFormateur ftrFormateur;

    public FfFormateurFormation() {
    }

    public FfFormateurFormation(FfFormateurFormationPK ffFormateurFormationPK) {
        this.ffFormateurFormationPK = ffFormateurFormationPK;
    }

    public FfFormateurFormation(String idFor, String idFtr) {
        this.ffFormateurFormationPK = new FfFormateurFormationPK(idFor, idFtr);
    }

    public FfFormateurFormationPK getFfFormateurFormationPK() {
        return ffFormateurFormationPK;
    }

    public void setFfFormateurFormationPK(FfFormateurFormationPK ffFormateurFormationPK) {
        this.ffFormateurFormationPK = ffFormateurFormationPK;
    }

    public ForFormation getForFormation() {
        return forFormation;
    }

    public void setForFormation(ForFormation forFormation) {
        this.forFormation = forFormation;
    }

    public FtrFormateur getFtrFormateur() {
        return ftrFormateur;
    }

    public void setFtrFormateur(FtrFormateur ftrFormateur) {
        this.ftrFormateur = ftrFormateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ffFormateurFormationPK != null ? ffFormateurFormationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FfFormateurFormation)) {
            return false;
        }
        FfFormateurFormation other = (FfFormateurFormation) object;
        if ((this.ffFormateurFormationPK == null && other.ffFormateurFormationPK != null) || (this.ffFormateurFormationPK != null && !this.ffFormateurFormationPK.equals(other.ffFormateurFormationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FfFormateurFormation[ ffFormateurFormationPK=" + ffFormateurFormationPK + " ]";
    }
    
}
