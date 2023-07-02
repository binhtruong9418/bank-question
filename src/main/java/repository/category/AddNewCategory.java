package repository.category;

import connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Types.NULL;

public class AddNewCategory {

    private Connection con = ConnectDB.connect();
    private PreparedStatement pre = null;

    public AddNewCategory() {

    }

    public int addNewCategory(String name, String info, int parentCategory, String idNumberInput) {
        int generatedCategoryId = -1; // Default value for failure
        String sql = "INSERT INTO categories (category_name,category_parent,category_info,category_id_number,category_count_question) VALUES (?,?,?,?,0)";
        try {
            pre = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pre.setString(1, name);
            if (parentCategory == 0) {
                pre.setNull(2, NULL);
            } else {
                pre.setInt(2, parentCategory);
            }
            if (info.isEmpty()) {
                pre.setNull(3, NULL);
            } else {
                pre.setString(3, info);
            }
            if (idNumberInput.isEmpty()) {
                pre.setNull(4, NULL);
            } else {
                pre.setInt(4, Integer.parseInt(idNumberInput));
            }
            int affectedRows = pre.executeUpdate();
            if (affectedRows > 0) {
                ResultSet generatedKeys = pre.getGeneratedKeys();
                if (generatedKeys.next()) {
                    generatedCategoryId = generatedKeys.getInt(1);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error adding category to the database: " + ex.getMessage());
        }

        return generatedCategoryId;
    }
}
