package vn.edu.iuh.webtintuc.dao;

import java.util.List;

import javax.persistence.Query;

import vn.edu.iuh.webtintuc.entities.NhaCungCap;

public class NhaCungCapDAO extends QuanLyDienThoaiPersistence<NhaCungCap> {
	public NhaCungCap findByID(int maNCC) {
		return em.find(NhaCungCap.class, maNCC);
	}

	public List<NhaCungCap> getAll(){
		String hql ="FROM NhaCungCap";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

}
