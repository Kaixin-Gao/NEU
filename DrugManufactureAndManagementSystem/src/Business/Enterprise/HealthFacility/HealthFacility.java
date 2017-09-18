/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.HealthFacility;

import Business.Enterprise.Enterprise;
import Business.Role.Role;
import java.util.ArrayList;
import Business.Role.HealthFacility.HealthFacilityAdminRole;
/**
 *
 * @author zhang
 */
public class HealthFacility extends Enterprise {
    public HealthFacility(String name, EnterpriseType type) {
        super(name, type.HealthFacility);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HealthFacilityAdminRole());
        return roles;
    }
}
