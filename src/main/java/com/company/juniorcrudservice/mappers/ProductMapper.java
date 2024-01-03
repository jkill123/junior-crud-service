package com.company.juniorcrudservice.mappers;

import com.company.juniorcrudservice.dto.order.ProductDto;
import com.company.juniorcrudservice.model.order.jpa.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductDto productToProductDto(Product product);
    Product productDtoToProduct(ProductDto dto);
    List<ProductDto> toProductDtoList(List<Product> products);
    List<Product> toProductList(List<ProductDto> dtos);
}
