public class Gauntlet implements IAccessory {
    private String name;
    private int strengthBuff;

    public Gauntlet(String name, int strengthBuff) {
        this.name = name;
        this.strengthBuff = strengthBuff;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void applyEffect(ICharacter character) {
        if (character instanceof Warrior) {
            ((Warrior) character).modifyStrength(strengthBuff);
        }
    }

    @Override
    public void removeEffect(ICharacter character) {
        if (character instanceof Warrior) {
            ((Warrior) character).modifyStrength(-strengthBuff);
        }
    }
}