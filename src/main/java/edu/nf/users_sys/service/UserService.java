package edu.nf.users_sys.service;

import edu.nf.users_sys.dao.UserDao;
import edu.nf.users_sys.dao.impl.UserDaoImpl;
import edu.nf.users_sys.entity.Users;

import java.util.List;

/**
 * @author HPJack
 * @date 2020/11/25 - 20:10
 */
public class UserService {

    /**
     * 获取所有用户信息
     * @return
     */
    public List<Users> list(){
        UserDao dao = new UserDaoImpl();
        return dao.list();
    }

    /**
     * 用户登录
     * @param uname
     * @param upwd
     * @return
     */
    public int selUser(String uname, String upwd){
        UserDao dao = new UserDaoImpl();
        Users user = dao.selUser(uname,upwd);
        if(user != null){
            if (user.getPassword().equals(upwd)){
                return 1;
            }
        }
        return 0;
    }

    /**
     * 用户注册
     * @param user
     */
    public void addUser(Users user){
        UserDao dao = new UserDaoImpl();
        dao.addUser(user);
    }

}
