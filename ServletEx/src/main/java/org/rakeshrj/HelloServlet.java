package org.rakeshrj;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res){
         //whatever data coming from the client, will be stored in req object &
         // whatever data you want to senD BACK to the client,
        // will be present in the res object
        System.out.println("In Service");
    }

}
