package com.panambystudio.mssendemailcinemando.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class EmailDto {

    @NotBlank
    private String ownerRef = "Cinemando";
    @NotBlank
    @Email
    private String emailFrom = "rafa.souza.test@gmail.com";
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject = "Cinemando";
    @NotBlank
    private String text = "Obrigado por avaliar o filme na página Cinemando!";
}