/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.toulouse.miage;

import javax.ejb.Local;

/**
 *
 * @author ludoviclajournade
 */
@Local
public interface GestionFormationsLocal {
    void annulerFormation(String idIFormation) throws Exception;
    boolean verifExistFormation(String idIFormation) throws Exception;    
}
