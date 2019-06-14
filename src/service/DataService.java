package service;

import Dao.DataDao;
import bean.data;

import java.sql.SQLException;
import java.util.List;

public class DataService {

    public List<data> show() throws SQLException {
        DataDao dataDao = new DataDao();
        List<data> show = dataDao.show();
        return show;
    }

    public boolean store(String username, String name, String num, String price) throws SQLException {
        DataDao dataDao = new DataDao();
        boolean store = dataDao.store(username,name,num,price);
        return store;
    }

    public List<data> find(String username) throws SQLException{
        DataDao dataDao = new DataDao();
       List<data> query =  dataDao.find(username);
       return query;
    }
}
