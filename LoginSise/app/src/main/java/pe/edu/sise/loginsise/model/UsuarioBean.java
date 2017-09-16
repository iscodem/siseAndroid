package pe.edu.sise.loginsise.model;

/**
 * Created by cisco on 15/09/2017.
 */

public class UsuarioBean {

    private String nombres;
    private String apellidos;
    private int edad;
    private String user;
    private String password;

    public UsuarioBean(String nombres, String apellidos, int edad, String user, String password) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.user = user;
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
