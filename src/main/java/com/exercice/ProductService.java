package com.exercice;

import com.exercice.model.ProductQueryResult;
import com.exercice.model.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductService {

    static Map<Integer, Product> data = new HashMap<>(Map.of(
            1, new Product(1, "Root", "Products", -1),
            2, new Product(2, "Furniture", "Furniture", 1),
            3, new Product(3, "Electronics", "Electronics, Gadgets", 1),
            4, new Product(4, "Home Appliances", "Home, Appliances", 1),
            5, new Product(5, "Major Appliances", "", 4),
            6, new Product(6, "Minor Appliances", "", 4),
            7, new Product(7, "Lawn & Garden", "Lawn, Garden", 4),
            8, new Product(8, "Kitchen Appliances", "", 5),
            9, new Product(9, "General Appliances", "", 5)
    ));

    public String[] solution(int categoryID) {
        try {
            return getStructureByCategoryId(categoryID, new HashMap<>())
                    .values().stream().map(ProductQueryResult::toString).toArray(String[]::new);
        } catch (Exception e) {
            return new String[0];
        }
    }

    private Map<Integer, ProductQueryResult> getStructureByCategoryId(
            int categoryId, Map<Integer, ProductQueryResult> values) throws Exception {
        final Product structure = data.get(categoryId);
        if (Objects.isNull(structure)) {
            throw new Exception("CategoryId Not Exist");
        }
        if (!values.isEmpty()) {
            values.forEach((integer, result) -> result.setLevel(result.getLevel() + 1));
        }

        ProductQueryResult result = new ProductQueryResult(1, structure.getCategoryName(), structure.getKeywords());
        if (structure.getParentCategoryId() == 1) {
            values.put(categoryId, result);
            return values;
        }
        values.put(categoryId, result);
        return getStructureByCategoryId(structure.getParentCategoryId(), values);
    }

}
