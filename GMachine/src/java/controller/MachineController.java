package controller;

import entities.Machine;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.MachineService;
import service.SalleService;

@WebServlet(name = "MachineController", urlPatterns = {"/MachineController"})
public class MachineController extends HttpServlet {
    private MachineService ms = new MachineService();
    private SalleService ss = new SalleService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String operation = request.getParameter("op");

        if (operation != null) {
            if (operation.equals("delete")) {
                int id = Integer.parseInt(request.getParameter("id"));
                ms.delete(ms.findById(id));
            }
        } else {
            String ref = request.getParameter("ref");
            String marque = request.getParameter("marque");
            Double prix = Double.parseDouble(request.getParameter("prix"));
            int salleId = Integer.parseInt(request.getParameter("salle"));
            ms.create(new Machine(ref, marque, prix, ss.findById(salleId)));
        }

        response.sendRedirect("Machine.jsp");
    }
}
