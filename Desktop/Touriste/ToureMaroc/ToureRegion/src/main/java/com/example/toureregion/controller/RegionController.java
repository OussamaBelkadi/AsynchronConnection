package com.example.toureregion.controller;

import com.example.toureregion.entities.Region;
import com.example.toureregion.repositories.RegionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegionController {
    private RegionRepository regionRepository;

    public RegionController(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @GetMapping("regions")
    public List<Region> listRegions(){
        return regionRepository.findAll();
    }
    @GetMapping("/regions/{id}")
    public Region regionById(@PathVariable int id){
        return  regionRepository.findById(id).get();
    }
}
