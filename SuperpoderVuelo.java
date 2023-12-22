class SuperpoderVuelo extends Superpoder {
    public SuperpoderVuelo() {
        super();
    }

    // Metodo usarPoder para poder determinar cuanta energia quita al realizarse

    public boolean usarPoder(int tiempo) {
        int energia = tiempo / 30;
        return super.usarPoder(energia);
    }

    public int usarPoder(double valor) {
        return 0;
    }
}
