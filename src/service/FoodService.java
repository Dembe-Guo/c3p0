package service;

import Dao.FoodDao;
import bean.Food;

import java.sql.SQLException;
import java.util.List;

public class FoodService {

        //查找所有食物
    public List<Food> findFood() {
        FoodDao foodDao = new FoodDao();
        List<Food> foods = foodDao.find();
        return foods;


    }
        //添加食物
    public int add(Food food) throws SQLException {
        FoodDao foodDao = new FoodDao();
        int add = foodDao.add(food);
        return add;
    }
            //删除
        public int delete(String queryString) throws SQLException {
            FoodDao foodDao = new FoodDao();
            int delete = foodDao.delete(queryString);
            return delete;
        }
}
