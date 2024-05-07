package com.example.toureregion.clients;

import com.example.toureregion.entities.Region;

import java.util.List;

public interface RegionRestClient {
    Region findRegionById(int id);
    List<Region> allRegions();
}
