
package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;

public class Program {
    
    public static void main(String[] args){
        
        Department obj = new Department(1, "Books");
        SellerDAO sellerDAO = DAOFactory.createSellerDAO();
        System.out.println(obj);
    }
    
}
