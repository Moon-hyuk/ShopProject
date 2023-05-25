package com.miniproject.dto;

import com.miniproject.entity.ReviewEntity;

import lombok.Data;

@Data
public class ReviewDto {
    private String ReviewNo; // 리뷰 식별번호
    private String UserId; // 사용자아이디(이메일)
    private String ProdNo; // 제품식별코드
    private String ReviewContents; // 리뷰 내용

    public static ReviewDto toReviewDto(ReviewEntity reviewEntity) {

        ReviewDto reviewDto = new ReviewDto();

        reviewDto.setReviewNo(reviewEntity.getReviewNo());
        reviewDto.setUserId(reviewEntity.getUserId());
        reviewDto.setProdNo(reviewEntity.getProdNo());
        reviewDto.setReviewContents(reviewEntity.getReviewContents());

        return reviewDto;

    }
}
