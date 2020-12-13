package vn.edu.iuh.webphim.dao;

import java.util.List;

import javax.persistence.Query;

import vn.edu.iuh.webphim.entities.Category;


public class CategoryDao extends QuanLyPhimPersistence<Category>{
	public Category findById(int maTheLoai) {
		return em.find(Category.class, maTheLoai);
	}
	
	public List<Category> getAll(){
		String hql = "FROM Category";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

}
