package edu.UdA.Sales.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name= "user_data")
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    /*@ManyToMany
    @JoinTable(name = "user_role",
    joinColumns = @JoinColumn(name="id_user"),
    inverseJoinColumns = @JoinColumn(name = "id_role"))*/

    @ManyToOne
    @JoinColumn(name = "id_role", nullable = false,  foreignKey = @ForeignKey(name="fk_role"))
    private Role role;

    @Column(length =  50, nullable = false)
    private String userName;

    @Column(length =  50, nullable = false)
    private String password;


    private boolean enabled;

}
