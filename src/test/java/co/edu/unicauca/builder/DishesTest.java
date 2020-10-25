
package co.edu.unicauca.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Christian, Carlos
 */
public class DishesTest {


    /**
     * Test of setCore method, of class DishBuilder.
     */
    @Test
    public void testOrientalDish() {
        System.out.println("Oriental Dish");
        DishDirector director = new DishDirector();
        DishBuilder orientalBuilder = new OrientalDishBuilder();
        director.setDishBuilder(orientalBuilder);
        director.buildDish();
        
        Dish dish = director.getDish();
        assertEquals("Arroz oriental", dish.getName());
        assertEquals(56000, dish.getPrice());
        assertEquals(8000, dish.calculatePriceParts());
        assertEquals(2, dish.getParts().size());  
    }
    
    /**
     * Test of setCore method, of class DishBuilder.
     */
    @Test
    public void testItalianDish() {
        System.out.println("Italian Dish");
        DishDirector director = new DishDirector();
        DishBuilder italianBuilder = new ItalianDishBuilder();
        director.setDishBuilder(italianBuilder);
        director.buildDish();
        
        Dish dish = director.getDish();
        assertEquals("Pizza Napolitana", dish.getName());
        assertEquals(30000, dish.getPrice());
        assertEquals(55000, dish.calculatePriceParts());
        assertEquals(2, dish.getParts().size());  
    }
  
}
