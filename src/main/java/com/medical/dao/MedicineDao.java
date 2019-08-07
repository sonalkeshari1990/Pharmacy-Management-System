package com.medical.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session; 
import org.springframework.stereotype.Repository;
import com.medical.config.HibernateUtil;
import com.medical.model.Medicine;

@Repository
public class MedicineDao {

	public Medicine getMedicine(int medicineId) {
		// This methods used to get medicine by id.
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Medicine m = (Medicine) session.get(Medicine.class, medicineId);
		session.getTransaction().commit();
		session.close();
		return m;
	}

	public List<Medicine> getMedicines() {
		// This methodis used to get all medicines.
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Medicine");
		List<Medicine> listMedicines = query.list();
		session.getTransaction().commit();
		session.close();
		return listMedicines;
	}

}
