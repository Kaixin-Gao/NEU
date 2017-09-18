/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.ClinicalTrial;
import Business.Enterprise.Enterprise;
import Business.Role.ClinicalTrial.ClinicalTrialAdminRole;

import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author zhang
 */
public class ClinicalTrial extends Enterprise {
     public ClinicalTrial(String name, EnterpriseType type) {
        super(name, type.ClinicalTrial);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ClinicalTrialAdminRole());
        return roles;
    }
}
