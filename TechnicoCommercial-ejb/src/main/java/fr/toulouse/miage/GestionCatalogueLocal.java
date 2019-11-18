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
public interface GestionCatalogueLocal {
    String consultationCatalogue() throws Exception;
    void suppressionCatalogue(String idFormation) throws Exception;
    void creerFormationCatalogue(String intitule,String description, int niveau,String duree,int capMin,int capMax, double tarif) throws Exception;
    
}
