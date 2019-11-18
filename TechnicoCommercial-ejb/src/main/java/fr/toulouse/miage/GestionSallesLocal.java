/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.toulouse.miage;

import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author ludoviclajournade
 */
@Local
public interface GestionSallesLocal {
    void creeSalle(String nom, Integer capacite) throws Exception;
    void modificationSalle(String idSalle, String nom, Integer capacite, ArrayList<String> listFormations) throws Exception;
    void suppressionSalle(String idSalle) throws Exception;
}
