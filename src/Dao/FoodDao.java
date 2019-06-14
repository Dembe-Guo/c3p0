package Dao;

import bean.Food;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;


import java.sql.SQLException;
import java.util.List;

public class FoodDao {
    //查找
    public List<Food> find(){
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "select * from food";
        List<Food> food=null;
            try {
            food = queryRunner.query(sql, new BeanListHandler<Food>(Food.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return food;
    }
//添加
    public int add(Food food) throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "insert into food values (?,?,?) ";
       int row =  queryRunner.update(sql,food.getId(),food.getName(),food.getPrice());
       return row;

    }

//删除
    public int delete(String id) throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        int ID = Integer.parseInt(id);
        String sql = "delete from food where id=?";
        int update = queryRunner.update(sql,ID);
        return update;
    }
}
