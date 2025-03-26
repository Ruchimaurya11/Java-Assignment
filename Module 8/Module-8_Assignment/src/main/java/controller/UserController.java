package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.UserDao;
import model.User;

@WebServlet("/UserController") // URL mapping
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action"); // Form se action get karein

        if ("login".equals(action)) {
            handleLogin(request, response);
        } else if ("logout".equals(action)) {
            handleLogout(request, response);
        } else {
            response.sendRedirect("login.jsp?error=Invalid Action");
        }
    }

    // ✅ Login Method
    private void handleLogin(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User(username, password);

        if (UserDao.validate(user)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("welcome.jsp"); // Success page
        } else {
            response.sendRedirect("login.jsp?error=Invalid credentials");
        }
    }

    // ✅ Logout Method
    private void handleLogout(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate(); // Session destroy karein
        }
        response.sendRedirect("login.jsp?message=Logout successful");
    }
}
