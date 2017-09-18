/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Manufactory;

import Business.Organization.Organization;
import Business.Role.Manufactory.ManufactoryOrganizationRole.CompoundManufactoryRole;
import Business.Role.Manufactory.ManufactoryOrganizationRole.DrugManufactoryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhang
 */
public class DrugManufactoryOrganization extends Organization{
       public DrugManufactoryOrganization() {
        super(Organization.ManufactoryType.DrugManufactory.getValue());
    }

    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DrugManufactoryRole());
        return roles;
    }
}
