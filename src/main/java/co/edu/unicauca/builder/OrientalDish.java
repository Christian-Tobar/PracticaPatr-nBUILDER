package co.edu.unicauca.builder;

/**
 * Producto oriental que usa herencia
 *
 * @author Christian David Tobar Mosquera, Carlos Alberto Salamanca Quijano
 */
public class OrientalDish extends Dish {
    /**
     * Nombre del plato Oriental
     */
    private String orientalName;
    
    /**
     * Constructor parametrizado
     * @param name nombre 
     * @param description descripcion
     * @param image imagen
     * @param price precio
     * @param size tamaño
     * @param orientalName nombre Plato
     */
    public OrientalDish(String name, String description, String image, int price, EnumSize size, String orientalName) {
        super(name, description, image, price, size);
        this.orientalName = orientalName;
    }
    
    //Getters and Setters
    public String getOrientalName() {
        return orientalName;
    }

    public void setOrientalName(String orientalName) {
        this.orientalName = orientalName;
    }

}
