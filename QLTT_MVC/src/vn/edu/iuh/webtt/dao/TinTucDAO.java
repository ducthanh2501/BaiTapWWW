package vn.edu.iuh.webtt.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import vn.edu.iuh.webtt.entities.TinTuc;

public class TinTucDAO extends TinTucPersistence<TinTuc> {
	public TinTuc findByID(int id) {
		return em.find(TinTuc.class, id);
	}
	public List<TinTuc> getAll() {

		String hql = "FROM TinTuc";

		Query query = em.createQuery(hql);

		return query.getResultList();

	}
	public List<TinTuc> getTinTucByMaDM(int maDM){
		List<TinTuc> listTT = this.getAll();
		List<TinTuc> resultList = new ArrayList<TinTuc>();
		
		for (TinTuc tinTuc : listTT) {
			if(tinTuc.getDanhmuc().getMaDM() == maDM) {
				resultList.add(tinTuc);
			}
		}
		return resultList;
	}

}
