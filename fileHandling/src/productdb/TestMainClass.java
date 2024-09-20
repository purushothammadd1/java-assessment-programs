package productdb;

import java.sql.SQLException;

public class TestMainClass {
	public static void main(String[] args) throws SQLException {
		ProductDAO productDAO=new ProductDAO();
		System.out.println(productDAO.searchById(1));
		 
//		Category category =new Category(4,"Telvision_Appliciances");
//		Product product =new Product(2,"samsung",49000,1);
	}

}
