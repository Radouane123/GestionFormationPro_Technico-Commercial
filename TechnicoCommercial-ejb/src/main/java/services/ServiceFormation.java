/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.google.gson.Gson;
import entities.Formation;
import java.util.HashMap;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import metier.GestionCatalogueLocal;
import metier.GestionFormationLocal;

/**
 *
 * @author ludoviclajournade
 */
@Stateless
public class ServiceFormation implements ServiceFormationLocal {
        
    @EJB
    private GestionFormationLocal gestionFormation;
    
       
    /**
     * Convertisseur Objet JSON et inversement)
     */
    private Gson gson;
    
    public ServiceFormation() {
        this.gson = new Gson();
    }  
    
    
    @Override
    public String getFormations() throws Exception {
        return gson.toJson(gestionFormation.getFormations());
    }

    @Override
    public boolean addFormation(String intituleFormation, String descriptionFormation, int niveauFormation, String dureeFormation, int capMaxFormation, int capMinFormation) {
        return gestionFormation.addFormation(intituleFormation, descriptionFormation, niveauFormation, dureeFormation, capMaxFormation, capMinFormation);
    }

    @Override
    public String getFormation(String id) {
        return gson.toJson(gestionFormation.getFormation(id));
    }

    @Override
    public boolean addFormation(String formation) {
        return gestionFormation.addFormation(formation);
    }

    @Override
    public boolean updateFormation(int idFormation, String intituleFormation, String descriptionFormation, int niveauFormation, String dureeFormation, int capMaxFormation, int capMinFormation) {
        return gestionFormation.updateFormation(idFormation,intituleFormation, descriptionFormation, niveauFormation, dureeFormation, capMaxFormation, capMinFormation);
    }
    
      
    
}
