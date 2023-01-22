package DessertShop;

public class DessertItem {
    private String name;

    public DessertItem() {
        name = "";
    }

    public DessertItem(String name) {
        this.name = name;
    }

    public void setName(String name) {
        boolean dw1 = false;
        do {
            if (name.equals("")) {
                System.out.println("Please enter a valid name");
            } else {
                this.name = name;
                dw1 = true;
            }
        } while (!dw1);
    }

    public String getName() {
        return name;
    }
}
