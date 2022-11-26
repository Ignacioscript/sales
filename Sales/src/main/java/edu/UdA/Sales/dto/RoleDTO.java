package edu.UdA.Sales.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTO {


    private Integer idRole;

    private String name;

    private boolean enabled;

}
