package edu.nf.user_sys.test;

import edu.nf.users_sys.dao.UserDao;
import edu.nf.users_sys.dao.impl.UserDaoImpl;
import edu.nf.users_sys.entity.Users;
import org.junit.Test;

import java.util.List;

/**
 * @author HPJack
 * @date 2020/11/26 - 11:36
 */
public class TestUserDao {
    @Test
    public void testSelUser(){
        UserDao dao = new UserDaoImpl();
        Users user = dao.selUser("张三","123");
        System.out.println(user.getSex()+user.getPassword()+user.getAddress()+user.getEmail());
    }

    @Test
    public void testList() {
        UserDao dao = new UserDaoImpl();
        List<Users> users = dao.list();
        users.forEach(user -> {
            System.out.println(user.getSex()+user.getPassword()+user.getAddress()+user.getEmail());
        });
    }


}
