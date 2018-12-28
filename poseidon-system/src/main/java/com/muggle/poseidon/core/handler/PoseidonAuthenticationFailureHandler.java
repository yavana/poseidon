package com.muggle.poseidon.core.handler;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: poseidon
 * @description: 认证失败处理器
 * @author: muggle
 * @create: 2018-12-27 19:08
 **/
@Component
public class PoseidonAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.print("登录失败");
        outputStream.close();
    }
}