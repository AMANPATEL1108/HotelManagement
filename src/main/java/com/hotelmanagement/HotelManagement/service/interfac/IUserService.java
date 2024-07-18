package com.hotelmanagement.HotelManagement.service.interfac;

import com.hotelmanagement.HotelManagement.dto.LoginRequest;
import com.hotelmanagement.HotelManagement.dto.Response;
import com.hotelmanagement.HotelManagement.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
