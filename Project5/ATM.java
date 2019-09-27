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
public class ATM {
    State hasCard;
    State noCard;
    State moneyGiven;
    State noMoney;
    
    State state;
    int money =0;
    
    public ATM(int amountInMachine) {
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        moneyGiven = new MoneyGiven(this);
        noMoney = new NoMoney(this);
        
        this.money = amountInMachine;
        if (amountInMachine >20) {
            state = noCard;
        }
        else{
            state = noMoney;
        }
    }
    
    public void insertCard(){
        state.insertCard();
    }
    public void ejectCard(){
        state.ejectCard();
    }
    public void pressButton(){
        state.pressButton();
        //prints line that says what is given
        state.giveMoney();
        
    }
    
    void releaseMoney() {
        System.out.println("$20 was placed in the tray...");
        if (money > 20) {
                money = money - 20;
        }
    }
    
    int getMoney() {
        return money;
    }
 
    void restate(int money) {
        this.money += money;
        System.out.println("The ATM was restarted;\nIt's new balance is: " + this.money + "\n");
        state.restart();
    }
    
    void setState(State state) {
        //allows state to change
        this.state = state;
    }
    
    public State getState() {
        //return state
        return state;
    }

    public State getNoMoney() {
        return noMoney;
    }

    public State getNoCard() {
        return noCard;
    }

    public State getHasCard() {
        return hasCard;
    }

    public State getMoneyGiven() {
        return moneyGiven;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nLonely ATM");
        result.append("\nStandard ATM");
        result.append("\nCurrent amount: $" + money);
        result.append("\n");
        result.append(state+ "\n");
        return result.toString();
    }
    
}
