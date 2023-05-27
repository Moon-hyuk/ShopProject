package com.miniproject.unislo.dto;

import com.miniproject.unislo.entity.CartEntity;

import lombok.Data;

@Data
public class CartDto {
    private String CartNo;
    private String ProdId;// 제품식별코드
    private String UserId;// 사용자아이디(이메일)
    private String CartProdQty;// 장바구니 상품 개수

    public static CartDto toCartDto(CartEntity cartEntity) {

        CartDto cartDto = new CartDto();
        UserDto userDto = new UserDto();
        ProductDto productDto = new ProductDto();

        cartDto.setCartNo(cartEntity.getCartNo());
        productDto.setProdId(cartEntity.getProdId().getProdId());
        userDto.setUserId(cartEntity.getUserId().getUserId());
        cartDto.setCartProdQty(cartEntity.getCartProdQty());

        return cartDto;

    }
}
