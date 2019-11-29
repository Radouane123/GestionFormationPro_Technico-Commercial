/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Formation;
import javax.ejb.Local;

/**
 *
 * @author ludoviclajournade
 */
@Local
public interface ServiceFormationLocal {
    
    public String getFormations() throws Exception;
    
    public boolean addFormation(String intituleFormation, String descriptionFormation, int niveauFormation, String dureeFormation, int capMaxFormation, int capMinFormation);
    
    public boolean addFormation(String formation);

    public String getFormation(String id);

    public boolean updateFormation(int idFormation, String intituleFormation, String descriptionFormation, int niveauFormation, String dureeFormation, int capMaxFormation, int capMinFormation);

}
