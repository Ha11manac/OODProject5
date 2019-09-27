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
public class HasCard implements State{
    ATM atm;

    public HasCard(ATM atm) {
        this.atm = atm;
    }
    
    @Override
    public void insertCard() {
        System.out.println("Card is already inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card was Ejected");
        atm.setState(atm.getNoCard());
    }

    @Override
    public void pressButton() {
        System.out.println("Processing.......");
        atm.setState(atm.getMoneyGiven());
    }

    @Override
    public void giveMoney() {
        System.out.println("No money was placed in tray");
    }

    @Override
    public void restart() {}
    
    public String toString(){
        return "waiting for button to be presseed";
    } 
    
}
