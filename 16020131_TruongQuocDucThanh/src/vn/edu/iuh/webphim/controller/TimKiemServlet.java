package vn.edu.iuh.webphim.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.edu.iuh.webphim.dao.FilmDAO;
import vn.edu.iuh.webphim.entities.Film;

/**
 * Servlet implementation class TimKiemServlet
 */
@WebServlet("/timKiem")
public class TimKiemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TimKiemServlet() {
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
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/TimKiemForm.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String ngay = request.getParameter("ngay");
		FilmDAO filmDAO = new FilmDAO();
		ArrayList<Film> ds = new ArrayList<Film>();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		List<Film> dsPhim = filmDAO.getAll();
		for (int i = 0; i < dsPhim.size(); i++) {
			String strAfterfomat = df.format(dsPhim.get(i).getNgayKhoiChieu());
			if (ngay.equals(strAfterfomat))
				ds.add(dsPhim.get(i));	
		}
		request.setAttribute("phim", ds);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/TimKiemForm.jsp");
		dispatcher.forward(request, response);
	}

}
