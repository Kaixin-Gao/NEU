/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.PatientRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HealthFacility.PatientOrganization;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Interface.AdministrativeRole.ClinicalTrial.ClinicalTrialAdminWorkAreaJPanel;
import Interface.PatientRole.PatientWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author zhang
 */
public class PatientRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        Patient p=new Patient();
        return new PatientWorkAreaJPanel( userProcessContainer,  account, p,(PatientOrganization) organization, enterprise);
    }
}
