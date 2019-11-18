/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.toulouse.miage;

import java.util.ArrayList;
import javax.ejb.Local;
import sun.util.calendar.BaseCalendar.Date;

/**
 *
 * @author ludoviclajournade
 */
@Local
public interface GestionFormateursLocal {
    String consultationFormateurs() throws Exception;
    void creeFormateur(String nom, String prenom, String enseignement, Date dateN, ArrayList<String> listFormations ) throws Exception;
    void modificationFormateur(String idFormateur, String nom, String prenom, String enseignement, Date dateN, ArrayList<String> listFormations ) throws Exception;
    void suppressionFormateur(String idFormateur) throws Exception;
}
