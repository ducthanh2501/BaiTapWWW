package vn.edu.iuh.webtt.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TinTuc
 *
 */
@Entity

public class TinTuc implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maTT;
	private String tieuDe;
	private String noiDungTT;
	private String lienKet;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "maDM")
	private DanhMuc danhmuc;
	
	public TinTuc() {
		super();
	}   
	public Integer getMaTT() {
		return this.maTT;
	}

	public void setMaTT(Integer maTT) {
		this.maTT = maTT;
	}   
	public String getTieuDe() {
		return this.tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}   
	public String getNoiDungTT() {
		return this.noiDungTT;
	}

	public void setNoiDungTT(String noiDungTT) {
		this.noiDungTT = noiDungTT;
	}   
	public String getLienKet() {
		return this.lienKet;
	}

	public void setLienKet(String lienKet) {
		this.lienKet = lienKet;
	}
	public DanhMuc getDanhmuc() {
		return danhmuc;
	}
	public void setDanhmuc(DanhMuc danhmuc) {
		this.danhmuc = danhmuc;
	}
	public TinTuc(String tieuDe, String noiDungTT, String lienKet) {
		super();
		this.tieuDe = tieuDe;
		this.noiDungTT = noiDungTT;
		this.lienKet = lienKet;
	}
   
}
