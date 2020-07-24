
package model.dao;

import DB.DB;
import model.dao.impl.SellerDAOJDBC;

public class DAOFactory {
    
    public static SellerDAO createSellerDAO() {
        return new SellerDAOJDBC(DB.getConnection());
    }
}
