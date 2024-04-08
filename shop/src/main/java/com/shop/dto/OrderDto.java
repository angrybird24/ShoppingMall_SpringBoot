package com.shop.dto;


import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class OrderDto {
    @NotNull(message = "상품 아이디 입력 필수")
    private Long itemId;

    @Min(value = 1, message = "최소 주문 1개이상")
    @Max(value = 999, message = "최대 999 개 가능")
    private int count;


}
