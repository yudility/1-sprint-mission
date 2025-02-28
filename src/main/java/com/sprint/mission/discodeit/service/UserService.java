package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.dto.user.CreateUserDto;
import com.sprint.mission.discodeit.dto.user.UpdateUserDto;
import com.sprint.mission.discodeit.dto.user.UserResponseDto;
import com.sprint.mission.discodeit.entity.status.AccountStatus;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {

    //생성
    UserResponseDto create(CreateUserDto createUserDto);

    //생성 with profile image
    UserResponseDto create(CreateUserDto createUserDto, MultipartFile multipartFile);

    //모두 읽기
    List<UserResponseDto> findAll();

    //읽기
    //단건 조회 - UUID
    UserResponseDto findById(String userId);

    //단건 조회 - 이메일로 조회
    UserResponseDto findByEmail(String email);

    //다건 조회 - 닉네임
    List<UserResponseDto> findAllContainsNickname(String nickname);

    //다건 조회 - 계정 상태
    List<UserResponseDto> findAllByAccountStatus(AccountStatus accountStatus);

    //다건 조회 - 사용자 상태
    //List<User> getUserByUserStatus(UserStatus userStatus);

    //수정
    UserResponseDto updateUser(String userId, UpdateUserDto updateUserDto);

    //수정 - 프로필 이미지와 함께
    UserResponseDto updateUser(String userId, UpdateUserDto updateUserDto, MultipartFile multipartFile);

    //삭제
    boolean deleteUser(String userId);
    
}
