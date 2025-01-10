package com.sprint.misson.discordeit.service;

import com.sprint.misson.discordeit.entity.AccountStatus;
import com.sprint.misson.discordeit.entity.User;
import com.sprint.misson.discordeit.entity.UserStatus;

import java.util.List;

public interface UserService {

    //생성
    User createUser(String nickname, String email);

    //모두 읽기
    List<User> getUsers();

    //읽기
    //단건 조회 - UUID
    User getUserByUUID(String userId);

    //단건 조회 - 이메일로 조회
    User getUserByEmail(String email);

    //다건 조회 - 닉네임
    List<User> getUsersByNickname(String nickname);

    //다건 조회 - 계정 상태
    List<User> getUsersByAccountStatus(AccountStatus accountStatus);

    //다건 조회 - 사용자 상태
    List<User> getUserByUserStatus(UserStatus userStatus);

    //수정
    User updateUser(String userId, UserDTO userDTO);

    //삭제
    boolean deleteUser(String userId);


}
