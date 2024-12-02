public class Lab05 {
    public static void main(String[] args) {
        // Create characters
        Warrior warrior = new Warrior("Arthur", 50, 50, 20, 15);
        Mage mage = new Mage("Merlin", 80, 100, 30, 10);

        // Create accessories
        Gauntlet gauntlet = new Gauntlet("Titan's Gauntlet", 10);
        MagicRing magicRing = new MagicRing("Ring of Wisdom", 15, 5);

        // Equip accessories
        warrior.equipAccessory(gauntlet);
        mage.equipAccessory(magicRing);

        // Display stats
        System.out.println("Character Stats After Equipping Accessories:");
        warrior.displayStats();
        System.out.println();
        mage.displayStats();
    }
}