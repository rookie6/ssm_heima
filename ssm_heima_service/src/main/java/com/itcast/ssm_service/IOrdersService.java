package com.itcast.ssm_service;

import com.itcast.ssm_domain.Orders;

import java.util.List;

public interface IOrdersService {
    List<Orders> findAll(int page,int size) throws Exception;

    Orders findById(Integer ordersId) throws Exception;
}
