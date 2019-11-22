/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.util.ArrayList;
import sun.util.calendar.BaseCalendar.Date;

/**
 *
 * @author ludoviclajournade
 */
public class Formateur {
    private int idFormateur;
    private String nomFormateur;
    private String prenomFormateur;
    private String enseignementFormateur;
    private Date dateNFormateur;
    private ArrayList<Formation> formations;

    public int getIdFormateur() {
        return idFormateur;
    }

    public void setIdFormateur(int idFormateur) {
        this.idFormateur = idFormateur;
    }

    public String getNomFormateur() {
        return nomFormateur;
    }

    public void setNomFormateur(String nomFormateur) {
        this.nomFormateur = nomFormateur;
    }

    public String getPrenomFormateur() {
        return prenomFormateur;
    }

    public void setPrenomFormateur(String prenomFormateur) {
        this.prenomFormateur = prenomFormateur;
    }

    public String getEnseignementFormateur() {
        return enseignementFormateur;
    }

    public void setEnseignementFormateur(String enseignementFormateur) {
        this.enseignementFormateur = enseignementFormateur;
    }

    public Date getDateNFormateur() {
        return dateNFormateur;
    }

    public void setDateNFormateur(Date dateNFormateur) {
        this.dateNFormateur = dateNFormateur;
    }

    public ArrayList<Formation> getFormations() {
        return formations;
    }

    public void setFormations(ArrayList<Formation> formations) {
        this.formations = formations;
    }
    
    public void addFormation(Formation f) {
        this.formations.add(f);
    }

    public Formateur(int idFormateur, String nomFormateur, String prenomFormateur, String enseignementFormateur, Date dateNFormateur, ArrayList<Formation> formations) {
        this.idFormateur = idFormateur;
        this.nomFormateur = nomFormateur;
        this.prenomFormateur = prenomFormateur;
        this.enseignementFormateur = enseignementFormateur;
        this.dateNFormateur = dateNFormateur;
        this.formations = formations;
    }
    
}
