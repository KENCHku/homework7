public class Medic extends Hero{

    @Override
    public void applySuperAbility(HavingSuperAbility[] superAbilityType) {

        System.out.println("Medic применил суперспособность:" +
                "Heal CRITICAL DAMAGE ");
    }
}
