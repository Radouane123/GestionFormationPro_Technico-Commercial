/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salles;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import fr.toulouse.miage.GestionSallesLocal;
import javax.ejb.Stateless;

/**
 *
 * @author ludoviclajournade
 */
@Path("salles")
public class SallesRessouce {
    
    @EJB
    private GestionSallesLocal gestionSalles;
    
    public SallesRessouce() {
        
    }
    
    @GET
    public String getSalles() throws Exception {
       return gestionSalles.getSalles();
    }
}
