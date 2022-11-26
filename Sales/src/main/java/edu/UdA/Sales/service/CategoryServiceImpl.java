package edu.UdA.Sales.service;

import edu.UdA.Sales.model.Category;
import edu.UdA.Sales.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository repository;

    public CategoryServiceImpl(CategoryRepository repository){
        this.repository = repository;
    }



    @Override
    public Category create(Category category) throws Exception {
        return repository.save(category);
    }

    @Override
    public Category update(Category category) throws Exception {
        return repository.save(category);
    }

    @Override
    public List<Category> readAll() throws Exception {
        return repository.findAll();
    }

    @Override
    public Category readById(Integer id) throws Exception {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) throws Exception {
        repository.deleteById(id);

    }
}
