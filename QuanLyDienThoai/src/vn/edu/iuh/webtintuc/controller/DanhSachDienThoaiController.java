package vn.edu.iuh.webtintuc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.edu.iuh.webtintuc.dao.DienThoaiDAO;
import vn.edu.iuh.webtintuc.dao.NhaCungCapDAO;
import vn.edu.iuh.webtintuc.entities.NhaCungCap;

/**
 * Servlet implementation class DanhSachDienThoaiController
 */
@WebServlet("/danhsachDienThoai")
public class DanhSachDienThoaiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachDienThoaiController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		NhaCungCapDAO nccDAO = new NhaCungCapDAO();
		List<NhaCungCap> dsncc = nccDAO.getAll();
		
		request.setAttribute("dsncc", dsncc);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/DanhSachDienThoai.jsp");
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
