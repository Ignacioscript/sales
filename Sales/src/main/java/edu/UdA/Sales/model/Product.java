package edu.UdA.Sales.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name= "product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;

    @ManyToOne
    @JoinColumn(name="id_category", nullable = false,  foreignKey = @ForeignKey(name="fk_category_id"))
    private Category category;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String description;

    @Column(columnDefinition = "decimal(5,2)", nullable = false)
    private double price;

}
