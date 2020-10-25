package co.edu.unicauca.builder;

/**
 * Producto italiano que usa herencia
 *
 * @author Christian David Tobar Mosquera, Carlos Alberto Salamanca Quijano
 */
public class ItalianDish extends Dish{
    /**
     * Nombre del plato Italiano
     */
    private String ItalianName;
    
    /**
     * Constructor parametrizado
     * @param name nombre 
     * @param description descripcion
     * @param image imagen
     * @param price precio
     * @param size tamaño
     * @param ItalianName nombre Plato
     */
    public ItalianDish(String name, String description, String image, int price, EnumSize size, String ItalianName) {
        super(name, description, image, price, size);
        this.ItalianName = ItalianName;
    }
    
    //Getters and Setters
    public String getItalianName() {
        return ItalianName;
    }

    public void setItalianName(String ItalianName) {
        this.ItalianName = ItalianName;
    }
    
}
