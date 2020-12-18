package com.hz;

public class GumballMonitor {
    private GumballMachine machine;

    public GumballMonitor(GumballMachine machine){
            this.machine = machine;
    }
    public void report(){
        System.out.println("Current inventory " + machine.getCount() + " gumballs");
    }

}
