import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {

        /*
        JDBC steps
        Import packages
        Load & Register Driver
        Create Connection
        Create Statement
        Execute Statement
        Process the steps
        close
        */

        String url ="jdbc:postgresql://localhost:5432/Family";
        String username = "postgres";
        String password = "1389";
        String sql = "select * from familymembers";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            System.out.print(rs.getInt(1) + " _ ");
            System.out.print(rs.getString(2) + " _ ");
            System.out.println(rs.getInt(3) + " _ ");
        }
        con.close();
        System.out.println("Connection Closed");
    }

}
