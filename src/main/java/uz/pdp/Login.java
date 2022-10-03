package uz.pdp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("Login.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String login = req.getParameter("username");
        String parol = req.getParameter("password");
        System.out.println(login);
        System.out.println(parol);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Kabinetga xush kelibsiz hurmatli " + login);
    }

}
