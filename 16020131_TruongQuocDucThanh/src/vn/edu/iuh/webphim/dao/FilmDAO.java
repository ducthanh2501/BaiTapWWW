package vn.edu.iuh.webphim.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import vn.edu.iuh.webphim.entities.Film;


public class FilmDAO extends QuanLyPhimPersistence<Film>{
	public Film findByID(int id) {
		return em.find(Film.class, id);
	}
	public List<Film> getAll() {

		String hql = "FROM Film";

		Query query = em.createQuery(hql);

		return query.getResultList();

	}
	public List<Film> getPhimByMaTL(int maTL){
		List<Film> listPhim = this.getAll();
		List<Film> resultList = new ArrayList<Film>();
		
		for (Film film : listPhim) {
			if(film.getTheloai().getMaTheLoai() == maTL) {
				resultList.add(film);
			}
		}
		return resultList;
	}
	


}
