/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Study;

import Business.Patient.Gene;

/**
 *
 * @author zhang
 */
public class Study {
    private String studyName;
    private Gene studyType;
    private String status;

    public String getStudyName() {
        return studyName;
    }

    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }

    public Gene getStudyType() {
        return studyType;
    }

    public void setStudyType(Gene studyType) {
        this.studyType = studyType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
