package vn.edu.iuh.webphim.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.edu.iuh.webphim.dao.CategoryDao;
import vn.edu.iuh.webphim.dao.FilmDAO;
import vn.edu.iuh.webphim.entities.Category;
import vn.edu.iuh.webphim.entities.Film;

/**
 * Servlet implementation class ThemFilmServlet
 */
@WebServlet("/themFilm")
public class ThemFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThemFilmServlet() {
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
		CategoryDao tlDAO = new CategoryDao();
		List<Category> dstl = tlDAO.getAll();

		request.setAttribute("dstl", dstl);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/FilmForm.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		String tenphim = request.getParameter("tenphim");
		String mota = request.getParameter("mota");
		String thoigianphim = request.getParameter("thoigianphim");
		String url = request.getParameter("url");
		String ngaykhoichieu = request.getParameter("ngaykhoichieu");

		String maloaiphim = request.getParameter("matheloai");

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Date ngaynhap = null;
		try {
			ngaynhap = df.parse(ngaykhoichieu);
		} catch (ParseException e1) {
			
			e1.printStackTrace();
		}

		FilmDAO filmDAO = new FilmDAO();
		CategoryDao categoryDao = new CategoryDao();
		Category category = categoryDao.findById(Integer.parseInt(maloaiphim));

		Film phim = new Film(tenphim, mota, thoigianphim, url, ngaynhap);
		phim.setTheloai(category);

		filmDAO.save(phim);
		// List<Category> dstt = categoryDao.getAll();
		// request.setAttribute("dstt", dstt);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/danhsachFilm");
		dispatcher.forward(request, response);

	}

}
