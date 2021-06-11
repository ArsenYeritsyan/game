import java.util.Objects;

public class Enemy {
    private int health;

    public Enemy() {
        this.health = 50;
    }

    public void increaseHealth(int increment){
        health+=++increment;
    }

    public boolean alive() {
        return health > 0;
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
