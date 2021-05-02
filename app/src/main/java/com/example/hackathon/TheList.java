package com.example.hackathon;
import java.io.Serializable;


public class TheList implements Serializable {

    private String element;
    private String rmz;
    private int imageRefrence;
    private String mass;
    private String number;



    public TheList(String element, String rmz, int imageRefrence, String mass, String number) {
        this.element = element;
        this.rmz = rmz;
       this.imageRefrence = imageRefrence;
        this.mass = mass;
        this.number = number;
    }

    public String getNumber() { return number; }

    public void setNumber(String number) { this.number = number; }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getRmz() {
        return rmz;
    }

    public void setRmz(String rmz) {
        this.rmz = rmz;
    }

    public int getImageRefrence(){
        return imageRefrence;
    }


    public void setImageRefrence(int imageRefrence) {
       this.imageRefrence = imageRefrence;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }
}