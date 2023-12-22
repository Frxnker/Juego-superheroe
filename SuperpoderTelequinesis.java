class SuperpoderTelequinesis extends Superpoder {
    public SuperpoderTelequinesis() {
        super();
    }

    // Metodo usarPoder para poder determinar cuanta energia quita al realizarse
    
    public boolean usarPoder(int masa) {
        int energia = masa / 10;
        return super.usarPoder(energia);
    }
    public int usarPoder(double valor) {
        return 0;
    }
}