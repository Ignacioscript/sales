package edu.UdA.Sales.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sale_detail")
public class SaleDetail {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSaleDetail;


    @ManyToOne
    @JoinColumn(name = "id_sale", nullable = false, foreignKey = @ForeignKey(name="fk_detail_sale"))
    private Sale sale;

    @ManyToOne
    @JoinColumn(name ="id_product", nullable = false,  foreignKey = @ForeignKey(name="fk_detail_product"))
    private Product product;


    @Column(nullable = false)
    private short quantity;

    @Column(columnDefinition = "decimal(5,2)", nullable = false)
    private double salePrice;

    @Column(columnDefinition = "decimal(5,2)", nullable = false)
    private double discount;
}
