package LearningJDBC;

import java.sql.*;
/*
* there are three types of statements
* Statement st=conn.createStatement(); normal statement
* preparedStatement pst=cnn.PreparedStatement(query); prepared statement
* callable statement
* */
public class JDBCdemo {
    public static void main(String[] args) throws SQLException {
        batchProcessing();
    }
    public static void readRecord() throws SQLException{
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String uname="root";
        String password="Gopikris0021";
        String query="select * from employee";
        Connection conn= DriverManager.getConnection(url,uname,password);
        Statement st= conn.createStatement();
        ResultSet rs=st.executeQuery(query);
        while (rs.next()) {
            System.out.println("Id : "+rs.getInt(1));
            System.out.println("name : "+rs.getString(2));
            System.out.println("Salary : "+rs.getInt(3));
        }
        conn.close();
    }

    public static  void insertRecord() throws SQLException {
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String uname="root";
        String password="Gopikris0021";
//        String query="insert into employee value(24,'priya',1200000)";
        //if you want to enter the data into table using variables
        int id=96;
        String name="unknown";
        int salary=3000000;
        String query="insert into employee value(" + id + ",'" + name + "'," +salary +")";
        Connection conn=DriverManager.getConnection(url,uname,password);
        Statement st=conn.createStatement();
        int change=st.executeUpdate(query);
        System.out.println("number of colums changed "+change);
    }

    public static  void preparedInsertRecord() throws SQLException {
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String uname="root";
        String password="Gopikris0021";
        int id=34;
        String name="zebstriker";
        int salary=3000006;
        String query="insert into employee value(?,?,?)";
        Connection conn=DriverManager.getConnection(url,uname,password);
        PreparedStatement pmt=conn.prepareStatement(query);
        pmt.setInt(1,id);//first number represent position of ? i.e in the string query
        pmt.setString(2,uname);//second represent the variable
        pmt.setInt(3,salary);
        int change=pmt.executeUpdate();//here we no need to pass the query as we already mappped pmt to it
        System.out.println("number of colums changed "+change);
    }

    public static  void deleteRecord() throws SQLException {
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String uname="root";
        String password="Gopikris0021";
        int id=34;

        String query="delete from employee where emp_id="+id;
        Connection conn=DriverManager.getConnection(url,uname,password);
        Statement st=conn.createStatement();
        int change=st.executeUpdate(query);
        System.out.println("number of colums changed "+change);
    }

    public static  void updateRecord() throws SQLException {
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String uname="root";
        String password="Gopikris0021";
        int id=13;

        String query="update employee set salary=123456 where emp_id="+id;
        Connection conn=DriverManager.getConnection(url,uname,password);
        Statement st=conn.createStatement();
        int change=st.executeUpdate(query);
        System.out.println("number of colums changed "+change);
    }

    public static void callStoredProcedure() throws SQLException{
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String uname="root";
        String password="Gopikris0021";
        Connection conn=DriverManager.getConnection(url,uname,password);
        CallableStatement cst= conn.prepareCall("{call GetEmp()}");
        //now while executing the cst we whould do it based on the called procedure if it just read then we should get
        //the values and store it in a result set ,if the called procedure is just changing the value then we will store
        //it in an integer data
        ResultSet rs=cst.executeQuery();
        while (rs.next()){
            System.out.println("Id : "+rs.getInt(1));
            System.out.println("name : "+rs.getString(2));
            System.out.println("Salary : "+rs.getInt(3));
        }
        conn.close();
    }

    public  static  void callWithArg() throws SQLException{
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String uname="root";
        String password="Gopikris0021";
        Connection conn=DriverManager.getConnection(url,uname,password);
        CallableStatement cst=conn.prepareCall("{call GetEmpById(?)}");
        int Id=13;
        cst.setInt(1,Id);
        ResultSet rs= cst.executeQuery();
        rs.next();
        System.out.println("Id : "+rs.getInt(1));
        System.out.println("name : "+rs.getString(2));
        System.out.println("String : "+rs.getInt(3));
        conn.close();
    }

    public  static  void callWithInOutArg() throws  SQLException{
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String uname="root";
        String password="Gopikris0021";
        int Id=13;
        Connection conn=DriverManager.getConnection(url,uname,password);
        CallableStatement cst=conn.prepareCall("{call GetNameById(?,?)}");
        cst.setInt(1,Id);
        cst.registerOutParameter(2,Types.VARCHAR);//first the position of ? then data type of the output varable
        cst.executeUpdate();//here we are updating but not execure querry because we are updating
        //the output variable and returning it to the second questionmark of that querry so that string wont be returned
        //from the executeUpdate() statement
        System.out.println("name : "+cst.getString(2));//here we are mentioning the position of the ?
        conn.close();
    }

    //connit vs autocommit
    /*
    * in general every satement will be auto commited when we did not mention anything about commit in our code
    * for example when there is an error in querr2 then querry1 will be autocommited and rolling back to old state will
    * be a  problem
    * in cases like banking we should commit the changes only when all the querries sucessfully run wihtout any
    * error then only changes should occur.
    * we can avoid autocommiting by setting connection autocommit  as false*/
    public static void commitdemo() throws SQLException{
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String uname="root";
        String password="Gopikris0021";
        String query1="update employee set salary = 543210 where Emp_id=13";
        String query2="update employee set salary = 543210 where Emp_id=12";

        Connection conn=DriverManager.getConnection(url,uname,password);
        conn.setAutoCommit(false);
        Statement st=conn.createStatement();
        int row1=st.executeUpdate(query1);
        int row2=st.executeUpdate(query2);
        if (row1 > 0 && row2 > 0) {
            conn.commit();//changes will occur to the table only when both the statements execute correctly
        }
        System.out.println("rows affected : " +row1);
        System.out.println("rows affected : " +row2);

        conn.close();
    }

    //batch processing -processing all query at once
    public static void batchProcessing() throws SQLException{
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String uname="root";
        String password="Gopikris0021";
        String query1="update employee set salary = 400000 where Emp_id=13";
        String query2="update employee set salary = 400000 where Emp_id=12";
        String query3="update employee set salary = 400000 where Emp_id=21";
        Connection conn=DriverManager.getConnection(url,uname,password);
        conn.setAutoCommit(false);
        Statement st=conn.createStatement();
        st.addBatch(query1);
        st.addBatch(query2);
        st.addBatch(query3);
        int[] arr=st.executeBatch();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0) conn.rollback();
        }
        conn.close();
    }

}
