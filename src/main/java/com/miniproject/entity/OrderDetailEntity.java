package com.miniproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.miniproject.dto.OrderDetailDto;

import lombok.Data;

@Data
@Table(name = "ORD_DETAIL_TABLE")
@Entity
public class OrderDetailEntity {

    @Id
    @Column(name = "ORD_DET_NO")
    private String OrdDetNo; // 주문상세번호
    @Column(name = "ORD_NO")
    private String OrdNo; // 주문번호
    @Column(name = "PROD_ID")
    private String ProdId; // 제품식별코드
    @Column(name = "PROD_PRICE")
    private String ProdPrice; // 제품 가격
    @Column(name = "PROD_QTY")
    private String ProdQty; // 제품 개수

    public static OrderDetailEntity toOrderDetailEntity(OrderDetailDto orderDetailDto) {

        OrderDetailEntity orderDetailEntity = new OrderDetailEntity();

        orderDetailEntity.setOrdDetNo(orderDetailDto.getOrdDetNo());
        orderDetailEntity.setOrdNo(orderDetailDto.getOrdNo());
        orderDetailEntity.setProdId(orderDetailDto.getProdId());
        orderDetailEntity.setProdPrice(orderDetailDto.getProdPrice());
        orderDetailEntity.setProdQty(orderDetailDto.getProdQty());

        return orderDetailEntity;

    }

}
