package co.edu.unicauca.builder;

/**
 * Builder concreto
 *
 * @author Christian David Tobar Mosquera, Carlos Alberto Salamanca Quijano
 */
public class ItalianDishBuilder extends DishBuilder{

    @Override
    public void setCore() {
        this.setDish(new ItalianDish("Pizza Napolitana", "Pizza con estilo Italiano, añadiendo ingredientes con sabores mediterraneos como la albahaca, tomates frescos y oregano", "", 30000, EnumSize.ALL, "Italian Pizza"));
    }

    @Override
    public void addParts() {
        this.getDish().addPart(new Dish("Pan de ajo", "Pan cubierto con ajo y aceite de oliva", "", 5000, EnumSize.HALF));
        this.getDish().addPart(new Dish("Vino tinto", "Vino con uvas de cosecha tardia", "", 50000, EnumSize.ALL));
    }

    @Override
    public void setSize() {
        dish.setSize(EnumSize.ALL);
    }
}
