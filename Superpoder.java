public class Superpoder {

    // Inicializamos las variables como private
    
    private String nombre;
    private int energia;
    private String descripcion;

    public Superpoder() {
        nombre = "Desconocido";
        energia = 100;
        descripcion = "Desconocido";
    }

    // Getters para los atributos nombre, energia, descripcion

    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Metodo superpoder

    public Superpoder(String nombre, String descripcion, int energia) {
        this.nombre = nombre;
        this.energia = energia;
        this.descripcion = descripcion;
    }

    // Setters para los atributos nombre, energia, descripcion

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Metodo usar poder con el que nos devuelve un true o un false
    // en el caso de que necesite energia o no

    public boolean usarPoder(int n) {
        if (this.energia >= n)  {
            this.energia -= n;
            return true;
        } else {
            return false;
        }
    }

    // Metodo descansar

    public int descansar(int n) {
        return n;
    }
}
