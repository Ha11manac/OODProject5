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
public class NoMoney implements State{
    ATM atm;

    public NoMoney(ATM atm) {
        this.atm = atm;
    }
    
    @Override
    public void insertCard() {
        System.out.println("No money in machine. Card declined");
    }

    @Override
    public void ejectCard() {
        System.out.println("No Card is in the machine");
    }

    @Override
    public void pressButton() {
        System.out.println("Button was pressed but the machine is out of money");
    }

    @Override
    public void giveMoney() {
        System.out.println("No money was placed in tray");
    }

    @Override
    public void restart() {
        atm.setState(atm.getNoCard());
    }
    
    public String toString(){
        return "Out of Money";
    } 
    
}
