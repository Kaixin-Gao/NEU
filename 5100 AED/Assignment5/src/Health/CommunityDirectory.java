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
public class CommunityDirectory {
    List<Community> communityList;

    public List<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(List<Community> communityList) {
        this.communityList = communityList;
    }

    CommunityDirectory() {
        communityList = new ArrayList<>();
    }

    public Community addCommunity() {
        Community c = new Community();
        communityList.add(c);
        return c;
    }
}
