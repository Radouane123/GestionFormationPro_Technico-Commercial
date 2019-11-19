/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ludoviclajournade
 */
@Entity
@Table(name = "FOR_FORMATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ForFormation.findAll", query = "SELECT f FROM ForFormation f")
    , @NamedQuery(name = "ForFormation.findByIdFor", query = "SELECT f FROM ForFormation f WHERE f.idFor = :idFor")
    , @NamedQuery(name = "ForFormation.findByIntituleFor", query = "SELECT f FROM ForFormation f WHERE f.intituleFor = :intituleFor")
    , @NamedQuery(name = "ForFormation.findByDescriptionFor", query = "SELECT f FROM ForFormation f WHERE f.descriptionFor = :descriptionFor")
    , @NamedQuery(name = "ForFormation.findByNiveauFor", query = "SELECT f FROM ForFormation f WHERE f.niveauFor = :niveauFor")
    , @NamedQuery(name = "ForFormation.findByDureeFor", query = "SELECT f FROM ForFormation f WHERE f.dureeFor = :dureeFor")
    , @NamedQuery(name = "ForFormation.findByCapminFor", query = "SELECT f FROM ForFormation f WHERE f.capminFor = :capminFor")
    , @NamedQuery(name = "ForFormation.findByCapmaxFor", query = "SELECT f FROM ForFormation f WHERE f.capmaxFor = :capmaxFor")
    , @NamedQuery(name = "ForFormation.findByTarifFor", query = "SELECT f FROM ForFormation f WHERE f.tarifFor = :tarifFor")})
public class ForFormation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "ID_FOR")
    private String idFor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "INTITULE_FOR")
    private String intituleFor;
    @Size(max = 124)
    @Column(name = "DESCRIPTION_FOR")
    private String descriptionFor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NIVEAU_FOR")
    private int niveauFor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "DUREE_FOR")
    private String dureeFor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CAPMIN_FOR")
    private int capminFor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CAPMAX_FOR")
    private int capmaxFor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TARIF_FOR")
    private double tarifFor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "forFormation")
    private Collection<FfFormateurFormation> ffFormateurFormationCollection;

    public ForFormation() {
    }

    public ForFormation(String idFor) {
        this.idFor = idFor;
    }

    public ForFormation(String idFor, String intituleFor, int niveauFor, String dureeFor, int capminFor, int capmaxFor, double tarifFor) {
        this.idFor = idFor;
        this.intituleFor = intituleFor;
        this.niveauFor = niveauFor;
        this.dureeFor = dureeFor;
        this.capminFor = capminFor;
        this.capmaxFor = capmaxFor;
        this.tarifFor = tarifFor;
    }

    public String getIdFor() {
        return idFor;
    }

    public void setIdFor(String idFor) {
        this.idFor = idFor;
    }

    public String getIntituleFor() {
        return intituleFor;
    }

    public void setIntituleFor(String intituleFor) {
        this.intituleFor = intituleFor;
    }

    public String getDescriptionFor() {
        return descriptionFor;
    }

    public void setDescriptionFor(String descriptionFor) {
        this.descriptionFor = descriptionFor;
    }

    public int getNiveauFor() {
        return niveauFor;
    }

    public void setNiveauFor(int niveauFor) {
        this.niveauFor = niveauFor;
    }

    public String getDureeFor() {
        return dureeFor;
    }

    public void setDureeFor(String dureeFor) {
        this.dureeFor = dureeFor;
    }

    public int getCapminFor() {
        return capminFor;
    }

    public void setCapminFor(int capminFor) {
        this.capminFor = capminFor;
    }

    public int getCapmaxFor() {
        return capmaxFor;
    }

    public void setCapmaxFor(int capmaxFor) {
        this.capmaxFor = capmaxFor;
    }

    public double getTarifFor() {
        return tarifFor;
    }

    public void setTarifFor(double tarifFor) {
        this.tarifFor = tarifFor;
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
        hash += (idFor != null ? idFor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ForFormation)) {
            return false;
        }
        ForFormation other = (ForFormation) object;
        if ((this.idFor == null && other.idFor != null) || (this.idFor != null && !this.idFor.equals(other.idFor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ForFormation[ idFor=" + idFor + " ]";
    }
    
}
