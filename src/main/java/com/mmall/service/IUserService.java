package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by fan on 2018/3/19.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str, String type);

    ServerResponse selectQuestion(String username);

    ServerResponse checkAnswer(String username, String question, String answer);
}
