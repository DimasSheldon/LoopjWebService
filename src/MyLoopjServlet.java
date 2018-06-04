/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Sheldon
 */

@WebServlet(name = "/MyLoopjServlet")
public class MyLoopjServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    super.doGet(req, resp);

    JSONObject jsonObject = new JSONObject();
    try {
      jsonObject.put("MessageServerGET", "This is message from server doGet()");
      PrintWriter out = resp.getWriter();
      out.write(jsonObject.toString());
    } catch (JSONException e) {
      e.printStackTrace();
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    super.doPost(req, resp);

    JSONObject jsonObject = new JSONObject();
    try {
      jsonObject.put("MessageServerPOST", "This is message from server doPost()");
      PrintWriter out = resp.getWriter();
      out.write(jsonObject.toString());
    } catch (JSONException e) {
      e.printStackTrace();
    }

    //    try {
    //      JSONObject jsono = new JSONObject();
    //      jsono.put("username", "dimas");
    //      jsono.put("hashPassword", "dimas12345");
    //      PrintWriter out = response.getWriter();
    //      out.write(jsono.toString());
    //      // pw.print(jsono.toString());
    //    } catch (JSONException ex) {
    //      Logger.getLogger(MyLoopjServlet.class.getName()).log(Level.SEVERE, null, ex);
    //    }
  }
}