package co.edu.unicauca.builder;

/**
 * Representa el Director
 *
 * @author Christian David Tobar Mosquera, Carlos Alberto Salamanca Quijano
 */
public class DishDirector {
    private DishBuilder dishBuilder;

    /**
    * Constructor que inyecta la dependencia
    * @param dishBuilder 
    */
    public void setDishBuilder(DishBuilder dishBuilder) {
        this.dishBuilder = dishBuilder;
    }
    
    public Dish getDish(){
        return dishBuilder.getDish();
    }
    
    public void buildDish(){
        dishBuilder.setCore();
        dishBuilder.addParts();
    }
  
}
