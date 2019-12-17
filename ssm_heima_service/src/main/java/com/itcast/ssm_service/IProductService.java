package com.itcast.ssm_service;

import com.itcast.ssm_domain.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findAll() throws Exception;

    public void save(Product product) throws Exception;
}
