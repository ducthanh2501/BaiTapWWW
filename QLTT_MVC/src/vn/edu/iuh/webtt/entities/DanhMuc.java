package vn.edu.iuh.webtt.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: DANHMUC
 *
 */
@Entity

public class DanhMuc implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maDM;
	private String tenDanhMuc;
	private String nguoiQuanLy;
	private String ghiChu;
	private static final long serialVersionUID = 1L;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "danhmuc")
	private List<TinTuc> dstintuc;
	
	
	
	public DanhMuc() {
		super();
	}   
	public Integer getMaDM() {
		return this.maDM;
	}

	public void setMaDM(Integer maDM) {
		this.maDM = maDM;
	}   
	public String getTenDanhMuc() {
		return this.tenDanhMuc;
	}

	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}   
	public String getNguoiQuanLy() {
		return this.nguoiQuanLy;
	}

	public void setNguoiQuanLy(String nguoiQuanLy) {
		this.nguoiQuanLy = nguoiQuanLy;
	}   
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public List<TinTuc> getDstintuc() {
		return dstintuc;
	}
	public void setDstintuc(List<TinTuc> dstintuc) {
		this.dstintuc = dstintuc;
	}
	public DanhMuc(String tenDanhMuc, String nguoiQuanLy, String ghiChu) {
		super();
		this.tenDanhMuc = tenDanhMuc;
		this.nguoiQuanLy = nguoiQuanLy;
		this.ghiChu = ghiChu;
	}
   
}
