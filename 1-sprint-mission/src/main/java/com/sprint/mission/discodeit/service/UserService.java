package com.sprint.mission.discodeit.service;

import java.util.UUID;

public interface UserService {
    void CreateUserDefault(String name);
    <T> String ReadUser(T user);
    String ReadUserAll();
    void UpdateUserName(String name,String change);
    void UpdateUserName(UUID id,String changeName);
    void DeleteUser(UUID id);
    void DeleteUser(String name);





}
