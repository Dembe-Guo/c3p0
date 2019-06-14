package web.food;

import Dao.DataDao;
import bean.data;
import service.DataService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

@WebServlet("/sub_food")
public class Sub_foodServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] names = request.getParameterValues("name");
        String[] nums = request.getParameterValues("num");
        String[] prices = request.getParameterValues("price");
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        System.out.println(username);
        System.out.println(names[1]);
        DataService dataService = new DataService();
        Boolean j=false;
        for(int i=0;i<names.length;i++){
            try {
                boolean store = dataService.store(username, names[i], nums[i], prices[i]);
                j=store;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
            if(j==true){
                response.getWriter().write("<script>alert('提交订单成功，请耐心等待');window.location='food'</script>");
            }
    }
}
