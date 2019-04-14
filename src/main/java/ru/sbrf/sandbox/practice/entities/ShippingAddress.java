package ru.sbrf.sandbox.practice.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "SHIPPING_ADDRESS")
public class ShippingAddress implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "CITY")
    private String city;
    @Column (name = "STREET")
    private String street;

    @OneToMany(mappedBy = "shippingAddress")
    private List<Order> orders;
}
