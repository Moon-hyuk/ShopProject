package com.miniproject.dto;

import com.miniproject.entity.OrderDetailEntity;

import lombok.Data;

@Data
public class OrderDetailDto {
    private String OrdDetNo; // 주문상세번호
    private String OrdNo; // 주문번호
    private String ProdId; // 제품식별코드
    private String ProdPrice; // 제품 가격
    private String ProdQty; // 제품 개수

    public static OrderDetailDto toOrderDetailDto(OrderDetailEntity orderDetailEntity) {

        OrderDetailDto orderDetailDto = new OrderDetailDto();

        orderDetailDto.setOrdDetNo(orderDetailEntity.getOrdDetNo());
        orderDetailDto.setOrdNo(orderDetailEntity.getOrdNo());
        orderDetailDto.setProdId(orderDetailEntity.getProdId());
        orderDetailDto.setProdPrice(orderDetailEntity.getProdPrice());
        orderDetailDto.setProdQty(orderDetailEntity.getProdQty());

        return orderDetailDto;

    }
}
