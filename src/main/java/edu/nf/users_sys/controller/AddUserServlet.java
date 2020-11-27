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
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author HPJack
 * @date 2020/11/26 - 15:37
 */
@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("uname");
        String pwd = req.getParameter("upwd");
        int age = Integer.valueOf(req.getParameter("age"));
        String sex = req.getParameter("sex");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String tel = req.getParameter("tel");
        try {
            Date birthday = new SimpleDateFormat().parse(req.getParameter("birthday"));
            Users user = new Users();
            user.setName(name);
            user.setPassword(pwd);
            user.setEmail(email);
            user.setAddress(address);
            user.setAge(age);
            user.setSex(sex);
            user.setU_tel(tel);
            user.setBirthday(birthday);
            //创建业务层
            UserService service = new UserService();
            service.addUser(user);
            String json = new Gson().toJson(null);
            resp.setContentType("application/json;character=UTF-8");
            resp.getWriter().println(json);

        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("添加失败！");
        }
    }

}
