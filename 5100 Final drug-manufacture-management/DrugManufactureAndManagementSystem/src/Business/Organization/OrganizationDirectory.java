/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Organization.ClinicalTrial.ClinicalTrialManagerOrganization;
import Business.Organization.ClinicalTrial.ScientistOrganization;
import Business.Organization.HealthFacility.DoctorOrganization;
import Business.Organization.HealthFacility.HealthFacilityManagerOrganization;
import Business.Organization.HealthFacility.PatientOrganization;
import Business.Organization.Manufactory.CompoundManufactoryOrganization;
import Business.Organization.Manufactory.DrugManufactoryOrganization;

import Business.Organization.HealthFacility.PatientOrganization;
import java.util.ArrayList;

/**
 *
 * @author zhang
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
     public Organization createManufactoryOrganization(Organization.ManufactoryType type) {
        Organization organization = null;

        if (type.getValue().equals(Organization.ManufactoryType.DrugManufactory.getValue())) {
            organization = new DrugManufactoryOrganization();
            organizationList.add((DrugManufactoryOrganization) organization);
        } else if (type.getValue().equals(Organization.ManufactoryType.CompoundManufactory.getValue())) {
            organization = new CompoundManufactoryOrganization();
            organizationList.add((CompoundManufactoryOrganization) organization);
        } 

        return organization;
    }
     
     public Organization createClinicalTrialOrganization(Organization.ClinicalTrialType type) {
        Organization organization = null;

        if (type.getValue().equals(Organization.ClinicalTrialType.Scientist.getValue())) {
            organization = new ScientistOrganization();
            organizationList.add((ScientistOrganization) organization);
        } else if (type.getValue().equals(Organization.ClinicalTrialType.ClinicalTrialManager.getValue())) {
            organization = new ClinicalTrialManagerOrganization();
            organizationList.add((ClinicalTrialManagerOrganization) organization);
        } 

        return organization;
    }
     
      public Organization createHealthFacilityOrganization(Organization.HealthFacilityType type) {
        Organization organization = null;

        if (type.getValue().equals(Organization.HealthFacilityType.HealthFacilityManager.getValue())) {
            organization = new HealthFacilityManagerOrganization();
            organizationList.add((HealthFacilityManagerOrganization) organization);
        } else if (type.getValue().equals(Organization.HealthFacilityType.Patient.getValue())) {
            organization = new PatientOrganization();
            organizationList.add((PatientOrganization) organization);
        } else if (type.getValue().equals(Organization.HealthFacilityType.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add((DoctorOrganization) organization);
        } 

        return organization;
    }
      
     public void DeleteOrganization(Organization org) {
        organizationList.remove(org);
    }
}
