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
import vn.edu.iuh.webtt.dao.TinTucDAO;
import vn.edu.iuh.webtt.entities.DanhMuc;
import vn.edu.iuh.webtt.entities.TinTuc;

/**
 * Servlet implementation class ThemTinTucController
 */
@WebServlet("/themTinTuc")
public class ThemTinTucController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemTinTucController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	DanhMucDAO dmDAO = new DanhMucDAO();
	List<DanhMuc> dsdm = dmDAO.getAll();
	
	request.setAttribute("dsdm", dsdm);
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/ThemTinTuc.jsp");
	dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String tieude=request.getParameter("tieude");
		String noidung=request.getParameter("noidung");
		String lienket=request.getParameter("lienket");
		String madm=request.getParameter("madm");
		
		TinTucDAO tinTucDao=new TinTucDAO();
		
		
		DanhMucDAO danhmucDao=new DanhMucDAO();
		DanhMuc danhmuc=danhmucDao.findById(Integer.parseInt(madm));
		
		
		TinTuc tt = new TinTuc(tieude, noidung, lienket);
		tt.setDanhmuc(danhmuc);
		  
		tinTucDao.save(tt);
		
		List<DanhMuc> dsDanhMuc =  danhmucDao.getAll();
		
		request.setAttribute("dsdm", dsDanhMuc);
		  
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/DanhSachTinTuc.jsp");
		rd.forward(request, response);
	}

}
