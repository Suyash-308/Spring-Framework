package com.itshaala.springbootwebservicejpa04.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CreateCustomerRequestDto {
    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "E-mail is required")
    @Email(message = "Enter valid e-mail")
    private String email;

    private String phone;
}
