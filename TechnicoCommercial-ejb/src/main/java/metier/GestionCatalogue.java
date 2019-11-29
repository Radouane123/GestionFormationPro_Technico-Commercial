/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import javax.ejb.Stateless;

/**
 *
 * @author ludoviclajournade
 */
@Stateless
public class GestionCatalogue implements GestionCatalogueLocal {

    @Override
    public String consultationCatalogue() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void suppressionCatalogue(String idFormation) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void creerFormationCatalogue(String intitule, String description, int niveau, String duree, int capMin, int capMax, double tarif) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
