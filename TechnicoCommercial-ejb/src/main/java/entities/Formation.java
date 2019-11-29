/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author ludoviclajournade
 */
public class Formation {
    private int idFormation;
    private String intituleFormation;
    private String descriptionFormation;
    private int niveauFormation;
    private String dureeFormation;
    private int capMaxFormation;
    private int capMinFormation;

    public Formation(int idFormation, String intituleFormation, String descriptionFormation, int niveauFormation, String dureeFormation, int capMaxFormation, int capMinFormation) {
        this.idFormation = idFormation;
        this.intituleFormation = intituleFormation;
        this.descriptionFormation = descriptionFormation;
        this.niveauFormation = niveauFormation;
        this.dureeFormation = dureeFormation;
        this.capMaxFormation = capMaxFormation;
        this.capMinFormation = capMinFormation;
    }

    public int getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }

    public String getIntituleFormation() {
        return intituleFormation;
    }

    public void setIntituleFormation(String intituleFormation) {
        this.intituleFormation = intituleFormation;
    }

    public String getDescriptionFormation() {
        return descriptionFormation;
    }

    public void setDescriptionFormation(String descriptionFormation) {
        this.descriptionFormation = descriptionFormation;
    }

    public int getNiveauFormation() {
        return niveauFormation;
    }

    public void setNiveauFormation(int niveauFormation) {
        this.niveauFormation = niveauFormation;
    }

    public String getDureeFormation() {
        return dureeFormation;
    }

    public void setDureeFormation(String dureeFormation) {
        this.dureeFormation = dureeFormation;
    }

    public int getCapMaxFormation() {
        return capMaxFormation;
    }

    public void setCapMaxFormation(int capMaxFormation) {
        this.capMaxFormation = capMaxFormation;
    }

    public int getCapMinFormation() {
        return capMinFormation;
    }

    public void setCapMinFormation(int capMinFormation) {
        this.capMinFormation = capMinFormation;
    }
    
}
