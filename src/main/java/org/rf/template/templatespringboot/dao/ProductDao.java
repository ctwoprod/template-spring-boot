package org.rf.template.templatespringboot.dao;

import org.rf.template.templatespringboot.entities.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductDao extends PagingAndSortingRepository<Product, String> {
}