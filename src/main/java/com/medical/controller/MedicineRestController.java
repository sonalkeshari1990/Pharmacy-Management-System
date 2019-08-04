package com.medical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.medical.dao.MedicineDao;
import com.medical.model.Medicine;

@RestController
public class MedicineRestController {
	@Autowired
	private MedicineDao medicineDao;

	@GetMapping("/medicines")
	public List<?> getMedicines() {
		return medicineDao.list();
	}

	@GetMapping("/medicine/{medicineId}")
	public ResponseEntity<Medicine> getMedicineById(@PathVariable("medicineId") int medicineId) {
		Medicine medicine = medicineDao.getMedicine(medicineId);
		if (medicine == null) {
			return new ResponseEntity<Medicine>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Medicine>(medicine, HttpStatus.OK);
	}

}
