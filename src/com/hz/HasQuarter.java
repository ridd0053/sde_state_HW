package com.hz;

public class HasQuarter implements GumballMoneyState{

    private GumballMachine machine;

    HasQuarter(GumballMachine machine){

        this.machine = machine;

    }

    @Override
    public String getState() {
        return "Has Quarter";
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        machine.changeState(new NoQuarter(machine));
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        machine.changeState(new SoldState(machine));
        new SoldState(machine).dispense();

    }

    @Override
    public void dispense() {

        System.out.println("No gumball dispensed");
    }
}
