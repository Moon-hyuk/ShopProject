package com.miniproject.unislo.dto;

import com.miniproject.unislo.entity.ReviewEntity;

import lombok.Data;

@Data
public class ReviewDto {
    private String ReviewNo; // 리뷰 식별번호
    private String UserId; // 사용자아이디(이메일)
    private String ProdId; // 제품식별코드
    private String ReviewContents; // 리뷰 내용

    public static ReviewDto toReviewDto(ReviewEntity reviewEntity) {

        ReviewDto reviewDto = new ReviewDto();
        UserDto userDto = new UserDto();
        ProductDto productDto = new ProductDto();

        reviewDto.setReviewNo(reviewEntity.getReviewNo());
        userDto.setUserId(reviewEntity.getUserId().getUserId());
        productDto.setProdId(reviewEntity.getProdId().getProdId());
        reviewDto.setReviewContents(reviewEntity.getReviewContents());

        return reviewDto;

    }
}
