package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    //constructors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        //registerIn401k
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);

    }

    //accessors (getters and setters)
    public void payTaxes(){
        double taxes = getSalary() * TaxPayer.SALARIED_TAX_RATE;
        System.out.println(getName() + " pays " + taxes);
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "SalariedEmployee: " + "name: " + getName() + " " +
                "hire date: " + getHireDate() + " " + "salary= " + salary ;
    }
}