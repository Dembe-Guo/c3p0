package Dao;

import bean.data;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class DataDao {

    public List<data> show() throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "select * from data";
        List<data> query = queryRunner.query(sql, new BeanListHandler<>(data.class));
        return query;   //返回list集合传给dataservice;
    }

    public boolean store(String username,String names,String nums,String prices) throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "insert into data values(?,?,?,?)";
        int update = queryRunner.update(sql, username,names,nums,prices);
        return update>0;
    }

    public List<data> find(String username) throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "select * from data where username=?";
        List<data> query = queryRunner.query(sql, new BeanListHandler<>(data.class), username);
        return query;
    }
}
