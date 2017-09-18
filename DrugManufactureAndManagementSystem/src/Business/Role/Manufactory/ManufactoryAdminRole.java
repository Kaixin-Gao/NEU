/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Manufactory;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Interface.AdministrativeRole.Manufactory.ManufactoryAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author zhang
 */
public class ManufactoryAdminRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new ManufactoryAdminWorkAreaJPanel(userProcessContainer,enterprise,business);
    }
}
