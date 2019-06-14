package web.food;

import bean.Food;
import service.FoodService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id")) ;
            String name = request.getParameter("name");
            String price = request.getParameter("price");
            Food food = new Food();
            food.setId(id);
            food.setName(name);
            food.setPrice(price);
            FoodService foodService = new FoodService();
            int add = foodService.add(food);
            if(add == 1){
                response.getWriter().write("<script> alert(\"添加成功\");window.location=\"Add.jsp\"</script>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
