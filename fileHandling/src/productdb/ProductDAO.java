package productdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * CREATE a Product
 * read a product given its id or name
 * update a product having a particular id with new details
 * delete a product with a given id
 * 
 */

public class ProductDAO {

	private static final String SEARCH_BY_ID ="select* from product where product_Id=?";
	private static final String UPDATE_PRODUCT="update product set name=?,price=?,cat_Id=? where product_Id=?";
	private static final String CREATE_PRODUCT="insert into product (product_Name,price,category) values product_Name=?,price=?,cat_Id=? where product_Id=?";
	private static final String DELETE_PRODUCT="Delete FROM products where id=? ";
	private CategoryDAO categoryDAO;

	public ProductDAO() {
		categoryDAO = new CategoryDAO();
	}

	public Product searchById(int id) throws SQLException{
		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","4724");
		PreparedStatement pstmt =cnx.prepareStatement(SEARCH_BY_ID);
		pstmt.setInt(1, id);
		ResultSet rs=pstmt.executeQuery();
		Product product =null;
		if(rs.next()) {
			Category category=categoryDAO.searchById(rs.getInt("cat_Id"));
			product = new Product(rs.getInt("product_Id"),rs.getString("product_Name"),rs.getDouble("price"),category);	
		}
		cnx.close();
		return product;
	}
	public Boolean update(Product product) throws SQLException{
		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","4724");
		PreparedStatement pstmt =cnx.prepareStatement(UPDATE_PRODUCT);
		pstmt.setString(1,product.getName());
		pstmt.setDouble(2,product.getPrice());
		pstmt.setInt(3,product.getCategory().getId() );
		pstmt.setInt(4, product.getId());
		int rowsUpdated =pstmt.executeUpdate();
		cnx.close();
		return rowsUpdated ==1;
	}
	public boolean create(Product product) throws SQLException{
		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","4724");
		PreparedStatement pstmtc=cnx.prepareStatement(CREATE_PRODUCT);
		pstmtc.setString(1,product.getName());
		pstmtc.setDouble(2, product.getPrice());
		pstmtc.setInt(3,product.getCategory().getId());
		
		int rowsInserted =pstmtc.executeUpdate();
		cnx.close();
		return rowsInserted ==1;
	}
	
	public boolean delete(Product product) throws SQLException {
		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","4724");
		PreparedStatement pstmtd =cnx.prepareStatement(DELETE_PRODUCT);
		pstmtd.setInt(1, product.getId());
		int rowsDeleted =pstmtd.executeUpdate();
		cnx.close();
		return rowsDeleted == 1;
	}
}
