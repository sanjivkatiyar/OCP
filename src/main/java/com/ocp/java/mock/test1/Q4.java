package com.ocp.java.mock.test1;

import java.io.File;
import java.util.List;

public class Q4 {

    public static void main(String[] args) {

//        List<File> dir; //initialize dir somehow
//        public <R> List <R> executeFunction(Function < File, R > fun) {
//            List<R> l = new ArrayList<R>();
//            for (File f : dir) {
//                l.add(fun.apply(f));
//            }
//            return l;
//        }

        /*
         Change the code inside the for loop as follows:
         Permission perm = new java.io.FilePermission(f.getPath(), "read");
         PermissionCollection perms = perm.newPermissionCollection();
         perms.add(perm);
         AccessController.doPrivileged(new PrivilegedAction<Void>() {
         public Void run() {
         l.add(fun.apply(f));
         return null; }},
         new AccessControlContext(
         new ProtectionDomain[] {
         new ProtectionDomain(null, perms) }
         ) );
         */
    }
}
