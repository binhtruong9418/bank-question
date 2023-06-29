package repository.category;

import connection.ConnectDB;
import service.ArrangeCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import org.openide.util.Exceptions;

public class GetAllCategory {

    private Connection con = null;
    private PreparedStatement pre = null;
    private ResultSet rs = null;

    public GetAllCategory() {
    }

    public List<Category> getAllCategory() {
        con = ConnectDB.connect();
        List<Category> listCategory = new ArrayList<>();
        String sql = "SELECT * FROM categories";
        try {
            pre = con.prepareStatement(sql);
            rs = pre.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("category_id");
                String categoryName = rs.getString("category_name");
                int countQuestion = rs.getInt("category_count_question");
                Integer parentCategory = (Integer) rs.getObject("category_parent");
                Integer idNumber = (Integer) rs.getObject("category_id_number");
                String info = (String) rs.getObject("category_info");
                if (info == null) {
                    info = "";
                }
                if (parentCategory == null) {
                    parentCategory = -1;
                }
                if (idNumber == null) {
                    idNumber = -1;
                }
                Category category = new Category();
                category.setId(id);
                category.setCount(countQuestion);
                category.setName(categoryName);
                category.setParentCategory(parentCategory);
                category.setInfo(info);
                category.setIdNumber(idNumber);
                listCategory.add(category); // Add the updated category to the list

            }
            listCategory = ArrangeCategory.arrangeCategories(listCategory);
            return listCategory;
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
            return listCategory;
        }
    }
}
