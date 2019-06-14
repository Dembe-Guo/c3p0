package Dao;

import bean.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDao {
    //查询所有user对象

    public User login(User user) throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "select * from text where username=? and password=?";
        User query = queryRunner.query(sql, new BeanHandler<User>(User.class), user.getUsername(), user.getPassword());
        return query;
    }
//判断注册是否成功
    public boolean register(User user) throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql ="insert into text values(NULL,?,?,?,?,?)";
        Object param [] ={user.getUsername(),user.getPassword(),user.getSex(),user.getBirthday(),user.getEmail()};
        int row = queryRunner.update(sql, param);
        return row>0;
    }
//查询是否有某用户
    public User find(String username) throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "select username from text where username = ?";
         User query = queryRunner.query(sql, new BeanHandler<User>(User.class), username);
         return query;
    }
//查询用户所有信息
    public List<User> find_all(String username) throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "select * from text where username=?";
        List<User> query = queryRunner.query(sql, new BeanListHandler<User>(User.class), username);
        return query;
    }
    //修改个人资料
    public boolean modify(User user, int id) throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql ="update text set username=?,password=?,sex=?,birthday=?,email=? where id=?";
        int update = queryRunner.update(sql, user.getUsername(), user.getPassword(), user.getSex(), user.getBirthday(), user.getEmail(), id);
        return update>0;
    }
}
