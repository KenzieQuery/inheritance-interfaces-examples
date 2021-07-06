public class Accessory extends Item {
    private Integer protectionLevel;

    public Accessory(String name, String description, Integer quantity, Integer price, Integer protectionLevel) {
        super(name, description, quantity, price);
        this.protectionLevel = protectionLevel;
    }

    public Integer getProtectionLevel() {
        return protectionLevel;
    }

    // equipItem and useItem get implemented individually in each
    // child class
    @Override
    public void equipItem() {
        System.out.println(this.getName() + " equipped");
    }

    @Override
    public void useItem() {
        System.out.println("You've gone invisible");
    }
}
