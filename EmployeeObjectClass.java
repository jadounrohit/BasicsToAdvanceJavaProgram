package java_8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class EmployeeObjectClass {
	public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(3, "Item 3"));
        items.add(new Item(1, "Item 1"));
        items.add(new Item(2, "Item 2"));

        // Ascending order
        items.sort(Comparator.comparing(Item::getId));
        System.out.println("Ascending order: " + items);

        // Descending order
        items.sort(Comparator.comparing(Item::getId).reversed());
        System.out.println("Descending order: " + items);
    }
}
class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}