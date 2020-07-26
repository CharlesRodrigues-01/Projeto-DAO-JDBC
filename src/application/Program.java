
package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        SellerDAO sellerDAO = DAOFactory.createSellerDAO();
        System.out.println("=== TEST 1: Seller findById ===");
        Seller seller = sellerDAO.findById(4);
        System.out.println(seller);
        
        System.out.println("\n === TEST 2: Seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDAO.FindByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }
        
        System.out.println("\n === TEST 3: Seller findAll ===");
        list = sellerDAO.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }
        
        System.out.println("\n === TEST 4: Seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDAO.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
        
        System.out.println("\n === TEST 5: Seller update ===");
        seller = sellerDAO.findById(1);
        seller.setName("Martha Waine");
        sellerDAO.upadate(seller);
        System.out.println("Update Complete!");
        
        System.out.println("\n === TEST 6: Seller delete ===");
        System.out.println("Enter id for delete test:");
        int id = sc.nextInt();
        sellerDAO.deleteById(id);
        System.out.println("Delete Completed!");
        sc.close();
    }
}
