package repository.category;

import connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EditCategory {

    public EditCategory() {

    }

    public void updateCategoryQuestionCount(int categoryId, int questionCount) {
        Connection con = ConnectDB.connect();
        String sql = "UPDATE categories SET category_count_question = ? WHERE category_id = ?";

        int categoryPrevCount = getUpdatedQuestionCount(con, categoryId);
        int categoryNextCount = categoryPrevCount + questionCount;
        try (PreparedStatement pre = con.prepareStatement(sql)) {
            pre.setInt(1, categoryNextCount);
            pre.setInt(2, categoryId);

            pre.executeUpdate();

            System.out.println("Category question count updated successfully!");
        } catch (SQLException ex) {
            System.out.println("Error updating category question count: " + ex.getMessage());
        }
    }

    private int getUpdatedQuestionCount(Connection con, int categoryId) {
        int updatedQuestionCount = 0;
        String sql = "SELECT category_count_question FROM categories WHERE category_id = ?";

        try (PreparedStatement pre = con.prepareStatement(sql)) {

            pre.setInt(1, categoryId);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                updatedQuestionCount = rs.getInt("category_count_question");
            }

        } catch (SQLException ex) {
            System.out.println("Error retrieving updated question count: " + ex.getMessage());
        }

        return updatedQuestionCount;
    }
}
