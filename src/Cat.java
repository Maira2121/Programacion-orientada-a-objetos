/**
 * Clase Cat con atributos: raza, edad, color, tamaño.
 */
public class Cat {
    private String breed;
    private float age;
    protected String color;
    private float height;

    /**
     * Constructor vacío, permite crear una instancia.
     */
    public Cat() {

    }

    /**
     * Constructor de la clase Cat, permite crear objetos de tipo Cat.
     *
     * @param breed  parámetro raza, requerido para crear el objeto.
     * @param age    parámetro edad, requerido para crear el objeto Cat
     * @param color  parámetro color, requerido para crear el objeto de tipo Cat.
     * @param height parámetro tamaño requerido para crear el objeto.
     */
    public Cat(String breed, float age, String color, float height) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.height = height;
    }

    /**
     * método que devuelve o retorna la raza del objeto de tipo Cat.
     *
     * @return valor que contiene la raza del objeto Cat.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Método para asignar o modificar la raza del objeto de tipo Cat.
     *
     * @param breed parámetro con el nuevo valor a asignar.
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Método que devuelve o retorna la edad del objeto de tipo Cat.
     *
     * @return valor de la edad del objeto de tipo Cat.
     */
    public float getAge() {
        return age;
    }

    /**
     * Método para modificar o asignar la edad del objeto de tipo Cat.
     *
     * @param age parámetro necesario para asignar la nueva edad al objeto de tipo Cat.
     */
    public void setAge(float age) {
        this.age = age;
    }

    /**
     * Método para obtener el color del objeto de tipo Cat.
     *
     * @return valor con el color del objeto Cat.
     */
    public String getColor() {
        return color;
    }

    /**
     * Método para asignar o modificar el color del objeto de tipo Cat.
     *
     * @param color valor requerido para asignar el color al objeto.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método para obtener el valor del atributo tamaño del objeto Cat.
     *
     * @return devuelve el valor del tamaño del objeto Cat.
     */
    public float getHeight() {
        return height;
    }

    /**
     * Método para asignar o modificar el tamaño del objeto Cat.
     * @param height valor requerido para asignar o modificar el tamaño del objeto Cat.
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Método que hace que el objeto Cat maúlle.
     */
    public void meow() {
        System.out.println("Emitir maullidos");
    }

    /**
     * método privado que hace que el objeto corra.
     */
    private void run() {
        System.out.println("Soy un gato y estoy corriendo");
    }

    /**
     * Método protegido que hace que el objeto se esconda.
     */
    protected void hide() {
        System.out.println("Soy un gato y estoy escondido");
    }
}
