package edu.UdA.Sales.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProviderDTO {


    private Integer idProvider;

    private String name;

    private String address;

}
