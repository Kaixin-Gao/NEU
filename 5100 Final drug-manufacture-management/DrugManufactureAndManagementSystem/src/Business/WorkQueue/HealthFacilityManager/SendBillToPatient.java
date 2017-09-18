/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue.HealthFacilityManager;

import Business.WorkQueue.WorkRequest;

/**
 *
 * @author zhang
 */
public class SendBillToPatient extends WorkRequest {
    private double bill;

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
    
    
}
