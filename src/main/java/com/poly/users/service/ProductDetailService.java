package com.poly.users.service;

import com.poly.users.DTO.ProductDetailDto;
import com.poly.users.entity.ProductDetail;

import java.util.List;

public interface ProductDetailService {
    List<ProductDetail> getAll();
    List<ProductDetail> getAllByProductId(int productId);
    ProductDetail getById(int ProductDetailId);
    ProductDetail save(ProductDetailDto productDetailDto);
    ProductDetail update(ProductDetail productDetail);
    void delete(int id);

    List<Object> checkQuantity(Integer id, Integer quantity);
}
