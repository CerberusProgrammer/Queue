public class Lista<T> {

    private Nodo<T> inicio;

    public void insertaInicio(T dato) {
        Nodo<T> nodo = new Nodo<>();
        nodo.setInfo(dato);
        nodo.setSig(inicio);
        inicio = nodo;
    }

    public T eliminaInicio() {
        return null;
    }

     public void insertaFinal(T dato) {
         Nodo<T> nodo = new Nodo<>();
         nodo.setInfo(dato);

         if (inicio == null) {
             nodo.setSig(inicio);
             inicio = nodo;
         } else {
             Nodo<T> r = new Nodo<>();
             while (r.getSig() != null)
                 r = r.getSig();

             r.setSig(nodo);
             nodo.setSig(null);
         }
    }

    public T eliminaFinal() {
        return null;
    }

    public String toString() {
        String string = "";

        if (inicio != null)
            if (inicio.getSig() == null)
                string = "" + inicio.getInfo();
            else {
                Nodo<T> r = inicio;
                while (r != null) {
                    string += r.getInfo();
                    r = r.getSig();
                }
            }
        else
            return "vacio";
        return string;
    }
}
