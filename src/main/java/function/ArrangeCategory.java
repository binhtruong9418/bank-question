package function;

import static java.sql.Types.NULL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Category;

public class ArrangeCategory {

    public ArrangeCategory() {

    }

    public static List<Category> arrangeCategories(List<Category> categories) {
        List<Category> arrangedCategories = new ArrayList<>(); // Create a copy of the categories list
        Map<Integer, List<Category>> categoryMap = new HashMap<>();

        // Create a map of parent ID to its children
        for (Category category : categories) {
            if (category.getParentCategory() == -1) {
                arrangedCategories.add(category);
            } else {
                int parentId = category.getParentCategory();
                if (!categoryMap.containsKey(parentId)) {
                    categoryMap.put(parentId, new ArrayList<>());
                }
                categoryMap.get(parentId).add(category);
            }
        }

        // Arrange the categories
        for (Category category : new ArrayList<>(arrangedCategories)) {
            addChildren(category, categoryMap, arrangedCategories);
        }

        return arrangedCategories;
    }

    private static void addChildren(Category category, Map<Integer, List<Category>> categoryMap,
            List<Category> arrangedCategories) {
        if (categoryMap.containsKey(category.getId())) {
            List<Category> children = categoryMap.get(category.getId());
            int parentIndex = arrangedCategories.indexOf(category);
            arrangedCategories.addAll(parentIndex + 1, children);
            for (Category child : children) {
                addChildren(child, categoryMap, arrangedCategories);
            }
        }
    }

    public static int getCategoryLevel(Category category, List<Category> listCategory) {
        int level = 0;
        int parentId = category.getParentCategory();

        while (parentId != -1) { // Assuming the root category has a parent ID of 0
            level++;
            // Retrieve the parent category based on its ID
            Category parentCategory = getCategoryById(parentId, listCategory);
            parentId = parentCategory.getParentCategory();
        }

        return level;
    }

    private static Category getCategoryById(int id, List<Category> listCategory) {
        for (Category category : listCategory) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null; // Return null if category with the specified ID is not found
    }
}
