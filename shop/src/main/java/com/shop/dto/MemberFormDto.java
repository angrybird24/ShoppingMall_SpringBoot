package com.shop.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter@Setter
public class MemberFormDto {
    @NotBlank(message = "이름은 필수입력값입네다 ")
    private String name;

    @NotEmpty(message = "이메일은 필수입력값입네다 ")
    @Email(message="이메일 형식으로 해주세용.")
    private String email;

    @NotEmpty(message = "비번은 필수입력값입네다 ")
    @Length(min=8, max=16, message = "비번은 8 자 이상 , 16자 이하로해줘 ")
    private String password;

    @NotEmpty(message = "주소는 필수입력값입네다 ")
    private String address;
}
