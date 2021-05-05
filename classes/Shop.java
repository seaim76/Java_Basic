package classes;

import java.lang.*;
import interfaces.*;

public class Shop implements IProductItem{

	private String rid;
	private String name;
	private ProductItem productitems[]= new ProductItem[500];


	public Shop(){};
	public Shop( String rid ,String name){
		this.rid = rid;
		this.name = name;
	}

	public void setName(String name){this.name = name;}

	public String getName(){return name;}

	public void setRid(String rid){this.rid = rid;}
	
	public String getRid(){return rid;}

	public boolean insertProductItem(ProductItem f){
		boolean flag =false;
		for(int i=0; i<productitems.length; i++){
			if(productitems[i]==null){
				productitems[i]=f;
				flag =  true;
				break;
			}
		}
		return flag;
	}
	public boolean removeProductItem(ProductItem f){
		boolean flag =false;
		for(int i=0; i<productitems.length; i++){
			if(productitems[i]==f){
				productitems[i]=null;
				flag =  true;
				break;
			}
		}
		return flag;

	}
	public ProductItem searchProductItem(String fid){
		ProductItem f = null;

		for(int i=0 ; i<productitems.length;i++){
			if(productitems!=null){
				if(productitems[i].getFid().equals(fid)){
					f=productitems[i];
					break;
				}
			}
		}
		return f;
	}
	public void showAllProductItems(){
		for(int i=0; i<productitems.length; i++){
			if(productitems[i] != null){
				productitems[i].showInfo();
			}
		}
	}
}