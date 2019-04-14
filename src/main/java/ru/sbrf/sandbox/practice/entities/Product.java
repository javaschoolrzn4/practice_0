package ru.sbrf.sandbox.practice.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "PRODUCT")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "NAME")
    private String name;
    @Column (name = "PRICE")
    private Double price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;



}
