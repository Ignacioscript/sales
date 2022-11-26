package edu.UdA.Sales.controller;

import edu.UdA.Sales.dto.CategoryDTO;
import edu.UdA.Sales.model.Category;
import edu.UdA.Sales.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categories")
public class CategoryController {

        @Autowired
        private CategoryService service;

        @Autowired
        private ModelMapper mapper;


        @PostMapping
        public Category create(@RequestBody Category category) throws Exception{
            return service.create(category);
        }

        @GetMapping
        public ResponseEntity<List<CategoryDTO>> readAll() throws Exception{
            List<CategoryDTO>list = service.readAll().stream().map(c ->
                    mapper.map(c, CategoryDTO.class)).collect(Collectors.toList());
            return new ResponseEntity<>(list, HttpStatus.OK);

        }


        @GetMapping("/{id}")
        public Category readById(@PathVariable("id") Integer id) throws Exception{
            return service.readById(id);
        }


        @PutMapping
        public Category update(@RequestBody Category category) throws Exception{
            return service.update(category);
        }


        @DeleteMapping("/{id}")
        public void delete(@PathVariable("id") Integer id) throws Exception{
            service.delete(id);
        }


}


