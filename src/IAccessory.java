public interface IAccessory {
    String getName();
    void applyEffect(ICharacter character);
    void removeEffect(ICharacter character);
}