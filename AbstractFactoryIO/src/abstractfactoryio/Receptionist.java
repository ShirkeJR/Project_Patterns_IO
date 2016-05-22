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
public class Receptionist extends Employee{

    public Receptionist() {
        rooms = new Vector<>();
        addRooms();
        addNew();
    }

    @Override
    public void addNew() {
        System.out.println("New receptionist recruited");
    }

    @Override
    protected void addRooms() {
        for(int i = 1; i<=40; i++){
            if(i != 20 && i!= 40 && i != 1 && i!= 2)
                rooms.add(i);
        }
    }
    
}
