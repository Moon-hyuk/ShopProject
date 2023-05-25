package com.miniproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.miniproject.dto.ReviewDto;

import lombok.Data;

@Data
@Table(name = "REVIEW_TABLE")
@Entity
public class ReviewEntity {

    @Id
    @Column(name = "REVIEW_NO")
    private String ReviewNo; // 리뷰 식별번호
    @Column(name = "USER_ID")
    private String UserId; // 사용자아이디(이메일)
    @Column(name = "PROD_NO")
    private String ProdNo; // 제품식별코드
    @Column(name = "REVIEW_CONTENTS")
    private String ReviewContents; // 리뷰 내용

    public static ReviewEntity toReviewEntity(ReviewDto reviewDto) {

        ReviewEntity reviewEntity = new ReviewEntity();

        reviewEntity.setReviewNo(reviewDto.getReviewNo());
        reviewEntity.setUserId(reviewDto.getUserId());
        reviewEntity.setProdNo(reviewDto.getProdNo());
        reviewEntity.setReviewContents(reviewDto.getReviewContents());

        return reviewEntity;

    }
}
