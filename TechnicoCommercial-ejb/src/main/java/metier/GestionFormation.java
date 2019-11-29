/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import com.google.gson.Gson;
import entities.Formation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.Stateless;
import services.ServiceFormationLocal;

/**
 *
 * @author ludoviclajournade
 */
@Stateless
public class GestionFormation implements GestionFormationLocal {
    
    private Gson gson;
    private HashMap<Integer, Formation> formations;
    private int lastId;

    public GestionFormation() {
        gson = new Gson();
        this.formations = new HashMap<>();
        this.lastId=0;
        init();
    }

    private void init() {
        addFormation("f1","Formation 1",1,"1 heure 30",10,1);
        addFormation("f2","Formation 2",1,"1 heure 30",10,1);
        addFormation("f3","Formation 3",1,"1 heure 30",10,1);
        addFormation("f4","Formation 4",1,"1 heure 30",10,1);
        addFormation("f5","Formation 5",1,"1 heure 30",10,1);
    }

   
    @Override
    public Collection<Formation> getFormations() {
        return formations.values();
    }
    
    @Override
    public boolean addFormation(String intituleFormation, String descriptionFormation, int niveauFormation, String dureeFormation, int capMaxFormation, int capMinFormation) {
        int idFormation=lastId+1;
        Formation f = new Formation(idFormation,intituleFormation,descriptionFormation,niveauFormation,dureeFormation,capMaxFormation,capMinFormation);
        formations.put(idFormation,f);
        lastId=idFormation;
        return true;
    }

    @Override
    public Formation getFormation(String id) {
        return  formations.get(id);
    }

    @Override
    public boolean addFormation(String formationJson) {
        Formation formation = gson.fromJson(formationJson, Formation.class);
        formations.put(formation.getIdFormation(),formation);
        return true;
    }

    @Override
    public boolean updateFormation(int idFormation, String intituleFormation, String descriptionFormation, int niveauFormation, String dureeFormation, int capMaxFormation, int capMinFormation) {
        Formation f = new Formation(idFormation,intituleFormation,descriptionFormation,niveauFormation,dureeFormation,capMaxFormation,capMinFormation);
        formations.remove(idFormation);
        formations.put(idFormation,f);
        return true;
    }
}
