package ListasDobles;

public class ListaDoble<T> {

    Nodo<T> inicio;

    public void insertInicio(T dato) {
        Nodo<T> nodo = new Nodo<>();
        nodo.setInfo(dato);
        nodo.setSig(inicio);
        nodo.setAnt(null);

        if (inicio != null)
            inicio.setAnt(nodo);

        inicio = nodo;
    }

    public void insertaFinal(T dato) {
        Nodo<T> nodo = new Nodo<>();
        nodo.setInfo(dato);
        nodo.setSig(null);

        if (inicio == null) {
            nodo.setAnt(inicio);
            inicio = nodo;
        } else {
            Nodo<T> r = inicio;

            while (r.getSig() != null)
                r = r.getSig();

            r.setSig(nodo);
            nodo.setAnt(r);
        }
    }

    public T eliminaInicio() {
        Nodo<T> nodo = inicio;

        if (inicio == null)
            return null;
        else if (inicio.getSig() == null)
            inicio = null;
        else {
            inicio = inicio.getSig();
            inicio.setAnt(null);
        }

        return nodo.getInfo();
    }

    public T eliminaFinal() {
        Nodo<T> nodo = inicio;

        if (inicio == null)
            return null;
        else
            if (inicio.getSig() == null)
                inicio = null;
            else {
                Nodo<T> r = inicio;

                while (r.getSig() != null)
                    r = r.getSig();

                r.getAnt().setSig(null);
            }

        return nodo.getInfo();
    }

    public String recorre() {
        StringBuilder string = new StringBuilder();

        if (inicio == null)
            return null;
        else {
            Nodo<T> r = inicio;

            while (r != null) {
                string.append(r.getInfo());
                r = r.getSig();
            }
        }

        return string.toString();
    }
}
