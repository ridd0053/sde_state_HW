package com.hz;

public class GumballMachine {
    GumballMonitor gumballMonitor = new GumballMonitor(this);

    private GumballMoneyState currentState;
    int count = 0;

    public GumballMachine(int count) {
        currentState = new NoQuarter(this);
        this.count = count;
    }
    public String getState(){
        return currentState.getState();
    }

    public int getCount(){
        return count;
    }
    public void dispenseGumball(){
        this.count -= 1;
    }

    public void changeState(GumballMoneyState state){
        currentState = state;
    }
    public void refill(int numGumBalls){
        count = numGumBalls;
    }

    public void insertQuarter(){
        currentState.insertQuarter();
    }
    public void ejectQuarter(){
        currentState.ejectQuarter();
    }
    public void turnCrank(){
        currentState.turnCrank();
    }
    public void dispense(){
        currentState.dispense();
    }

}
