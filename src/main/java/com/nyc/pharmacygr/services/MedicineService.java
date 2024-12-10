package com.nyc.pharmacygr.services;


import com.nyc.pharmacygr.model.Medicine;
import com.nyc.pharmacygr.repos.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {

    @Autowired
    MedicineRepository medicineRepo;

    public void insertMedicine(Medicine medicine) {
        medicineRepo.save(medicine);
    }
    public List<Medicine> getAllMedicine() {
        return medicineRepo.findAll();
               // .stream().filter(m -> m.isDisabledMed() == false).collect(Collectors.toList());
    }

}
