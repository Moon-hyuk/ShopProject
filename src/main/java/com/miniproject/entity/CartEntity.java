package com.miniproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.miniproject.dto.CartDto;

import lombok.Data;

@Data
@Entity
@Table(name = "CART_TABLE")
public class CartEntity {

    @Id
    @Column(name = "PROD_NO")
    private String ProdNo;// 제품식별코드
    @Column(name = "USER_ID")
    private String UserId;// 사용자아이디(이메일)
    @Column(name = "CART_PROD_QTY")
    private String CartProdQty;// 장바구니 상품 개수

    public static CartEntity toCartEntity(CartDto cartDto) {

        CartEntity cartEntity = new CartEntity();

        cartEntity.setProdNo(cartDto.getProdNo());
        cartEntity.setUserId(cartDto.getUserId());
        cartEntity.setCartProdQty(cartDto.getCartProdQty());

        return cartEntity;

    }
}
