/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Manufactory.ManufactoryOrganizationRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Manufactory.CompoundManufactoryOrganization;
import Business.Organization.Manufactory.DrugManufactoryOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Interface.CompoundManufactoryRole.CompoundManufactoryJPanel;
import Interface.DrugManufactoryRole.DrugManufactoryWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author zhang
 */
public class CompoundManufactoryRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new CompoundManufactoryJPanel( userProcessContainer, account, (CompoundManufactoryOrganization) organization,  enterprise);
    }
}
