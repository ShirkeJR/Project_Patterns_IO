/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyio;

/**
 *
 * @author ShirkeJR
 */
public class IndividualPersonStrategy implements TypeOfPersonStrategy{

    @Override
    public float SettleTax(float value) {
        if(value <= 100000f) return value * 0.15f;
        else return value * 0.3f;
    }

}
