import java.util.Date;

/**
 * Clase persona con los atributos name, lastname, dateBirth y height.
 */
public class Person {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    /**
     * Constructor vacío: método que sirve para crear objetos de tipo persona.
     */
    public Person() {
    }

    /**
     * Método constructor de la clase: crea una instancia de la clase Person.
     *
     * @param lastName1, primer apellido de la persona.
     * @param lastName2, segundo apellido de la persona.
     * @param dateBirth, fecha de nacimiento de la persona.
     * @param height,    altura de la persona.
     */

    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * método que devuelve el nombre de la persona
     * *@return devuelve o retorna el nombre de la persona.
     **/

    public String getName() {
        return name;
    }

    /**
     * método para crear o modificar el nombre de la persona, recibe como parámetro el nuevo nombre a
     * asignar.
     *
     * @param name valor requerido para asignar o modificar el nombre de la persona.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * método que devuelve el primer apellido de la persona.
     *
     * @return el apellido de la persona.
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * método que asigna el primer apellido de la persona, recibe como parámetro el nuevo apellido.
     *
     * @param lastName1 nuevo primer apellido.
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * método que devuelve el segundo apellido de la persona.
     *
     * @return valor del apellido de la persona.
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * método que asigna o modifica el segundo apellido de la persona, recibe como parámetro el nuevo segundo apellido.
     *
     * @param lastName2 valor del nuevo segundo apellido a asignar.
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * método que devuelve o retorna la fecha de nacimiento de la persona.
     *
     * @return el valor de la fecha de nacimiento de la persona.
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * Método que asigna o modifica la fecha de nacimiento de la persona.
     *
     * @param dateBirth el valor de la nueva fecha de nacimiento.
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * método que devuelve o retorna la altura de la persona.
     *
     * @return el valor de la altura de la persona.
     */
    public float getHeight() {
        return height;
    }

    /**
     * método que asigna o modifica la altura de la persona, recibe como argumento la nueva altura.
     * @param height, el valor de la nueva altura.
     */
    public void setHeight(float height) {
        this.height = height;
    }
}

