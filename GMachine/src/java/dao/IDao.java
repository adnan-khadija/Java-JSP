/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Salle;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface IDao  <T> {
    boolean create (T o) ;
    boolean delete (T o) ;
    boolean update (T o);
    T findById (int id);
    List<T> findAll ();
  
}
