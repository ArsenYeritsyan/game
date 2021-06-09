import java.util.HashMap;

public class Warehouse {
    private HashMap<Material,Integer> inventory;

    public Warehouse() {
        this.inventory = new HashMap<>();
    }

    public void addMaterial (Material material , int quantity) {
        if (!inventory.containsKey(material)) {
            inventory.put(material, quantity);
        } else if (inventory.containsKey(material)) {
            if (material.getMaxCapacity() > inventory.get(material) + quantity) {
                inventory.put(material, inventory.get(material) + quantity);
            } else {
                inventory.put(material, material.getMaxCapacity());
            }
        }
    }
    public void deleteMaterials(Material material) {
        inventory.remove(material);
    }

    public HashMap<Material, Integer> getMaterials() {
        return inventory;
    }

    public void setMaterials(HashMap<Material, Integer> materials) {
        this.inventory = materials;
    }
}
