package com.hz;

public class SoldState implements GumballMoneyState{

    private GumballMachine machine;

    SoldState(GumballMachine machine){
        this.machine = machine;

    }

    @Override
    public String getState() {
        return "Sold";
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");


    }


    @Override
    public void dispense() {
        if(machine.getCount() >= 1) {
            System.out.println("A gumball comes rolling out the slot");
            machine.dispenseGumball();
            machine.changeState(new NoQuarter(machine));
        }
        else if (machine.getCount() == 0){
                System.out.println("Oops, out of gumballs!");
                machine.changeState(new SoldOutState(machine));

            }
    }
}
