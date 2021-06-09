import org.w3c.dom.ls.LSOutput;

public class Game {
    public static void main(String[] args) {

        System.out.println("Starting....");

        Material iron = new Material("Iron", "F45454", "IronIcon", 80);
        Material copper = new Material("Copper", "R65654", "CooperIcon", 90);
        Material bolt = new Material("Bolt", "H5465456", "BoltIcon", 100);

        Warehouse inventory1 = new Warehouse();
        inventory1.addMaterial(iron,13);
        inventory1.addMaterial(iron,12);
        inventory1.addMaterial(copper,60);
        inventory1.addMaterial(bolt,73);

        Warehouse inventory2 = new Warehouse();
        inventory2.addMaterial(iron,11);
        inventory2.addMaterial(iron,68);
        inventory2.addMaterial(copper,19);
        inventory2.addMaterial(bolt,28);

        Player player1 =new Player(1,"player1",50);
        player1.addWarehouse(inventory1);
        Player player2 =new Player(2,"player2",50);
        player2.addWarehouse(inventory1);

        player1.giveWarehouse(player2);
        player2.getInventory().getMaterials().keySet().forEach(el-> System.out.println(el + " --> " + player2.getInventory().getMaterials().get(el)));


    Enemy enemy = new Enemy();
    Arena arena = new Arena(player2, enemy);
            arena.getLevel();
            arena.play();
    }
}
