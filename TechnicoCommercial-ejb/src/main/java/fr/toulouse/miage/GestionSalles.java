/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.toulouse.miage;

import javax.ejb.Singleton;
import javax.ejb.Stateless;

/**
 *
 * @author ludoviclajournade
 */
@Stateless
public class GestionSalles implements GestionSallesLocal {
    
    
    public GestionSalles() {
        
    }
    
    @Override
    public String getSalles() {
        String m = "Toutes les salles sont là !";
        
        return m;
    }

    @Override
    public void creeSalle(String nom, Integer capacite) throws Exception {
         try {
            
        }
        catch (Exception e) {
            throw new Exception("Création de la salle échouée !");
        }
    }
    
}
