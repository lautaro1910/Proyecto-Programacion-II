package Modelo;

import java.util.Comparator;


public class OrdenarProductoPorNombre implements Comparator<Producto> {
    @Override
    public int compare(Producto o1, Producto o2) {
        return o1.compareTo(o2);
    }
}
