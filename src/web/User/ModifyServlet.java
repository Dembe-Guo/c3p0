package web.User;

import bean.User;
import service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/Modify")
public class ModifyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /*------拿到username 进行查询---------*/
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        userService userService = new userService();
        try {
            List<User> all = userService.find_all(username);
            int id = all.get(0).getId();  //查询list集合中的id的值
            /*-----将查询到的id存入session---------*/
            HttpSession session1 = request.getSession();
            session1.setAttribute("id",id);

            request.setAttribute("all",all);
            request.getRequestDispatcher("Modify.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
