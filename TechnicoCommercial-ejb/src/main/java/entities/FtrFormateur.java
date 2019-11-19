/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ludoviclajournade
 */
@Entity
@Table(name = "FTR_FORMATEUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FtrFormateur.findAll", query = "SELECT f FROM FtrFormateur f")
    , @NamedQuery(name = "FtrFormateur.findByIdFtr", query = "SELECT f FROM FtrFormateur f WHERE f.idFtr = :idFtr")
    , @NamedQuery(name = "FtrFormateur.findByNomFtr", query = "SELECT f FROM FtrFormateur f WHERE f.nomFtr = :nomFtr")
    , @NamedQuery(name = "FtrFormateur.findByPrenomFtr", query = "SELECT f FROM FtrFormateur f WHERE f.prenomFtr = :prenomFtr")
    , @NamedQuery(name = "FtrFormateur.findByEnseignementFtr", query = "SELECT f FROM FtrFormateur f WHERE f.enseignementFtr = :enseignementFtr")
    , @NamedQuery(name = "FtrFormateur.findByDatenFtr", query = "SELECT f FROM FtrFormateur f WHERE f.datenFtr = :datenFtr")})
public class FtrFormateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "ID_FTR")
    private String idFtr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "NOM_FTR")
    private String nomFtr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "PRENOM_FTR")
    private String prenomFtr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "ENSEIGNEMENT_FTR")
    private String enseignementFtr;
    @Column(name = "DATEN_FTR")
    @Temporal(TemporalType.DATE)
    private Date datenFtr;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ftrFormateur")
    private Collection<FfFormateurFormation> ffFormateurFormationCollection;

    public FtrFormateur() {
    }

    public FtrFormateur(String idFtr) {
        this.idFtr = idFtr;
    }

    public FtrFormateur(String idFtr, String nomFtr, String prenomFtr, String enseignementFtr) {
        this.idFtr = idFtr;
        this.nomFtr = nomFtr;
        this.prenomFtr = prenomFtr;
        this.enseignementFtr = enseignementFtr;
    }

    public String getIdFtr() {
        return idFtr;
    }

    public void setIdFtr(String idFtr) {
        this.idFtr = idFtr;
    }

    public String getNomFtr() {
        return nomFtr;
    }

    public void setNomFtr(String nomFtr) {
        this.nomFtr = nomFtr;
    }

    public String getPrenomFtr() {
        return prenomFtr;
    }

    public void setPrenomFtr(String prenomFtr) {
        this.prenomFtr = prenomFtr;
    }

    public String getEnseignementFtr() {
        return enseignementFtr;
    }

    public void setEnseignementFtr(String enseignementFtr) {
        this.enseignementFtr = enseignementFtr;
    }

    public Date getDatenFtr() {
        return datenFtr;
    }

    public void setDatenFtr(Date datenFtr) {
        this.datenFtr = datenFtr;
    }

    @XmlTransient
    public Collection<FfFormateurFormation> getFfFormateurFormationCollection() {
        return ffFormateurFormationCollection;
    }

    public void setFfFormateurFormationCollection(Collection<FfFormateurFormation> ffFormateurFormationCollection) {
        this.ffFormateurFormationCollection = ffFormateurFormationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFtr != null ? idFtr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FtrFormateur)) {
            return false;
        }
        FtrFormateur other = (FtrFormateur) object;
        if ((this.idFtr == null && other.idFtr != null) || (this.idFtr != null && !this.idFtr.equals(other.idFtr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FtrFormateur[ idFtr=" + idFtr + " ]";
    }
    
}
