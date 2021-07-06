public class Weapon extends Item {
    private Integer attackPower;

    public Weapon(String name, String description, Integer quantity, Integer price, Integer attackPower) {
        super(name, description, quantity, price);
        this.attackPower = attackPower;
    }

    public Integer getAttackPower() {
        return attackPower;
    }

    // equipItem and useItem get implemented individually in each
    // child class
    @Override
    public void equipItem() {
        System.out.println(this.getName() + " equipped");
    }

    @Override
    public void useItem() {
        System.out.println("Attack with " + this.getName());
    }


}
