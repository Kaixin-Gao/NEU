/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.ClinicalTrial.ClinicalTrialOrganizationRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicalTrial.ClinicalTrialManagerOrganization;
import Business.Organization.ClinicalTrial.ScientistOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Interface.ClinicalTrialManagerRole.ClinicalTrialManagerWorkAreaJPanel;
import Interface.ScientistRole.ScientistWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author zhang
 */
public class ClinicalTrialManagerRole extends Role {
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new ClinicalTrialManagerWorkAreaJPanel(  userProcessContainer,  account, (ClinicalTrialManagerOrganization) organization,  enterprise,  business);
    }
}
