package com.sales.genericutilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtils {
	Connection con=null;
/**
* This method is used to connect to the database
* @Chaitra L
* @return
* @throws SQLException
*/
public Connection connectToBD() throws SQLException
{
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	con = DriverManager.getConnection(IpathConstants.DBUrl,IpathConstants.DBUserName,IpathConstants.DBPassword);
	return con;
}
/**
 * This method is used to execute and get the data from database
 * @Chaitra L
 * @param query
 * @param colIndex
 * @param expData
 * @throws SQLException
 */
public void executeAndGetData(String query, int colIndex, String expData) throws SQLException {
	Statement state = con.createStatement();
	ResultSet result = state.executeQuery(query);
	boolean flag=false;
	while (result.next()) {
		String actualData = result.getString(colIndex);
		if (actualData.equals(expData)) {
			flag=true;
			break;
		}
	}
	if (flag) {
		System.out.println("The Data is Present");
	}
	else {
		System.out.println("The Data is not Present");
	}
}
/**
 * This method is used to update the query for commands expect select
 * @param query
 * @return 
 * @throws SQLException
 */
public ResultSet updateQuery(String query) throws SQLException
{
	Statement state = con.createStatement();
	ResultSet result = state.executeQuery(query);
	return result;
}
/**
 * This method is used to disconnect from the database
 * @throws SQLException
 */
public void disconnectDB() throws SQLException {
	con.close();
}

}
