/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project5;

/**
 *
 * @author pokem
 */
public class FieldTest {
    public static void main(String[] args){
        ATM atm = new ATM(50);
        
        System.out.println(atm);
        
        atm.insertCard();
        atm.pressButton();
        
        System.out.println(atm);
        
        atm.insertCard();
        atm.pressButton();
        
        System.out.println(atm);
        
        atm.restate(100);
        atm.insertCard();
        atm.pressButton();
        
        System.out.println(atm);
        
        
    }
}
