package com.miniproject.unislo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.miniproject.unislo.dto.OrderDetailDto;

import lombok.Data;

@Data
@Table(name = "ORD_DETAIL_TABLE")
@Entity
public class OrderDetailEntity {

    @Id
    @Column(name = "ORD_DET_NO")
    private String OrdDetNo; // 주문상세번호
    
    @ManyToOne
    @JoinColumn(name = "ORD_NO")
    private OrderEntity OrdNo; // 주문번호

    @ManyToOne
    @JoinColumn(name = "PROD_ID")
    private ProductEntity ProdId; // 제품식별코드

    @ManyToOne
    @JoinColumn(name = "PROD_PRICE")
    private ProductEntity ProdPrice; // 제품 가격

    @Column(name = "ORD_DET_PROD_QTY")
    private String OrdDetProdQty; // 제품 개수

    public static OrderDetailEntity toOrderDetailEntity(OrderDetailDto orderDetailDto) {

        OrderEntity orderEntity = new OrderEntity();
        OrderDetailEntity orderDetailEntity = new OrderDetailEntity();
        ProductEntity productEntity = new ProductEntity();

        orderDetailEntity.setOrdDetNo(orderDetailDto.getOrdDetNo());
        orderEntity.setOrdNo(orderDetailDto.getOrdNo());
        productEntity.setProdId(orderDetailDto.getProdId());
        productEntity.setProdPrice(orderDetailDto.getProdPrice());
        orderDetailEntity.setOrdDetProdQty(orderDetailDto.getOrdDetProdQty());

        return orderDetailEntity;

    }

}
