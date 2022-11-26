package edu.UdA.Sales.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {


    private Integer idClient;

    private String firstName;

    private String lastName;

    private String cardId;

    private String phoneNumber;

    @Email
    private String email;

    private String address;




}
