package de.vogella.mysql.fisrt;

import java.util.concurrent.ExecutionException;

public interface UsersDAO {
    public void addUSer(String nombre, String apellidos) throws Exception;
}
