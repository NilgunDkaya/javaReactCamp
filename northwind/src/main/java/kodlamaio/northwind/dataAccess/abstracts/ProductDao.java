package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	// select * from products p where p.product_name =:productName
	Product getByProductName(String productName);
	
	// select * from products p where p.product_name =:productName and p.category_id=:categoryId
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	
	// select * from products p where p.category_id in(1,2,3,4)
	List<Product> getByCategory_CategoryIdIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);
	List<Product> getByProductNameStartsWith(String productName);
	List<Product> getByProductNameEndsWith(String productName);
	
	@Query("From Product where productName =:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory_CategoryId(String productName, int categoryId);
	
	// select p.produt_id, p.product_name, c.category_name from category c inner join product p on c.category_id = p.category_id
	@Query("select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto(p.id, p.productName, c.categoryName) "
			+ "From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
	
	

}
