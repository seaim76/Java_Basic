package interfaces;

import classes.*;

public interface IProductItem{

	boolean insertProductItem(ProductItem f);
	
	boolean removeProductItem(ProductItem f);
	
	ProductItem searchProductItem(String fid);
	
	void showAllProductItems();
}





