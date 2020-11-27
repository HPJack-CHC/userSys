package edu.nf.users_sys.dao.impl;

import edu.nf.users_sys.dao.UserDao;
import edu.nf.users_sys.entity.Users;
import edu.nf.users_sys.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author HPJack
 * @date 2020/11/25 - 19:03
 */
public class UserDaoImpl implements UserDao {

    @Override
    public List<Users> list() {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).list();
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public Users selUser(String userName, String password) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).selUser(userName,password);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public Users addUser(Users user) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).addUser(user);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
