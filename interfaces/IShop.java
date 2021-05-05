package interfaces;

import classes.*;

public interface IShop{

	boolean insertStationary(Shop r);

	boolean removeStationary(Shop r);

	Shop searchStationary(String rid);

	void showAllStationary();
}

