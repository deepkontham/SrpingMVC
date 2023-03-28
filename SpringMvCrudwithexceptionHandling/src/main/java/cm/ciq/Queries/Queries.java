package cm.ciq.Queries;

public interface Queries {
	public static String INSERT_QUERY = "INSERT INTO Employee VALUES(?,?,?,?)";
	public static String UPDATE_QUERY = "UPDATE Employee SET name=?, dob=?,city=? WHERE id=?";
	public static String DELETE_QUERY = "DELETE  FROM Employee   WHERE id=?";
	public static String Retrive_All = "select * FROM Employee";
	public static String updategetby_id = "select * FROM Employee where id=?";



}
