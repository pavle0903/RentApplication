package com.example.rent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {
    private int id;
    private String manufacturer;
    private String model;
    private String fuelType;
    private int year;
    private String totalMiles;
    private String description;
    private String coverImage;
}
