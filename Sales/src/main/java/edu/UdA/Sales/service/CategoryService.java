package edu.UdA.Sales.service;

import edu.UdA.Sales.model.Category;

import java.util.List;

public interface CategoryService {

    Category create(Category category) throws  Exception;
    Category update(Category category) throws  Exception;
    List<Category> readAll() throws  Exception;
    Category readById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}
