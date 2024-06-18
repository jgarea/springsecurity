package com.jgarea.springsecurity.service;

import com.jgarea.springsecurity.controller.models.AuthResponse;
import com.jgarea.springsecurity.controller.models.AuthenticationRequest;
import com.jgarea.springsecurity.controller.models.RegisterRequest;

public interface AuthService {
    AuthResponse register(RegisterRequest request);
    AuthResponse authenticate(AuthenticationRequest request);


}
