package Objetos;

public class Usuario {
    private long carnet;
    private String nombre;
    private String apellido;
    private String carrera;
    private String password;
    
    public Usuario(long carnet, String n, String a, String c, String p){
        this.carnet=carnet;
        this.nombre=n;
        this.apellido=a;
        this.carrera=c;
        this.password=p;
    }

    public long getCarnet() {
        return carnet;
    }

    public void setCarnet(long carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
