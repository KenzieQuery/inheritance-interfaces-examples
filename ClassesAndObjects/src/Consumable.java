public class Consumable extends Item{
    private Integer durationInSec;

    public Consumable(String name, String description, Integer quantity, Integer price, Integer durationInSec) {
        super(name, description, quantity, price);
        this.durationInSec = durationInSec;
    }

    public Integer getDurationInSec() {
        return durationInSec;
    }

    // equipItem and useItem get implemented individually in each
    // child class
    @Override
    public void equipItem() {
        System.out.println("Can't equip consumables.");
    }

    @Override
    public void useItem() {
        System.out.println(this.getName() + " consumed.");
    }
}
