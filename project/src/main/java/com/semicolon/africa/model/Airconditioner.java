package main.java.com.semicolon.africa.model;

public class Airconditioner {
    private boolean itIsOn;
    private boolean itIsOff;
    private int temperature;

    public Airconditioner(){
        this.itIsOn = false;
        this.itIsOff = false;
    }
    public void setMyAirconditionerToOn() {
        itIsOn = true;
    }
    public boolean itIsOn() {
        return itIsOn;
    }

    public void setMyAirconditionerToOff() {
        itIsOff = true;
    }
    public boolean itIsOff() {
        return itIsOff;
    }
    public void setMyAirconditionerTemperature(int control) {
       if(control <= 30 && control >= 16){

            temperature = control;
            itIsOn = false;
       }
    }
    public int getTemperature() {
        return temperature;
    }
}
