package edu.UdA.Sales.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name="sale")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSale;

    @ManyToOne
    @JoinColumn(name="id_client", nullable = false,  foreignKey = @ForeignKey(name="fk_client_id"))
    private Client client;

    @ManyToOne
    @JoinColumn(name="id_user", nullable = false,  foreignKey = @ForeignKey(name="fk_user_id"))
    private User user;

    @Column(nullable = false)
    private LocalDateTime datetime; // = LocalDateTime.now()

    @Column(columnDefinition = "decimal(5,2)", nullable = false)
    private double total;

    @Column(columnDefinition = "decimal(5,2)", nullable = false)
    private double tax;

    @Column(nullable = false)
    private boolean enabled;

    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
    private List<SaleDetail> details;



}
