package edu.UdA.Sales;

import edu.UdA.Sales.dto.CategoryDTO;
import edu.UdA.Sales.model.Category;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {


    @Bean("categoryMapper")
    public ModelMapper categoryMapper(){
        ModelMapper mapper = new ModelMapper();
        TypeMap<CategoryDTO, Category> typeMap = mapper.createTypeMap(CategoryDTO.class, Category.class);
        typeMap.addMapping(CategoryDTO::getIdCategory, Category::setIdCategory);
        typeMap.addMapping(CategoryDTO::getNameCategory, Category::setName);
        typeMap.addMapping(CategoryDTO::getDescriptionCategory, Category::setDescription);
        typeMap.addMapping(CategoryDTO::isEnabledCategory, Category::setEnabled);
        return mapper;
    }

    /*@Bean("productMapper")
    public ModelMapper productMapper(){

        return null;
    }*/


}
