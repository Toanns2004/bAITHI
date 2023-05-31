package cum.class1;

import cum.DBUtil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressBooksManagement {
    public void addNewAddressBooks(AddressBooks addressBooks) throws Exception{
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement pstm = conn.prepareStatement(
                    "INSERT INTO Address(Name,Company,Email,Phone) VALUES (?,?,?,?)"
            );
            pstm.setString(1, addressBooks.getName());
            pstm.setString(2,addressBooks.getCompany());
            pstm.setString(3,addressBooks.getEmail());
            pstm.setString(4,addressBooks.getPhone());

            int update = pstm.executeUpdate();
            if (update >0){
                System.out.println("Insert Address Books success!!");
            }
            pstm.close();
            conn.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void getAddressBooks()throws Exception{
        try {
            Connection conn = DBUtil.getConnection();
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT *FROM Address"
            );
             while (rs.next()){
                 AddressBooks addressBooks = new AddressBooks(
                         rs.getInt(1),
                         rs.getString(2),
                         rs.getString(3),
                         rs.getString(4),
                         rs.getString(5)
                 );
                 System.out.println(addressBooks.toString());
             }
             rs.close();
             st.close();
             conn.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public AddressBooks getAddressBooksByName(String name)throws Exception{
        AddressBooks addressBooks = null;
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT ID, Name,Company,  Email,Phone FROM Address WHERE Name = ?"
            );
            pstm.setString(1,name);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                addressBooks = new AddressBooks(
                        rs.getInt(1),
                     rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                );

            }else {
                System.out.println("Not found");
            }
            rs.close();
            pstm.close();
            conn.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return addressBooks;
    }
}
