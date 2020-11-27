package edu.nf.users_sys.controller;

import com.google.gson.Gson;
import edu.nf.users_sys.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author HPJack
 * @date 2020/11/25 - 20:21
 */
@WebServlet("/login")
public class loginUserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("upwd");

        UserService service = new UserService();
        int i = service.selUser(uname,pwd);
        String json = new Gson().toJson(i);
        resp.setContentType("application/json;character=UTF-8");
        resp.getWriter().println(json);
    }

}
