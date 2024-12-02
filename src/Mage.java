import java.util.ArrayList;
import java.util.List;

public class Mage implements ICharacter {
    private String name;
    private int hp;
    private int mp;
    private int intelligence;
    private int manaRegen;
    private List<IAccessory> equippedAccessories;

    public Mage(String name, int hp, int mp, int intelligence, int manaRegen) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.intelligence = intelligence;
        this.manaRegen = manaRegen;
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
        return "Mage";
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
        System.out.println(name + " casts " + abilityName + "!");
    }

    @Override
    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Job: " + getJob());
        System.out.println("HP: " + hp);
        System.out.println("MP: " + mp);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Mana Regen: " + manaRegen);
    }

    // Accessor methods for stats modification
    public void modifyIntelligence(int value) {
        intelligence += value;
    }

    public void modifyManaRegen(int value) {
        manaRegen += value;
    }
}