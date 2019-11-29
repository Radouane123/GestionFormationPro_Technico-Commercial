/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;
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
    public void creeSalle(String nom, Integer capacite) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificationSalle(String idSalle, String nom, Integer capacite, ArrayList<String> listFormations) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void suppressionSalle(String idSalle) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
