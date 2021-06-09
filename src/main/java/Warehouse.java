import java.util.HashMap;

public class Warehouse {
    private HashMap<Materials,Integer> inventory;

    public Warehouse() {
        this.inventory = new HashMap<>();
    }

    public void addMaterial (Materials material ,int quantity){
        if(!inventory.containsKey(material)){
            inventory.put(material, quantity);
        }
        else if (inventory.containsKey(material)){
            if (material.getMaxCapacity()> inventory.get(material))
            inventory.put(material, quantity);
        }else{inventory.put(material,material.getMaxCapacity());}
    }

    public void deleteMaterials(Materials material) {
        inventory.remove(material);
    }

    public HashMap<Materials, Integer> getMaterials() {
        return inventory;
    }

    public void setMaterials(HashMap<Materials, Integer> materials) {
        this.inventory = materials;
    }
}
