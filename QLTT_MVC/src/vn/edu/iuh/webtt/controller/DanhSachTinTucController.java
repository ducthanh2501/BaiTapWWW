package vn.edu.iuh.webtt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.edu.iuh.webtt.dao.DanhMucDAO;
import vn.edu.iuh.webtt.entities.DanhMuc;

/**
 * Servlet implementation class DanhSachTinTucController
 */
@WebServlet("/danhsachTinTuc")
public class DanhSachTinTucController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachTinTucController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DanhMucDAO dmDAO = new DanhMucDAO();
		List<DanhMuc> dsdm = dmDAO.getAll();
		
		request.setAttribute("dsdm", dsdm);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/DanhSachTinTuc.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
