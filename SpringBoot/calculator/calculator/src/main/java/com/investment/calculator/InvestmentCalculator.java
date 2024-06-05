package com.investment.calculator;
public class InvestmentCalculator {

    private double principle;
    private double rate;
    private double time;
    private  double yearFrequency;

    public double getPrinciple() {
        return principle;
    }
    public double getYearFrequency() {
        return yearFrequency;
    }
    public void setYearFrequency(double yearFrequency) {
        this.yearFrequency = yearFrequency;
    }
    public void setPrinciple(double principle) {
        this.principle = principle;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getTime() {
        return time;
    }
    public void setTime(double time) {
        this.time = time;
    }
    
    
}
