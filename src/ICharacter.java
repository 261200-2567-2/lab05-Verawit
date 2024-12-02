import java.util.List;

public interface ICharacter {
    String getName();
    int getHP();
    int getMP();
    String getJob();
    List<IAccessory> getEquippedAccessories();
    void equipAccessory(IAccessory accessory);
    void removeAccessory(IAccessory accessory);
    void useAbility(String abilityName);
    void displayStats();
}