/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryio;

import java.util.Vector;

/**
 *
 * @author ShirkeJR
 */
public class Charwoman extends Employee{

    public Charwoman() {
        rooms = new Vector<>();
        addRooms();
        addNew();
    }

    @Override
    public void addNew() {
        System.out.println("New Charwoman recruited");
    }

    @Override
    protected void addRooms() {
        rooms.add(3);
        rooms.add(1);
        rooms.add(4);
    }
    
}
