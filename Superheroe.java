public class Superheroe {

    // inicializamos los valores como private

    private String nombre;    
    private String listaPoderes;
    
    public Superheroe(String nombre) {
        this.nombre = nombre;
    }

    // inciamos todas las clases para poder usarlas en metodo usarPoder

    SuperpoderVuelo vuelo = new SuperpoderVuelo();
    SuperpoderFuerza fuerza = new SuperpoderFuerza();
    SuperpoderMagia magia = new SuperpoderMagia();
    SuperpoderTelequinesis telequinesis = new SuperpoderTelequinesis();
    
    private Superpoder[] ListaSuperpoderes = new Superpoder[4];

    // Creamos el metodo agregarPoder y le colocamos el poder en una zona en concreto

    public void agregarPoder(int tipo) {
        switch (tipo) {
            case 1:
                ListaSuperpoderes[0] = new Superpoder("Vuelo", "El nivel de superpoder se reduce en una unidad cada 30 segundos de vuelo.", 100 );
                break;
            case 2:
                ListaSuperpoderes[1] = new Superpoder("Fuerza", "El parámetro fuerza indica cuántas unidades de energía se han gastado" , 100 );
                break;
            case 3:
                ListaSuperpoderes[2] = new Superpoder("Magia", " Hay 8 hechizos distintos simbolizados con los números del 1 al 8. El hechizo 1 gasta 10 unidades de energía, el hechizo 2 gasta 20 unidades, el 3, 30 unidades, y así sucesivamente", 100);
                break;
            case 4:
                ListaSuperpoderes[3] = new Superpoder("Telequinesis", "El nivel de energía gastado será el resultado de dividir la masa del objeto en kg entre 10", 100 );
                break;
        }
    }

    // Creamos el método eliminarPoder, dependiendo de la zona que elija
    // ya que viene elejida por el programa, pues dependiendo del poder que tenga el superheroe
    // se eleminara ese poder en cuestion

    public void eliminarPoder(int tipo) {
        switch (tipo) {
            case 1:
                ListaSuperpoderes[0] = null;
                break;
            case 2:
                ListaSuperpoderes[1] = null;
                break;
            case 3:
                ListaSuperpoderes[2] = null;
                break;
                case 4:
                ListaSuperpoderes[3] = null;
                break;
        }
    }

    // Metodo usarPoder por el cual dependiendo de los que nos diga el usuario
    // se aplique uno u otro

    public void usarPoder(int tipo, double valor) {
        if (ListaSuperpoderes[tipo].getNombre().equals("Vuelo")) ListaSuperpoderes[tipo].usarPoder(vuelo.usarPoder(valor));
        if (ListaSuperpoderes[tipo].getNombre().equals("Fuerza")) ListaSuperpoderes[tipo].usarPoder(fuerza.usarPoder(valor));
        if (ListaSuperpoderes[tipo].getNombre().equals("Magia")) ListaSuperpoderes[tipo].usarPoder(magia.usarPoder(valor));
        if (ListaSuperpoderes[tipo].getNombre().equals("Telequinesis")) ListaSuperpoderes[tipo].usarPoder(telequinesis.usarPoder(valor));
    }

    
    public String getPoderes() {
        listaPoderes = " ";
        for (int i = 0; i < 4; i++) {
            if (ListaSuperpoderes[i] != null) listaPoderes += (i+1) + "." + ListaSuperpoderes[i].getNombre() + " ";
        }
        return listaPoderes;
    }

    // El metodo getPoder muestra los poderes que posee el heroe

    public String getPoder(int tipo) {
        String Poder = " ";
        Poder += "Energia: " + ListaSuperpoderes[tipo - 1].getEnergia() + "\n" + "Nombre: " + ListaSuperpoderes[tipo - 1].getNombre() + "\n" + "Descripción: " + ListaSuperpoderes[tipo - 1].getDescripcion() + "\n";
        return Poder;
    }

    // Metodo descansar, hace que al heroe se le recupere la energia

    public void descansar(int minutos) {
        for (Superpoder superpoder : ListaSuperpoderes) {
            if (superpoder != null) {
                superpoder.descansar(minutos);
            }
        }
    }

    // getter y setter para el nombre

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
