package com.hz;

public interface GumballMoneyState {
    String getState();
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

}
