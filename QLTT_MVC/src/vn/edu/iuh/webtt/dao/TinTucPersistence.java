package vn.edu.iuh.webtt.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public abstract class TinTucPersistence<T> {
	protected EntityManager em;

	public TinTucPersistence() {
		em = Persistence.createEntityManagerFactory("QLTT").createEntityManager();
	}
	
	public boolean save(T t) {
		EntityTransaction tr = em.getTransaction();
		
		try {
			tr.begin();
			em.persist(t);
			tr.commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean delete(T t) {
		EntityTransaction tr = em.getTransaction();
				try {
					tr.begin();
					em.remove(t);
					tr.commit();
					return true;
				} catch (Exception e) {
					// TODO: handle exception
					tr.rollback();
					e.printStackTrace();
				}
				return false;
	}
	
	public boolean update(T t) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(t);
			tr.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			e.printStackTrace();
		}
		return false;
	}
	
}