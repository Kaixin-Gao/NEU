/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Max
 */
public class VitalSigns {
    private double temp;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getBloodpressure() {
        return bp;
    }

    public void setBloodpressure(double bloodpressure) {
        this.bp = bloodpressure;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }
    private double bp;
    private String date;
    private int pulse;
    
    @Override
    public String toString()
    {
        return this.date;
        
    }
}
