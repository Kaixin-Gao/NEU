/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.Manufactory;

import Business.Enterprise.Enterprise;
import Business.Role.Role;
import java.util.ArrayList;
import Business.Role.Manufactory.ManufactoryAdminRole;
/**
 *
 * @author zhang
 */
public class Manufactory extends Enterprise {
     public Manufactory(String name, Enterprise.EnterpriseType type) {
        super(name, type.Manufactory);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManufactoryAdminRole());
        return roles;
    }
}
