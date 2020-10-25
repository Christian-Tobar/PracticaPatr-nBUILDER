package co.edu.unicauca.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Plato. Representa un Producto
 *
 * @author Christian David Tobar Mosquera, Carlos Alberto Salamanca Quijano
 */
public class Dish {
    /**
     * Nombre del plato
     */
    private String name;
    /**
     * Descripcion del plato
     */
    private String description;
    /**
     * Imagen del plato
     */
    private String image;
    /**
     * Precio del plato
     */
    private int price;
    /**
     * Tamaño de la porcion
     */
    private EnumSize size;
    /**
     * Lista de partes 
     */
    private List<Dish> parts;
    
    /**
     * Constructor parametrizado
     * @param name nombre
     * @param description descripcion
     * @param image imagen
     * @param price precio
     * @param size tamaño
     */
    public Dish(String name, String description, String image, int price, EnumSize size) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.size = size;
        this.parts = new ArrayList<>();
    }
    
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public EnumSize getSize() {
        return size;
    }

    public void setSize(EnumSize size) {
        this.size = size;
    }

    public List<Dish> getParts() {
        return parts;
    }

    public void setParts(List<Dish> parts) {
        this.parts = parts;
    }

    public void addPart(Dish dish) {
        parts.add(dish);
    }
    
    /**
     * Funcion que calcula el precio de las partes que componen el combo
     * @return el precio total de las partes
     */
    public int calculatePriceParts() {
        int total = 0;
        for (Dish dish : parts) {
            total += dish.getPrice();
        }
        return total;
    }
    
    /**
     * Imprimir la informacion del plato
     * @return una cadena de informacion
     */
    @Override
    public String toString() {
        return "Dish{" + "name=" + name + ", description=" + description + ", price=" + price + ", size=" + size + "}";
    }

}
