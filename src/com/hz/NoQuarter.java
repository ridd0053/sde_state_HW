package com.hz;

public class NoQuarter implements GumballMoneyState{
    private GumballMachine machine;

    NoQuarter(GumballMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        machine.changeState(new HasQuarter(machine));
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
