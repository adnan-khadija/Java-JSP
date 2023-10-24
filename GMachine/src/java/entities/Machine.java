/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;

/**
 *
 * @author lenovo
 */
@Entity
@NamedNativeQuery( name = "q1" ,query = "Select m.* FROM machine m WHERE salle_id=:id", resultClass = Machine.class)

public class Machine implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id ;
   private String rf;
   private String marque;
   private double prix;
   @ManyToOne
   private Salle salle;

    public Machine() {
    }

    public Machine(String rf, String marque, double prix, Salle salle) {
        this.rf = rf;
        this.marque = marque;
        this.prix = prix;
        this.salle = salle;
    }

    public void setId(int id) {
        this.id = id;
    }


    
    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }
    

    public int getId() {
        return id;
    }

    public String getRf() {
        return rf;
    }

    public void setRf(String rf) {
        this.rf = rf;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", rf=" + rf + ", marque=" + marque + ", prix=" + prix + ", salle=" + salle + '}';
    }

   
   
       
  
    
}
