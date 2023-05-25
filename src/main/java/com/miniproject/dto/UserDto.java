package com.miniproject.dto;

import com.miniproject.entity.UserEntity;

import lombok.Data;

@Data
public class UserDto {
    private String UserId; // 회원 아이디(이메일)
    private String UserNm; // 회원명
    private String UserPw; // 비밀번호
    private String UserTelno; // 회원 전화번호
    private String UserYn; // 회원 탈퇴 여부

    public static UserDto toUserDto(UserEntity userEntity) {

        UserDto userDto = new UserDto();

        userDto.setUserId(userEntity.getUserId());
        userDto.setUserNm(userEntity.getUserNm());
        userDto.setUserPw(userEntity.getUserPw());
        userDto.setUserTelno(userEntity.getUserTelno());
        userDto.setUserYn(userEntity.getUserYn());

        return userDto;

    }
}
