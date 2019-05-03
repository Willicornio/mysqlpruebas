package de.vogella.mysql.fisrt;

import java.lang.reflect.Field;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Session {

    Connection session = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    protected Session () {

        try {
            this.session = getConnection();

        }catch (Exception e){
            e.printStackTrace();
        }

    }


    private Connection getConnection() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            session = DriverManager
                    .getConnection("jdbc:mysql://localhost/feedback?"
                            + "user=root&password=dsa2019");

            return session;

        } catch (Exception e) {

            throw e;
        }



    }




    public void save (Object o) throws Exception{


            statement = session.createStatement();
            // Result set get the result of the SQL query
            String a;
            a = o.getClass().getSimpleName();

            System.out.println(a);

            Field[] fields = o.getClass().getDeclaredFields();


            for (Field f: fields) {
                System.out.println(f.getName());
            }

        for (Field f: fields) {
            System.out.println("?,");
        }

            /*if ( a == "Usuario"){

                String nombre;



                e.getName();

                preparedStatement = session
                        .prepareStatement("insert into  feedback." + a +"values (default, ?, ?)");
                // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
                // Parameters start with 1
                preparedStatement.setString(1, Nombre);
                preparedStatement.setString(2, apellido);
                preparedStatement.executeUpdate();
            }


        }catch (Exception fatal){
            throw fatal;
        }


    }




    }






*/
        }
    }





