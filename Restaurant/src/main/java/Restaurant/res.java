package Restaurant;

public class res {
    public static void main(String[] args) {

        menuItem item1 = new menuItem("Pepperoni Pizza", "The classic slice, hot and delicious!", 7.39, "main course");
        menuItem item2 = new menuItem("Toasted Ravioli", "A St. Louis favorite, served with a size of pizza sauce", 6.89, "appetizer");
        menuItem item3 = new menuItem("Chocolate Cake", "Rich, moist cake with dark chocolate cream cheese frosting", 4.99, "dessert");
        menuItem item4 = new menuItem("Veggie Pizza", "Peppers, onions, mushrooms, olives, and tomatoes make a delicious combo", 6.39, "main course");
        menuItem item5 = new menuItem("Garlic Breadsticks", "Hot, garlicky carbs FTW", 4.59, "appetizer");


        System.out.println(item1);

        Menu menu = new Menu();


        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        //System.out.println(menu);

        menu.removeItem(item2);

        System.out.println(menu);
    };
};
