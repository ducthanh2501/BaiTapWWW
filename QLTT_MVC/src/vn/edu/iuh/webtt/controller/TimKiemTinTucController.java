package vn.edu.iuh.webtt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.edu.iuh.webtt.dao.TinTucDAO;
import vn.edu.iuh.webtt.entities.TinTuc;

/**
 * Servlet implementation class TimKiemTinTucController
 */
@WebServlet("/timkiemTinTuc")
public class TimKiemTinTucController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimKiemTinTucController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/TimKiemTinTuc.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	String matt= request.getParameter("maTT");
	TinTucDAO tinTucDAO = new TinTucDAO();
	TinTuc tinTuc = tinTucDAO.findByID(Integer.parseInt(matt));
	
	request.setAttribute("tt", tinTuc);
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/TimKiemTinTuc.jsp");
	dispatcher.forward(request, response);
	}

}
