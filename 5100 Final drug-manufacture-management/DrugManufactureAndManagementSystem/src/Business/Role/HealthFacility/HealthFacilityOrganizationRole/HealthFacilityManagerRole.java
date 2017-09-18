/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.HealthFacility.HealthFacilityOrganizationRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HealthFacility.HealthFacilityManagerOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Interface.AdministrativeRole.ClinicalTrial.ClinicalTrialAdminWorkAreaJPanel;
import Interface.HealthFacilityManagerRole.HealthFacilityManagerWorkAreaJPanel;
import Interface.HealthFacilityManagerRole.ManagePatientJPanel;
import javax.swing.JPanel;

/**
 *
 * @author zhang
 */
public class HealthFacilityManagerRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new HealthFacilityManagerWorkAreaJPanel( userProcessContainer,  account, (HealthFacilityManagerOrganization) organization,  enterprise, business);
    }
}
