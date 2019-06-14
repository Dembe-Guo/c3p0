package web.User;

import bean.User;

import service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //输出
             PrintWriter out = response.getWriter();
             //得到注册输入的数据
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String sex = request.getParameter("sex");
            String birthday = request.getParameter("birthday");
            String email = request.getParameter("email");
            //查询所有用户名
            userService userService1 = new userService();
        try {
            User i = userService1.find(username);
            if (i != null) {//判断用户是否存在
                response.getWriter().write("<script>alert('用户已存在，请重新注册');window.location='Register.jsp';</script>");
            } else {

                //封装注册用户数据
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                user.setSex(sex);
                user.setBirthday(birthday);
                user.setEmail(email);
                //检查是否插入用户数据成功
                userService userService = new userService();
                boolean register = userService.register(user);
                if (register) {
                    response.getWriter().write("<script> alert(\"注册成功\");window.location=\"JSP/Login.jsp\"</script>");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
