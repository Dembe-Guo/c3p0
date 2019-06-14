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

@WebServlet("/sub_modify")
public class Sub_modifyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String sex = request.getParameter("sex");
            String birthday = request.getParameter("birthday");
            String email = request.getParameter("email");
            //得到id 的值
            HttpSession session = request.getSession();
            int id = (int) session.getAttribute("id"); //数据库中的id为int类型

            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setSex(sex);
            user.setBirthday(birthday);
            user.setEmail(email);
            userService userService = new userService();
            boolean modify = userService.modify(user, id);  //传id的值给userDao依靠id进行改变
            if(modify == true){
                response.getWriter().write("<script>alert('修改成功');window.location='user';</script>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
