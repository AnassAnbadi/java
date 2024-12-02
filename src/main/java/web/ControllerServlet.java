package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mitier.Credit;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Credit c;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("VueCredit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double m=Double.parseDouble(request.getParameter("montant"));
		double t=Double.parseDouble(request.getParameter("taux"));
		int d=Integer.parseInt(request.getParameter("duree"));
		
		CreditModul modul=new CreditModul();
		
		modul.setM(m);
		modul.setT(t);
		modul.setD(d);
		modul.setMons(c.calculerCredit(m, t, d));
		
		request.setAttribute("creditModel",modul);
		
		request.getRequestDispatcher("VueCredit.jsp").forward(request, response);
	}

}
