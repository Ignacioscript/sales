package edu.UdA.Sales.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="role")
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String address;


    private boolean enabled;
}
