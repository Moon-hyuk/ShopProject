package com.miniproject.unislo.dto;

import com.miniproject.unislo.entity.OrderEntity;

import lombok.Data;

@Data
public class OrderDto {
    private String OrdNo; // 주문번호
    private String UserId; // 회원아이디(이메일)
    private String OrdAmount; // 주문 총결제금액
    private String OrdDate; // 주문날짜
    private String OrdCard; // 결제카드회사
    private String OrdState; // 주문현황
    private String OrdRefReason; // 환불사유
    private String OrdRecipeint; // 받는분 성함
    private String OrdZipcode; // 우편번호
    private String OrdAddr; // 받는분 주소
    private String OrdDetailAddr; // 상세 주소
    private String OrdTelno; // 받는분 전화번호
    private String OrdReq; // 배송요청사항
    private String OrdProdQty; // 주문상품개수

    public static OrderDto tOrderDto(OrderEntity orderEntity) {

        OrderDto orderDto = new OrderDto();
        UserDto userDto = new UserDto();

        orderDto.setOrdNo(orderEntity.getOrdNo());
        userDto.setUserId(orderEntity.getUserId().getUserId());
        orderDto.setOrdAmount(orderEntity.getOrdAmount());
        orderDto.setOrdDate(orderEntity.getOrdDate());
        orderDto.setOrdCard(orderEntity.getOrdCard());
        orderDto.setOrdState(orderEntity.getOrdState());
        orderDto.setOrdRefReason(orderEntity.getOrdRefReason());
        orderDto.setOrdRecipeint(orderEntity.getOrdRecipeint());
        orderDto.setOrdZipcode(orderEntity.getOrdZipcode());
        orderDto.setOrdAddr(orderEntity.getOrdAddr());
        orderDto.setOrdDetailAddr(orderEntity.getOrdDetailAddr());
        orderDto.setOrdTelno(orderEntity.getOrdTelno());
        orderDto.setOrdReq(orderEntity.getOrdReq());
        orderDto.setOrdProdQty(orderEntity.getOrdProdQty());

        return orderDto;

    }
}
