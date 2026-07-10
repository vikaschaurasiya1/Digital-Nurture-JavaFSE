package com.cognizant.loan.model;

public class Loan {
    private String number;
    private String type;
    private double loan;
    private int emi;
    private int tenure;

    public Loan() {
    }

    public Loan(int emi, String number, double loan, String type, int tenure) {
        this.emi = emi;
        this.number = number;
        this.loan = loan;
        this.type = type;
        this.tenure = tenure;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public int getEmi() {
        return emi;
    }

    public void setEmi(int emi) {
        this.emi = emi;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }
}
