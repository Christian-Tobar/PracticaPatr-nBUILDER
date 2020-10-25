package co.edu.unicauca.builder;

/**
 * Clase abstracta que representa el builder
 *
 * @author Christian David Tobar Mosquera, Carlos Alberto Salamanca Quijano
 */
public abstract class DishBuilder {
    
    protected Dish dish;
    
    /**
     * Se debe implemtar de acuerdo a la particularidad de cada tipo de combo
     */
    public abstract void setCore();
    
    /**
     * Se debe implemtar de acuerdo a las partes que pueden componer cada tipo de combo 
     */
    public abstract void addParts();
    
    /**
     * Se debe implemetar de acuerdo a la particularidad de cada plato
     */
    public abstract void setSize();
    
    //Getters and Setters
    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
}
