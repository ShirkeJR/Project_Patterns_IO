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
public class ProfessionalPersonStrategy implements TypeOfPersonStrategy{

    @Override
    public float SettleTax(float value) {
        return value * 0.2f;
    }
}
