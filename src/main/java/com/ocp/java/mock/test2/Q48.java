package com.ocp.java.mock.test2;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.List;

public class Q48 {

//    public void setApprovedUsers(final List<String> userids) {
//        return AccessController.doPrivileged((PrivilegedAction<? extends Object>) <Void>) () -> {
//            this.userManager.setApprovedUsers(userids);
//            return null;
//        });
//    }
}
/*
Some candidates have reported getting a similar question. It not very clear about what is expected. Do they want the
caller of the given method to be unable to affect the system by modifying the userlist afterwards (if so, creating a
copy of the passed userids using using new ArrayList<String>(userids) is preferred), or do they want the userManager
to be unable to modify the list of approved users (if so, Collections.unmodifiableList(userids) is preferred).  If
you get such a question, your guess is as good as ours!
 */
