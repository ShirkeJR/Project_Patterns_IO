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
public class Boss extends Employee{

    public Boss() {
        rooms = new Vector<>();
        addRooms();
        addNew();
    }

    @Override
    public void addNew() {
        System.out.println("New Boss recruited");
    }

    @Override
    protected void addRooms() {
        rooms.add(20);
        rooms.add(2);
        rooms.add(40);
        rooms.add(1);
    }
    
}
