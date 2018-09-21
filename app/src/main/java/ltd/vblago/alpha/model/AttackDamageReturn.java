package ltd.vblago.alpha.model;

public class AttackDamageReturn {
    public int state; // -1, 0, 1
    public int leftHP;

    public AttackDamageReturn(int state, int leftHP) {
        this.state = state;
        this.leftHP = leftHP;
    }
}
