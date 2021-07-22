package com.alkemy.ong.controller;

import com.alkemy.ong.service.Interface.IUsersService;
import com.alkemy.ong.service.impl.UsersServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;



import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
@WithMockUser
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

//    @MockBean
//    private IUsersService iUsersService;

    @InjectMocks
    UserController userController;

    @MockBean
    UsersServiceImpl usersService;

    @Test
    @DisplayName("FindAll Users")
    void showAllUsers() {
        //assertTrue(userController.showAllUsers().isEmpty());

    }

    @Test
    @DisplayName("Delete user by id")
    void deleteUser() {
        assertEquals(HttpStatus.NOT_FOUND,userController.deleteUser(null).getStatusCode());

    }
}