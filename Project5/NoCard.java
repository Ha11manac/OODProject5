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
public class NoCard implements State{
    ATM atm;

    public NoCard(ATM atm) {
        this.atm = atm;
    }
    
    @Override
    public void insertCard() {
        System.out.println("Card was inserted");
        atm.setState(atm.getHasCard());
    }

    @Override
    public void ejectCard() {
        System.out.println("No card is in machine");
    }

    @Override
    public void pressButton() {
        System.out.println("Nothing Happened: Please insert card");
    }

    @Override
    public void giveMoney() {
        System.out.println("You need to insert your card first");
    }

    @Override
    public void restart() {}
    
    public String toString(){
        return "waiting for card";
    } 
    
}
