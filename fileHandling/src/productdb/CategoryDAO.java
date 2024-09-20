package productdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryDAO {

	private static final String SEARCH_BY_ID = "select * from category where cat_Id = ?";

	public Category searchById(int id) throws SQLException {
		Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "4724");
		PreparedStatement pstmt = cnx.prepareStatement(SEARCH_BY_ID);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		Category category = null;
		if (rs.next())
			category = new Category(rs.getInt("cat_Id"), rs.getString("cat_Name"));
		cnx.close();
		return category;
	}
}

