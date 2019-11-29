/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ressources;

import com.google.gson.Gson;
import entities.Formation;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import services.ServiceFormationLocal;

/**
 *
 * @author ludoviclajournade
 */
@Path("formation")
@RequestScoped
public class FormationRessource {

    ServiceFormationLocal serviceFormation1 = lookupServiceFormationLocal();

    @Context
    private UriInfo context;
    
    ServiceFormationLocal serviceFormation;
    private Gson gson;

    public FormationRessource() {
        serviceFormation = lookupServiceFormationLocal();
    }
    
    /**
     * 
     * @return
     * @throws Exception 
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getFormations() throws Exception  {
        return serviceFormation.getFormations();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getFormation(@PathParam("id") String id) {
        if(id==null) {
            String m = "getFormation need an id";
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, m);
            return m;
        } else {
            return serviceFormation.getFormation(id);
        }
    }
    
    @Path("{json}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public String addFormation(@PathParam("json") String formationJson) {
        boolean res = serviceFormation.addFormation(formationJson);
        return "true and "  + res + formationJson;
    }
    
    @Path("{intitule}/{description}/{niveau}/{duree}/{capMax}/{capMin}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public String addFormation(@PathParam("intitule") String intituleFormation,@PathParam("description")  String descriptionFormation,@PathParam("niveau")  int niveauFormation,@PathParam("duree")  String dureeFormation,@PathParam("capMax")  int capMaxFormation,@PathParam("capMin")  int capMinFormation) {
        
        boolean res = serviceFormation.addFormation(intituleFormation, descriptionFormation, niveauFormation, dureeFormation, capMaxFormation, capMinFormation);
        return "true yeah " + res;
    }
    
    @Path("{id}/{intitule}/{description}/{niveau}/{duree}/{capMax}/{capMin}")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String updateFormation(@PathParam("id") int idFormation, @PathParam("intitule") String intituleFormation,@PathParam("description")  String descriptionFormation,@PathParam("niveau")  int niveauFormation,@PathParam("duree")  String dureeFormation,@PathParam("capMax")  int capMaxFormation,@PathParam("capMin")  int capMinFormation) {
        
        boolean res = serviceFormation.updateFormation(idFormation,intituleFormation, descriptionFormation, niveauFormation, dureeFormation, capMaxFormation, capMinFormation);
        return "okay " + res;
    }
    

    private ServiceFormationLocal lookupServiceFormationLocal() {
        try {
            javax.naming.Context c = new InitialContext();
            return (ServiceFormationLocal) c.lookup("java:global/TechnicoCommercial-ear/TechnicoCommercial-ejb-1.0-SNAPSHOT/ServiceFormation!services.ServiceFormationLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    
    
}