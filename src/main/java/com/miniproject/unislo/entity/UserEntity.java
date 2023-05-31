package com.miniproject.unislo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.miniproject.unislo.dto.UserDto;

import lombok.Data;

@Data
@Table(name = "USER_TABLE")
@Entity
public class UserEntity {

    @Id
    @Column(name = "USER_ID")
    private String userId; // 회원 아이디(이메일)
    @Column(name = "USER_NM")
    private String userNm; // 회원명
    @Column(name = "USER_PW")
    private String userPw; // 비밀번호
    @Column(name = "USER_TELNO")
    private String userTelno; // 회원 전화번호
    @Column(name = "USER_YN")
    private String userYn; // 회원 탈퇴 여부

    public static UserEntity toUserEntity(UserDto userDto) {

        UserEntity userEntity = new UserEntity();

        userEntity.setUserId(userDto.getUserId());
        userEntity.setUserNm(userDto.getUserNm());
        userEntity.setUserPw(userDto.getUserPw());
        userEntity.setUserTelno(userDto.getUserTelno());
        userEntity.setUserYn(userDto.getUserYn());

        return userEntity;

    }
}
