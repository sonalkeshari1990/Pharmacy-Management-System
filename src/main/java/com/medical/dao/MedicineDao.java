package com.medical.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.medical.config.HibernateUtil;
import com.medical.model.Medicine;

@Repository 	 		
public class MedicineDao {

	public List<?> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public Medicine getMedicine(int medicineId) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Medicine m = (Medicine) session.get(Medicine.class, medicineId);
		session.getTransaction().commit();
		session.close();
		return m;
	}

}
