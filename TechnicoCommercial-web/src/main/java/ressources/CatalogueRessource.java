/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ressources;

import fr.toulouse.miage.GestionCatalogue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author ludoviclajournade
 */
@Path("catalogue")
public class CatalogueRessource {
    
    @EJB
    private GestionCatalogue gestionCatalogue;
    
    public CatalogueRessource() {}
    
    @GET
    public String getCatalogue() {
        try {
            return gestionCatalogue.consultationCatalogue();
        } catch (Exception ex) {
            Logger.getLogger(CatalogueRessource.class.getName()).log(Level.SEVERE, null, ex);
            return "Erreur";
        }
    }
}
