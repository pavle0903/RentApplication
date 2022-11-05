package com.example.rent.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;
import lombok.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @Column(name="car_id", unique = true, nullable = false)
    @SequenceGenerator(name = "carSeqGen", sequenceName = "carSeqGen", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carSeqGen")
    private int id;
    @Column(nullable = false)
    private String manufacturer;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private String fuelType;
    @Column(nullable = false)
    private int year;
    @Column(nullable = false)
    private String totalMiles;
    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String coverImage;


}
