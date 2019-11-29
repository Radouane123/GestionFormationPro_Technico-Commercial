/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author ludoviclajournade
 */
public class Salle {
    private int idSalle;
    private int capaciteSalle;
    private String nomSalle;

    public Salle(int idSalle, int capaciteSalle, String nomSalle) {
        this.idSalle = idSalle;
        this.capaciteSalle = capaciteSalle;
        this.nomSalle = nomSalle;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public int getCapaciteSalle() {
        return capaciteSalle;
    }

    public void setCapaciteSalle(int capaciteSalle) {
        this.capaciteSalle = capaciteSalle;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }
}
