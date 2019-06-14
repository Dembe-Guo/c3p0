package service;

import Dao.UserDao;
import bean.User;

import java.sql.SQLException;
import java.util.List;

public class userService {
    public User login(User user) throws SQLException {
        UserDao userDao = new UserDao();
        User login = userDao.login(user);
        return login;
    }
    public boolean register(User user) throws SQLException {
        UserDao userDao = new UserDao();
       boolean register = userDao.register(user);
       return register;
    }

    public User find(String username) throws SQLException {
        UserDao userDao = new UserDao();
        User i = userDao.find(username);
        return i;
    }

    public List<User> find_all(String username) throws SQLException {
        UserDao userDao = new UserDao();
        List<User> all = userDao.find_all(username);
        return all;
    }
/*修改个人资料*/
    public boolean modify(User user, int id) throws SQLException {
        UserDao userDao = new UserDao();
        boolean modify = userDao.modify(user, id);
        return modify;
    }
}
