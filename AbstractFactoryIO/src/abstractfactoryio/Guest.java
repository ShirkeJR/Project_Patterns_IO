/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryio;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author ShirkeJR
 */
public class Guest extends Employee{

    public Guest() {
        rooms = new Vector<>();
        addRooms();
        addNew();
    }

    @Override
    public void addNew() {
        System.out.println("New guest booked");
    }

    @Override
    protected void addRooms() {
       Random r = new Random();
       rooms.add(r.nextInt(40)+1);
    }
    
}
