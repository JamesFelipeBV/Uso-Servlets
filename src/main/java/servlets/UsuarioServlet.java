package servlets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String nombre = request.getParameter("nombre");
    String correo = request.getParameter("correo");

    request.setAttribute("nombre", nombre);
    request.setAttribute("correo", correo);

    RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/resultado.jsp");
    dispatcher.forward(request, response);
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<h2>Acceso directo no permitido. Use el formulario.</h2>");
  }
}
