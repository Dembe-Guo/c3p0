package web.User;

import bean.User;
import service.userService;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        /*------------将用户名存入--------------session*/
        HttpSession session = request.getSession();
        session.setAttribute("username",username);

        if (username.equals("admin") && password.equals("123456")) {
            response.sendRedirect("Manager.jsp");
            System.out.println("进入管理页面");
        } else {
            try {
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                userService userService = new userService();
                User login = userService.login(user);

                if (login != null) {
                    response.sendRedirect("food");//重定向到FoodServlet 进行数据的查询
                } else {
                    response.getWriter().write("login error");
                    response.setHeader("refresh", "3;Login.jsp");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}

