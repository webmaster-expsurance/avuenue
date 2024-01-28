package com.exercice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductServiceTest {

    ProductService productService = new ProductService();

    @Test
    void testWhenSolutionWhenCategoryNotExist(){
        String[] result = productService.solution(15);
        assertEquals(0, result.length);
    }

    @Test
    void testWhenSolutionWhenCategoryIs9Expect3Elements(){
        String[] result = productService.solution(9);
        assertEquals(3, result.length);
    }

    @Test
    void testWhenSolutionWhenCategoryIs3Expect1Elements(){
        String[] result = productService.solution(3);
        assertEquals(1, result.length);
    }

    @Test
    void testWhenSolutionWhenCategoryIs5Expect1Elements(){
        String[] result = productService.solution(5);
        assertEquals(2, result.length);
    }

}
