/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandio;

/**
 *
 * @author ShirkeJR
 */
public class MakingNoiseCommand implements ICommand{
    Car c;

    public MakingNoiseCommand(Car c) {
        this.c = c;
    }

    @Override
    public void execute() {
        c.makeNoise();
    }
    
}
