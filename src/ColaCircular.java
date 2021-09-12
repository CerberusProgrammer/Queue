public class ColaCircular<T> {

    int inicio;
    int fin;
    T[] cola;
    int MAX = 20;

    ColaCircular() {
        cola = (T[])new Object[5];
        inicio = 0;
        fin = inicio;
    }

    public void insertaCircular(T dato) {
        if (fin == MAX && (inicio == 1 ) || ((fin + 1) == inicio)) {
            System.out.println("Desbordamiento");
        } else if (fin == MAX)
            fin = 1;
        else
            fin += 1;

        cola[fin] = dato;
        if (inicio == 0)
            inicio = 1;
    }

    public void eliminaCircular() {
        T dato;
        if (inicio == 0)
            System.out.println("subdesbordamiento");
        else
            dato = cola[inicio];

        if (inicio == fin) {
            inicio = 0;
            fin = 0;
        } else if (inicio == MAX)
            inicio = 1;
        else
            inicio = inicio + 1;
    }
}
