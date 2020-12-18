package com.hz;

public class SoldOutState implements GumballMoneyState{

    private GumballMachine machine;

    SoldOutState(GumballMachine machine){
        this.machine = machine;

    }

    @Override
    public String getState() {
        return "Sold out";
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
        this.dispense();
    }

    @Override
    public void dispense() {
        System.out.println("Oops, out of gumballs!");
        machine.refill(10);
        machine.changeState(new NoQuarter(machine));


    }
}
