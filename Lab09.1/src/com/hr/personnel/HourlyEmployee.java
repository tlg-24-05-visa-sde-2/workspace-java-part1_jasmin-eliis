package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    //fields
    private double rate;
    private double hours;

    //constructors
    public void pay(){
        double payment = getRate() + getHours();
        System.out.println(getName() +" is paid hourly " + payment);
    }

    public void payTaxes(){

    }
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    //accessors (getters and setters)
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String toString() {
        return "HourlyEmployee: " + "name: " + getName() + " hireDate: " + getHireDate() +
                "rate:" + rate +
                ", hours:" + getHours();
    }
}