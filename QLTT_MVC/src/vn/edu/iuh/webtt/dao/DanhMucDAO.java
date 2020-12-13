package vn.edu.iuh.webtt.dao;

import java.util.List;

import javax.persistence.Query;

import vn.edu.iuh.webtt.entities.DanhMuc;

public class DanhMucDAO extends TinTucPersistence<DanhMuc>{
	public DanhMuc findById(int maDM) {
		return em.find(DanhMuc.class, maDM);
	}
	
	public List<DanhMuc> getAll(){
		String hql = "FROM DanhMuc";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

}
