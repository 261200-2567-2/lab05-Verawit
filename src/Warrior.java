import java.util.ArrayList;
import java.util.List;

public class Warrior implements ICharacter {
    private String name;
    private int hp;
    private int mp;
    private int strength;
    private int defense;
    private List<IAccessory> equippedAccessories;

    public Warrior(String name, int hp, int mp, int strength, int defense) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.strength = strength;
        this.defense = defense;
        this.equippedAccessories = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public int getMP() {
        return mp;
    }

    @Override
    public String getJob() {
        return "Warrior";
    }

    @Override
    public List<IAccessory> getEquippedAccessories() {
        return equippedAccessories;
    }

    @Override
    public void equipAccessory(IAccessory accessory) {
        equippedAccessories.add(accessory);
        accessory.applyEffect(this);
    }

    @Override
    public void removeAccessory(IAccessory accessory) {
        equippedAccessories.remove(accessory);
        accessory.removeEffect(this);
    }

    @Override
    public void useAbility(String abilityName) {
        System.out.println(name + " uses " + abilityName + "!");
    }

    @Override
    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Job: " + getJob());
        System.out.println("HP: " + hp);
        System.out.println("MP: " + mp);
        System.out.println("Strength: " + strength);
        System.out.println("Defense: " + defense);
    }

    // Accessor methods for stats modification
    public void modifyStrength(int value) {
        strength += value;
    }

    public void modifyDefense(int value) {
        defense += value;
    }
}