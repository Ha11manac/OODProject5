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
public class MoneyGiven implements State{
    ATM atm;

    public MoneyGiven(ATM atm) {
        this.atm = atm;
    }
    
    @Override
    public void insertCard() {
        System.out.println("Please wait money is being placed in tray");
    }

    @Override
    public void ejectCard() {
        System.out.println("Sorry button was already pressed");
    }

    @Override
    public void pressButton() {
        System.out.println("You already did this, Please Wait.");

    }

    @Override
    public void giveMoney() {
        atm.releaseMoney();
        
        if(atm.getMoney() > 20){
            atm.setState(atm.getNoCard());
            
        }
        else{
            System.out.println("You took the last $20 from the machine");
            atm.setState(atm.getNoMoney());
        }
        //needed becasue state is set back to no card/no money
           System.out.println("Card was ejected");
    }

    @Override
    public void restart() {}
    
    public String toString(){
        return "Money is in the tray";
    } 
    
}
