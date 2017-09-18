/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.ClinicalTrial.ClinicalTrialOrganizationRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicalTrial.ScientistOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Interface.DoctorRole.DoctorWorkAreaJPanel;
import Interface.ScientistRole.ScientistWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author zhang
 */
public class ScientistRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new ScientistWorkAreaJPanel( userProcessContainer,  account,  (ScientistOrganization)organization, enterprise,business);
    }
}
