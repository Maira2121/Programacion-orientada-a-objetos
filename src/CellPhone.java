/**
 * Clase CellPhone con los atributos: modelo, marca, color y tamaño.
 */
public class CellPhone {
    // atributos de la clase
    private String model;
    protected String trademark;
    private String color;
    private String size;

    //Métodos

    /**
     * Constructor crea una instancia de la clase Person
     * @param model modelo del celular
     * @param trademark marca del celular
     * @param color color del celular
     * @param size dimensión del celular
     */
    public CellPhone(String model, String trademark, String color, String size) {
        this.model = model;
        this.trademark = trademark;
        this.color = color;
        this.size = size;
    }

    /**
     * Método para obtener el modelo del teléfono celular.
     * @return devuelve el modelo del teléfono celular.
     */
    public String getModel() {
        return model;
    }

    /**
     * Método que asigna/modifica el modelo del teléfono celular.
     * @param model argumento necesario para asignar/modificar el modelo del teléfono celular.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Método para obtener la marca del teléfono celular.
     * @return devuelve la marca del teléfono celular.
     */
    public String getTrademark() {
        return trademark;
    }

    /**
     * Método que asigna/modifica la marca del teléfono celular.
     * @param trademark argumento necesario para asignar/modificar la marca del teléfono celular.
     */
    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    /**
     * Método para obtener el color del teléfono celular.
     * @return devuelve el color del teléfono celular.
     */
    public String getColor() {
        return color;
    }

    /**
     * Método que asigna/modifica la marca del teléfono celular.
     * @param color argumento necesario para asignar/modificar el modelo del teléfono celular.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método para obtener la dimensión del teléfono celular.
     * @return devuelve la dimensión del teléfono celular.
     */
    public String getSize() {
        return size;
    }

    /**
     * Método que asigna/modifica las dimensiones del teléfono celular.
     * @param size argumento necesario para asignar/modificar las dimensiones del teléfono celular.
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Método para recibir una llamada.
     */
    private void receiveCall(){
        System.out.println("Receiving call");
    }

    /**
     * Método para realizar una llamada
     * @param number parámetro necesario para realizar una llamada.
     */
    private void makeCall(String number){
        System.out.println("Making call");
    }

    /**
     * Método para recibir un mensaje
     * @param message mensaje a recibir.
     */
    private void receiveMessage(String message){
        System.out.println("Message received");

    }

    /**
     * método para enviar un mensaje
     * @param message mensaje a enviar
     */
    private void sendMessage(String message){
        System.out.println("Message sent");
    }

    /**
     * método para actualizar el telefono
     */
    protected void update(){
        System.out.println("upgraded phone");
    }

}
