package com.ocp.java.mock.test2;

public class Q23 {
}

/*

If an operation requires a specific permission, then every frame on the stack must have that permission for the call
to succeed.
Guideline 9-1 / ACCESS-1: Understand how permissions are checked The standard security check ensures that each frame
in the call stack has the required permission. That is, the current permissions in force is the intersection of the
permissions of each frame in the current access control context. If any frame does not have a permission, no matter
where it lies in the stack, then the current context does not have that permission.


Callback methods are generally invoked from the system with full permissions.
Guideline 9-2 / ACCESS-2: Beware of callback methods Callback methods are generally invoked from the system with full
 permissions. It seems reasonable to expect that malicious code needs to be on the stack in order to perform an
 operation, but that is not the case. Malicious code may set up objects that bridge the callback to a security
 checked operation. For instance, a file chooser dialog box that can manipulate the filesystem from user actions, may
  have events posted from malicious code. Alternatively, malicious code can disguise a file chooser as something
  benign while redirecting user events.  Callbacks are widespread in object-oriented systems. Examples include the
  following:  Static initialization is often done with full privileges Application main method Applet/Midlet/Servlet
  lifecycle events Runnable.run


Newly constructed threads are executed with the access control context that was present when the Thread object was
constructed.
Guideline 9-7 / ACCESS-7: Understand how thread construction transfers context Newly constructed threads are executed
 with the access control context that was present when the Thread object was constructed. In order to prevent
 bypassing this context, void run() of untrusted objects should not be executed with inappropriate privileges.
 */


