import java.util.ArrayList;

/**
 * Clase Friut con atributos naeme, peso y colores.
 */
public class Fruit {
    public String name;
    private String averageWeight;
    public ArrayList<String> colors;

    /**
     * Método constructor: crea una instancia de la clase Fruit.
     *
     * @param name          nombre de la fruta.
     * @param averageWeight peso de la fruta.
     * @param colors        colores posibles que toma la fruta.
     */
    public Fruit(String name, String averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * método para obtener el nombre de la fruta.
     *
     * @return devuelve el nombre de la fruta.
     */
    public String getName() {
        return name;
    }

    /**
     * método para asignar o modificar el nombre de la fruta.
     *
     * @param name argumento necesario para asignar o modificar el nombre de la fruta.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * método para obtener el peso promedio de la fruta.
     *
     * @return devuelve el peso promedio de la fruta.
     */
    public String getAverageWeight() {
        return averageWeight;
    }

    /**
     * método para asignar o modificar el peso promedio de la fruta.
     *
     * @param averageWeight argumento necesario para asignar o modificar el peso promedio de la fruta.
     */
    public void setAverageWeight(String averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * método para obtener la lista de colores de la fruta.
     *
     * @return devuelve la lista de colores de la fruta.
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * método para asignar o modificar la lista de colores de la fruta.
     *
     * @param colors argumento (lista) necesario para asignar o modificar los colores de la fruta.
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
