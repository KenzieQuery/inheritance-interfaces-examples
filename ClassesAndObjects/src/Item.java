public abstract class Item implements ItemActions{
    /*
    As you can see you have existing code to make a shop run. Take a look at that code because your job is going to be to write a class that will work with that code.

    ** this one is a little more complex than the others, but your Hints  will only have some hints as to what's going on with the already established code, not what you need to do.**

    You will need to make fields that meet the requirements that the shop outlines (Look at the getInventory method to see what it's expecting), as well as building a constructor
    to make sure those properties are adequately populated, and getters and setters to be able to change or retrieve that information.

    Take some time to think about accessibility levels for getters and setters too. (Note: making everything public won't break it, but it doesn't hurt to think about making some things private.)

    Then you'll need to make some objects inside your program class using this Item class.

*/

    private String name;
    private String description;
    private Integer quantity;
    private Integer price;

    public Item(String name, String description, Integer quantity, Integer price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public void discardItem() {
        System.out.println("Discarded " + this.getName());
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }
}
