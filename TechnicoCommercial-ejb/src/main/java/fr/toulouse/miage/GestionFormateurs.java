/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.toulouse.miage;

import java.util.ArrayList;
import javax.ejb.Stateless;
import sun.util.calendar.BaseCalendar;

/**
 *
 * @author ludoviclajournade
 */
@Stateless
public class GestionFormateurs implements GestionFormateursLocal {

    @Override
    public String consultationFormateurs() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void creeFormateur(String nom, String prenom, String enseignement, BaseCalendar.Date dateN, ArrayList<String> listFormations) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificationFormateur(String idFormateur, String nom, String prenom, String enseignement, BaseCalendar.Date dateN, ArrayList<String> listFormations) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void suppressionFormateur(String idFormateur) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
