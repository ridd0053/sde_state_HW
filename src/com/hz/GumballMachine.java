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

//    public void insertQuarter() {
//        if (state == HAS_QUARTER) {
//            System.out.println("You can't insert another quarter");
//        } else if (state == NO_QUARTER) {
//            state = HAS_QUARTER;
//            System.out.println("You inserted a quarter");
//        } else if (state == SOLD_OUT) {
//            System.out.println("You can't insert a quarter, the machine is sold out");
//        } else if (state == SOLD) {
//            System.out.println("Please wait, we're already giving you a gumball");
//        }
//    }

//    public void ejectQuarter() {
//        if (state == HAS_QUARTER) {
//            System.out.println("Quarter returned");
//            state = NO_QUARTER;
//        } else if (state == NO_QUARTER) {
//            System.out.println("You haven't inserted a quarter");
//        } else if (state == SOLD) {
//            System.out.println("Sorry, you already turned the crank");
//        } else if (state == SOLD_OUT) {
//            System.out.println("You can't eject, you haven't inserted a quarter yet");
//        }
//    }

//    public void turnCrank() {
//        if (state == SOLD) {
//            System.out.println("Turning twice doesn't get you another gumball!");
//        } else if (state == NO_QUARTER) {
//            System.out.println("You turned but there's no quarter");
//        } else if (state == SOLD_OUT) {
//            System.out.println("You turned, but there are no gumballs");
//        } else if (state == HAS_QUARTER) {
//            System.out.println("You turned...");
//            state = SOLD;
//            dispense();
//        }
//    }

//    private void dispense() {
//        if (state == SOLD) {
//            System.out.println("A gumball comes rolling out the slot");
//            count = count - 1;
//            if (count == 0) {
//                System.out.println("Oops, out of gumballs!");
//                state = SOLD_OUT;
//            } else {
//                state = NO_QUARTER;
//            }
//        } else if (state == NO_QUARTER) {
//            System.out.println("You need to pay first");
//        } else if (state == SOLD_OUT) {
//            System.out.println("No gumball dispensed");
//        } else if (state == HAS_QUARTER) {
//            System.out.println("No gumball dispensed");
//        }
//    }

//    //    public void refill(int numGumBalls) {
////        this.count = numGumBalls;
////        state = NO_QUARTER;
////    }
//

}
