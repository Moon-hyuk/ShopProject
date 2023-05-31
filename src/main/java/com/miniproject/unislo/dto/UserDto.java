package com.miniproject.unislo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.miniproject.unislo.entity.UserEntity;

import lombok.Data;

@Data
public class UserDto {
    @NotBlank(message = "ID를 입력해주세요.")
    private String userId; // 회원 아이디(이메일)
    @NotEmpty(message = "이름을 입력해주세요.")
    private String userNm; // 회원명
    @NotEmpty(message = "비밀번호를 입력해주세요.")
    private String userPw; // 비밀번호
    @NotEmpty(message = "전화번호를 입력해주세요.")
    private String userTelno; // 회원 전화번호
    private String userYn = "n"; // 회원 탈퇴 여부

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
