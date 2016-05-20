/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorio;

/**
 *
 * @author PiK
 */
public abstract class RulesDecorator {
    
    protected RulesDecorator _inner = null;

    public RulesDecorator(RulesDecorator inner){
        this._inner = inner;
    }
    public abstract float win();
}
