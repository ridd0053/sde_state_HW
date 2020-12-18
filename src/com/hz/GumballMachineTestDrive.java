package com.hz;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);


//        gumballMachine.dispense();
//        monitor.getResult();
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.dispense();
//        monitor.getResult();
//
//        gumballMachine.insertQuarter();
//        gumballMachine.ejectQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.dispense();
//        monitor.getResult();
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.dispense();
//        monitor.getResult();

        monitor.getResult();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        monitor.getResult();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        monitor.getResult();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        monitor.getResult();
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        monitor.getResult();

        gumballMachine.insertQuarter();
        monitor.getResult();
        gumballMachine.turnCrank();
        monitor.getResult();
    }
}
