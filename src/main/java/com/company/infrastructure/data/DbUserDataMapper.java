package com.company.infrastructure.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUserDataMapper extends AbstractUserDataMapper {

    public static Connection conn;
    public static Statement statmt;
    public static ResultSet resSet;

    public DbUserDataMapper(String dbfile) {
        try {
            System.out.println("Reading from sqlite");
            connect(dbfile);
            readDB();
            closeDB();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void connect(String dbfile) throws ClassNotFoundException, SQLException
    {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:"+dbfile);

        System.out.println("База Подключена!");
    }

    public void readDB() throws ClassNotFoundException, SQLException
    {
        resSet = statmt.executeQuery("SELECT * FROM users LIMIT 8");

        int i = 0;
        while(resSet.next())
        {
            int id = resSet.getInt("id");
            String  username = resSet.getString("usersname");
            String  email = resSet.getString("email");
            String  password = resSet.getString("password");
            System.out.println( "ID = " + id );
            System.out.println( "username = " + username );
            System.out.println( "email = " + email );
            System.out.println( "password = " + password );
            System.out.println();
            users[i] = new User(String.valueOf(id), username, email, password);;
            i++;

        }

        System.out.println("Таблица выведена");
    }

    public static void closeDB() throws ClassNotFoundException, SQLException
    {
        conn.close();
        statmt.close();
        resSet.close();

        System.out.println("Соединения закрыты");
    }
}
