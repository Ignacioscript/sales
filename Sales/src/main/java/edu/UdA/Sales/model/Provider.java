package edu.UdA.Sales.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name= "provider")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProvider;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String address;

    private boolean enabled;


}
