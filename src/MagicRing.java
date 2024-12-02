public class MagicRing implements IAccessory {
    private String name;
    private int intelligenceBuff;
    private int manaRegenBuff;

    public MagicRing(String name, int intelligenceBuff, int manaRegenBuff) {
        this.name = name;
        this.intelligenceBuff = intelligenceBuff;
        this.manaRegenBuff = manaRegenBuff;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void applyEffect(ICharacter character) {
        if (character instanceof Mage) {
            ((Mage) character).modifyIntelligence(intelligenceBuff);
            ((Mage) character).modifyManaRegen(manaRegenBuff);
        }
    }

    @Override
    public void removeEffect(ICharacter character) {
        if (character instanceof Mage) {
            ((Mage) character).modifyIntelligence(-intelligenceBuff);
            ((Mage) character).modifyManaRegen(-manaRegenBuff);
        }
    }
}