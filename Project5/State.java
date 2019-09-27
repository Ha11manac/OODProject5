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
public interface State {
    //atm
        //no card
        ////card inserded
        //no money
        //money given
    public void insertCard();
    public void ejectCard();
    public void pressButton();
    public void giveMoney();
    
    public void restart();
            
}
