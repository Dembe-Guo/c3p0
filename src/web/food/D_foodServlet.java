package web.food;

import service.FoodService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/delete")
public class D_foodServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String queryString = request.getQueryString();
        FoodService foodService = new FoodService();
        int delete = 0;
        try {
            delete = foodService.delete(queryString);
            if(delete == 1){
                response.getWriter().write("<script>alert('删除成功');window.location='select';</script>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
