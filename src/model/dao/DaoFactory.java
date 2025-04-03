package model.dao;

import model.dao.impl.SellerDaoJDBC;

// Classe auxiliar responsável por instânciar os Daos

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}

}
