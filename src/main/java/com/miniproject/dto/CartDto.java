package com.miniproject.dto;

import com.miniproject.entity.CartEntity;

import lombok.Data;

@Data
public class CartDto {
    private String ProdNo;// 제품식별코드
    private String UserId;// 사용자아이디(이메일)
    private String CartProdQty;// 장바구니 상품 개수

    public static CartDto toCartDto(CartEntity cartEntity) {

        CartDto cartDto = new CartDto();

        cartDto.setProdNo(cartEntity.getProdNo());
        cartDto.setUserId(cartEntity.getUserId());
        cartDto.setCartProdQty(cartEntity.getCartProdQty());

        return cartDto;

    }
}
