public class Program {

    public static void main(String[] args) {

        /*  **** START IN THE ITEM CLASS ****
         - Your Shop class will show errors until you create the Item. Don't worry. Once you create your
         Item Class the errors will disappear.

        Now that you've created your Item class, it's time to create some instances of that class to populate
        your shop's inventory.
        You can always use the same items that we've been using in the other examples: Flint, Rope,
        Healing Potion, Dagger, Bedroll, Bread, Tin Whistle

        Take a close look at the Shop class and see what the Inventory is made of.

        Now that you have Item objects, make sure those are in the correct format to go into the Inventory
        of your shop.

        Now that we have an inventory for our shop, we have to make our shop! Take a look at the Shop class
        and create a new shop.

        We have items.We have an inventory.We have a shop...now we just have to make the shop run.
    */

        Weapon dagger = new Weapon("Dagger", "For short range combat", 15, 75, 10);
        Weapon frodosSword = new Weapon("Sting", "Shines blue when enemies nearby", 1, 200, 99);
        Accessory theRing = new Accessory("The One True Ring", "One ring to rule them all", 1, 0, 999);
        Consumable healingPotion = new Consumable("Healing Potion", "Heals wounds", 20, 10, 5);

        //manually testing our ItemActions methods
        dagger.discardItem();
        frodosSword.discardItem();
        frodosSword.equipItem();
        healingPotion.equipItem();
        theRing.discardItem();
        healingPotion.useItem();
        theRing.useItem();
        // commented out this code to test ItemActions methods, comment it back in
        // to see original Shop functionality
//        Item[] inventory = {dagger, frodosSword, theRing, healingPotion};
//
//        Shop prancingPony = new Shop("Prancing Pony", inventory);
//
//        prancingPony.RunShop();
    }

}
