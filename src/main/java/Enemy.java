public class Enemy {
    private int health;

    public Enemy(int health) {
        this.health = 100;
    }
    private void defense(){
        health*=100;
    }
    public boolean alive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }
    public void defend(int hit){
        this.health-=hit;
    }
}
