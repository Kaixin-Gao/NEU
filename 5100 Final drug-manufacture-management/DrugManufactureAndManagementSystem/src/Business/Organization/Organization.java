/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author zhang
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public enum ManufactoryType {
        Admin("Admin"), DrugManufactory("Drug Manufactory"),CompoundManufactory("Compound Manufactory");
        private String value;

        private ManufactoryType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
     public enum ClinicalTrialType {
        Admin("Admin"), ClinicalTrialManager("Clinical Trial Manager"),Scientist("Scientist");
        private String value;

        private ClinicalTrialType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
      public enum HealthFacilityType {
        Admin("Admin"), HealthFacilityManager("HealthFacility Manager"), Doctor("Doctor"),Patient("Patient");
        private String value;

        private HealthFacilityType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
