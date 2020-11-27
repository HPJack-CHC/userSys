package edu.nf.users_sys.dao;

import edu.nf.users_sys.entity.Users;

import java.util.List;

/**
 * @author HPJack
 * @date 2020/11/25 - 18:55
 */
public interface UserDao {

    List<Users> list();

    Users selUser (String userName,String password);

    Users addUser (Users user);

}
