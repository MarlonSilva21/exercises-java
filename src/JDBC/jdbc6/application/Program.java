package JDBC.jdbc6.application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import JDBC.jdbc6.db.DB;
import JDBC.jdbc6.db.DbException;

public class Program {

    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;

        try {
            conn = DB.getConnection();
            conn.setAutoCommit(false);
            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            /**
             *  false error
             *  to force an exception
             *  and rollback
             */
//			int x = 1;
//			if (x < 2) {
//				throw new SQLException("Fake Error!!@#@!#");
//			}

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit();

            System.out.println("rows1 :" + rows1 + " | rows2 :" + rows2);

        } catch (SQLException e) {
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back! Caused By " + e.getMessage());
            } catch (SQLException e1) {
                throw new DbException("Error trying to rollback! Caused By " + e1.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
