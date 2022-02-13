package com.ayoub.gestionutilisateurs.domain.service;

import com.ayoub.gestionutilisateurs.domain.dto.UserDto;
import com.ayoub.gestionutilisateurs.domain.dto.UserResponse;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserResponse getAllUsers(int pageNo, int pageSize, String sortBy, String sortDir);
}
