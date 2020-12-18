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

//    public String toString() {
//        StringBuffer result = new StringBuffer();
//        result.append("\nMighty Gumball, Inc.");
//        result.append("\nJava-enabled Standing Gumball Model #2004\n");
//        result.append("Inventory: " + machine.getCount() + " gumball");
//        if (count != 1) {
//            result.append("s");
//        }
//        result.append("\nMachine is ");
//        if (state == SOLD_OUT) {
//            result.append("sold out");
//        } else if (state == NO_QUARTER) {
//            result.append("waiting for quarter");
//        } else if (state == HAS_QUARTER) {
//            result.append("waiting for turn of crank");
//        } else if (state == SOLD) {
//            result.append("delivering a gumball");
//        }
//        result.append("\n");
//        return result.toString();
//    }

}
