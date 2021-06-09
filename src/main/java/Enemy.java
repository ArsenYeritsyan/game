import java.util.Objects;

public class Enemy {
    private int health;

    public Enemy() {
        this.health = 100;
    }
    public void defense(){
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

    @Override
    public String toString() {
        return "Enemy{" +
                "health=" + health +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Enemy)) return false;
        Enemy enemy = (Enemy) o;
        return health == enemy.health;
    }

    @Override
    public int hashCode() {
        return Objects.hash(health);
    }

    public int getHealth() {
        return health;
    }
}
