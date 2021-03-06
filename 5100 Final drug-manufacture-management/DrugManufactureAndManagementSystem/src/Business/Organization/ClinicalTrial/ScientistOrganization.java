/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.ClinicalTrial;

import Business.Organization.Organization;

import Business.Role.ClinicalTrial.ClinicalTrialOrganizationRole.ScientistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhang
 */
public class ScientistOrganization extends Organization {
     public ScientistOrganization() {
        super(Organization.ClinicalTrialType.Scientist.getValue());
    }

    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ScientistRole());
        return roles;
    }
}
