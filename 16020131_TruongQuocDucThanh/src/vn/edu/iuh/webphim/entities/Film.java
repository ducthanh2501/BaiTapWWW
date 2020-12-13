package vn.edu.iuh.webphim.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Film
 *
 */
@Entity

public class Film implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maPhim;
	private String tenPhim;
	private String moTa;
	private String thoiGianPhim;
	private String url;
	
	@Temporal(TemporalType.DATE)
	private Date ngayKhoiChieu;
	
	private static final long serialVersionUID = 1L;

	
	@ManyToOne
	@JoinColumn(name = "maTheLoai")
	private Category theloai;
	public Film() {
		super();
	}   
	public Integer getMaPhim() {
		return this.maPhim;
	}

	public void setMaPhim(Integer maPhim) {
		this.maPhim = maPhim;
	}   
	public String getTenPhim() {
		return this.tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}   
	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}   
	public String getThoiGianPhim() {
		return this.thoiGianPhim;
	}

	public void setThoiGianPhim(String thoiGianPhim) {
		this.thoiGianPhim = thoiGianPhim;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getNgayKhoiChieu() {
		return ngayKhoiChieu;
	}
	public void setNgayKhoiChieu(Date ngayKhoiChieu) {
		this.ngayKhoiChieu = ngayKhoiChieu;
	}
	public Film(String tenPhim, String moTa, String thoiGianPhim, String url, Date ngayKhoiChieu) {
		super();
		this.tenPhim = tenPhim;
		this.moTa = moTa;
		this.thoiGianPhim = thoiGianPhim;
		this.url = url;
		this.ngayKhoiChieu = ngayKhoiChieu;
	}
	public Category getTheloai() {
		return theloai;
	}
	public void setTheloai(Category theloai) {
		this.theloai = theloai;
	}
	public Film(String tenPhim, String moTa, String thoiGianPhim, String url) {
		super();
		this.tenPhim = tenPhim;
		this.moTa = moTa;
		this.thoiGianPhim = thoiGianPhim;
		this.url = url;
	}
	
   
	
}
