package com.example.medicare.controller;

import com.example.medicare.entity.Medicine;
import com.example.medicare.repository.MedicineRepository;
import com.example.medicare.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/medicine")
public class MedicineController {

    @Autowired
    MedicineService medicineService;
    @Autowired
    MedicineRepository medicineRepo;


    @PostMapping("/addMedicine")
    public Medicine addMedicine(@RequestBody Medicine medicine){
        return medicineService.addMedicine(medicine);
    }
//    @PutMapping("/uploadImage/{id}")
//    public Optional<Medicine> uploadImage(@PathVariable("id") int id, @RequestBody String url)
//    {
//        System.out.println("calling uplaodImage api.....");
//        System.out.println(id);
//        System.out.println(url);
//        Optional<Medicine> medicine=medicineRepo.findById(id);
//       medicine.setImageUrl(url);
//       medicineRepo.save(medicine);
//
//    }

    @GetMapping("/allMedicines")
    public List<Medicine> allMedicines()
    {
        return medicineService.allMedicines();
    }

}