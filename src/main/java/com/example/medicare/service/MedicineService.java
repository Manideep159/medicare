package com.example.medicare.service;

import com.example.medicare.entity.Medicine;
import com.example.medicare.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {
    @Autowired
    MedicineRepository medicineRepository;

    public Medicine addMedicine(Medicine medicine){
        return medicineRepository.save(medicine);
    }
    public List<Medicine> allMedicines(){
        return medicineRepository.findAll();
    }
}
