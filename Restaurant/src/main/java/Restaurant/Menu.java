package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
  
       private ArrayList<menuItem> menuItems = new ArrayList<>();
       private Date lastUpdated;

    public ArrayList<menuItem> getItem() {
        return menuItems;
    }

    void addItem(menuItem item) {
        menuItems.add(item);
        lastUpdated = new Date();

}
    void removeItem(menuItem item) {
        menuItems.remove(item);
        lastUpdated = new Date();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                '}';
    }
}
