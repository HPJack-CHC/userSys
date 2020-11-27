package edu.nf.users_sys.controller;

import com.google.gson.Gson;
import edu.nf.users_sys.entity.Users;
import edu.nf.users_sys.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author HPJack
 * @date 2020/11/25 - 20:15
 */
@WebServlet("/list")
public class ListUserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务层
        UserService service = new UserService();
        List<Users> list = service.list();
        String json = new Gson().toJson(list);
        resp.setContentType("application/json;charset=UTF-8");
        resp.getWriter().println(json);
    }

}
