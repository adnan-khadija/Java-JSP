/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.IDao;
import dao.MachineIDao;
import entities.Machine;
import entities.Salle;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;
import service.SalleService;
import util.HibernateUtil;

/**
 *
 * @author lenovo
 */
public class Test {
    public static void main(String[] args) {
       
      
            MachineService dao1 = new MachineService();
            SalleService dao2=new SalleService();
         /*dao2.create(new Salle("Salle1"));
         dao2.create(new Salle("Salle2"));*/
       /* dao1.create(new Machine("MD", "Lenovo", 4000,dao2.findById(1)));
        dao1.create(new Machine("HE", "HP", 5000,dao2.findById(1)));
        dao1.create(new Machine("D12", "Dell", 4500,dao2.findById(2)));
        dao1.create(new Machine("LJ", "Lenovo", 5000,dao2.findById(2)));*/
        for (Machine m:  dao1.findBySalle(dao2.findById(2))){
            System.out.println(m);
        }
     
        

    }
    
}
