/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Drug.Drug;
import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhang
 */
public class Patient extends Employee {
    
    
    private int PatientID;
    private static int n=0;
    private String address;
    
    public Patient() {
        n++;
        PatientID=n;
    }
   

    public int getPatientID() {
       
        return PatientID;
    }
    
    
   

   

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
}
