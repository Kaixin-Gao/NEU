/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.HealthFacility;

import Business.Organization.Organization;
import Business.Role.HealthFacility.HealthFacilityOrganizationRole.HealthFacilityManagerRole;
import Business.Role.PatientRole.PatientRole;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhang
 */
public class PatientOrganization extends Organization{
      public PatientOrganization() {
        super(Organization.HealthFacilityType.Patient.getValue());
    }

    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientRole());
        return roles;
    }
}
