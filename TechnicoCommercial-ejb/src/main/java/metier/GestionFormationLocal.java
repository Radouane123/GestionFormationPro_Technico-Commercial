/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import entities.Formation;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author ludoviclajournade
 */
@Local
public interface GestionFormationLocal {
    
    public Collection<Formation> getFormations(); 
    
    public boolean addFormation(String intituleFormation, String descriptionFormation, int niveauFormation, String dureeFormation, int capMaxFormation, int capMinFormation);

    public Formation getFormation(String id);

    public boolean addFormation(String formation);

    public boolean updateFormation(int idFormation, String intituleFormation, String descriptionFormation, int niveauFormation, String dureeFormation, int capMaxFormation, int capMinFormation);
}
