package vn.edu.iuh.webtintuc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.edu.iuh.webtintuc.dao.DienThoaiDAO;
import vn.edu.iuh.webtintuc.entities.DienThoai;

/**
 * Servlet implementation class TimKiemDienThoaiController
 */
@WebServlet("/timkiemDienThoai")
public class TimKiemDienThoaiController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TimKiemDienThoaiController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/TimKiemDienThoai.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String madt = request.getParameter("maDT");
		DienThoaiDAO dienThoaiDAO = new DienThoaiDAO();
		DienThoai dienThoai = dienThoaiDAO.findByID(Integer.parseInt(madt));
		
		request.setAttribute("dt", dienThoai);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/TimKiemTinTuc.jsp");
		dispatcher.forward(request, response);
	}

}
