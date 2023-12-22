class SuperpoderMagia extends Superpoder {
    public SuperpoderMagia() {
        super();
    }

    // Metodo usarPoder para poder determinar cuanta energia quita al realizarse

    public boolean usarPoder(int hechizo) {
        int energia = hechizo * 10;
        return super.usarPoder(energia);
    }

    public int usarPoder(double valor) {
        return 0;
    }
}