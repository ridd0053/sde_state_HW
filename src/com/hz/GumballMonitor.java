package com.hz;

public class GumballMonitor {
    private GumballMachine machine;


    public GumballMonitor(GumballMachine machine){
            this.machine = machine;

    }
    public String report(){
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + machine.getCount() + " gumball");

        if (machine.getCount() != 1) {
            result.append("s");
        }

        result.append("\nMachine is ");
        result.append(machine.getState());
        result.append("\n");

        return result.toString();
    }

    public void getResult(){
        System.out.println(this.report());
    }

}
