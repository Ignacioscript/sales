package edu.UdA.Sales.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name= "ingress")
public class Ingress {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idIngress;

    @ManyToOne
    @JoinColumn(name= "id_provider",  foreignKey = @ForeignKey(name="fk_provider_id"))
    private Provider provider;

    @ManyToOne
    @JoinColumn(name= "id_user", nullable = false,  foreignKey = @ForeignKey(name="fk_user_id"))
    private User user;

    @Column(nullable = false)
    private LocalDateTime datetime;


    @Column(columnDefinition = "decimal(5,2)", nullable = false)
    private double total;

    @Column(length = 10, nullable = false)
    private String serialNumber;

    @Column(nullable = false)
    private boolean enabled;

}
