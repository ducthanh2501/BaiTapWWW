package vn.edu.iuh.webtintuc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import vn.edu.iuh.webtintuc.entities.DienThoai;

public class DienThoaiDAO extends QuanLyDienThoaiPersistence<DienThoai>{
	
	public DienThoai findByID(int maDT) {
		return em.find(DienThoai.class, maDT);
	}

	public List<DienThoai> getAll(){
		String hql = "FROM DienThoai";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}
	
	public List<DienThoai> getDienThoaiByMaNCC(int maNCC){
		List<DienThoai> listDT = this.getAll();
		List<DienThoai> resultList = new ArrayList<DienThoai>();
		
		for (DienThoai dienThoai : listDT) {
			if(dienThoai.getNhacungcap().getMaNCC()==maNCC) {
				resultList.add(dienThoai);
			}
			
		}
		return resultList;
	}
}
