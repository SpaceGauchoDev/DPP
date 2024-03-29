/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.User;

import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class PlayerProfile extends UserProfile {
    int myFunds;

    public int getFunds() {
        return myFunds;
    }

    @Override
    public boolean isValid(){
        if (Utils.nullOrEmpty(myId))
            return false;

        if (Utils.nullOrEmpty(myPass))
            return false;

        if (Utils.nullOrEmpty(myFullName))
            return false;
        
        if (myFunds <= 0)
            return false;
        
        return true;
    }

    public PlayerProfile(String aId, String aPass, String aFullName, int aFunds) {
        myId = aId;
        myPass = aPass;
        myFullName = aFullName;
        myFunds = aFunds;
        myUserEnum = UserProfileEnum.U_PLAYER;
    }
}
