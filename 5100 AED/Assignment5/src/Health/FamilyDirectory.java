/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Max
 */
public class FamilyDirectory {
    List<Family> familyList;

    public List<Family> getFamilyList() {
        return familyList;
    }

    public void setFamilyList(List<Family> familyList) {
        this.familyList = familyList;
    }

    FamilyDirectory() {
        familyList = new ArrayList<>();
    }

    public Family addFamily() {
        Family f = new Family();
        familyList.add(f);
        return f;
    }
}
