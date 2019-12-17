package com.itcast.ssm_service.impl;

import com.itcast.ssm_dao.IProductDao;
import com.itcast.ssm_domain.Product;
import com.itcast.ssm_service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;


    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }

    public void save(Product product) throws Exception {
        productDao.save(product);
    }
}
