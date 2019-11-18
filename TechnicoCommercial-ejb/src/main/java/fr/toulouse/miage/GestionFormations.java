/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.toulouse.miage;

import javax.ejb.Stateless;

/**
 *
 * @author ludoviclajournade
 */
@Stateless
public class GestionFormations implements GestionFormationsLocal {

    @Override
    public void annulerFormation(String idIFormation) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verifExistFormation(String idIFormation) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
