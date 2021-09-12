public class Main {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>();

        lista.insertaInicio("a");
        lista.insertaInicio("b");
        lista.insertaFinal("c");
        lista.insertaFinal("d");
        lista.insertaFinal("e");

        System.out.println("Lista Completa: \n" + lista.toString());

        lista.eliminaInicio();
        lista.eliminaInicio();
        lista.eliminaFinal();

        System.out.println("Lista borrada: \n" + lista.toString());
    }
}
