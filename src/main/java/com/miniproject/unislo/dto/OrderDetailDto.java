package com.miniproject.unislo.dto;

import com.miniproject.unislo.entity.OrderDetailEntity;

import lombok.Data;

@Data
public class OrderDetailDto {
    private String OrdDetNo; // 주문상세번호
    private String OrdNo; // 주문번호
    private String ProdId; // 제품식별코드
    private String ProdPrice; // 제품 가격
    private String OrdDetProdQty; // 제품 개수

    public static OrderDetailDto toOrderDetailDto(OrderDetailEntity orderDetailEntity) {

        OrderDetailDto orderDetailDto = new OrderDetailDto();
        OrderDto orderDto = new OrderDto();
        ProductDto productDto = new ProductDto();

        orderDetailDto.setOrdDetNo(orderDetailEntity.getOrdDetNo());
        orderDto.setOrdNo(orderDetailEntity.getOrderEntity().getOrdNo());
        productDto.setProdId(orderDetailEntity.getProductEntity().getProdId());
        productDto.setProdPrice(orderDetailEntity.getProductEntity().getProdPrice());
        orderDetailDto.setOrdDetProdQty(orderDetailEntity.getOrdDetProdQty());

        return orderDetailDto;

    }
}
