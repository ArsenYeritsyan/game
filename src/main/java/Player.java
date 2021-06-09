import java.util.HashSet;
import java.util.Objects;

public class Player implements PlayerOptions {
    private int id;
    private String name;
    private int damage;
    private Warehouse inventory;

    public Player(int id, String name, int damage) {
        this.id = id;
        this.name = name;
        this.damage = damage;
    }

    @Override
    public void addWarehouse(Warehouse warehouse) {
        for (Materials material : warehouse.getMaterials().keySet()) {
            this.inventory.addMaterial(material, warehouse.getMaterials().get(material));
            System.out.println("Material : " + material + "   quantity : " + warehouse.getMaterials().get(material));
        }
    }

    @Override
    public void removeWarehouse(Warehouse warehouse){
        inventory.getMaterials().clear();
    }

    @Override
    public void giveWarehouse(Player player) {

    }

    @Override
    public void attack(Enemy enemy) {
            int hit = damage;
            enemy.defend(hit);
        }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                ", inventory=" + inventory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return id == player.id && damage == player.damage && Objects.equals(name, player.name) && Objects.equals(inventory, player.inventory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, damage, inventory);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Warehouse getInventory() {
        return inventory;
    }

    public void setInventory(Warehouse inventory) {
        this.inventory = inventory;
    }
}
