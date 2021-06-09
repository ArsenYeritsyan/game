public interface PlayerOptions {
    void addWarehouse(Warehouse warehouse);
    void clearWarehouse(Warehouse warehouse);
    void giveWarehouse(Player player);
    void attack(Enemy enemy,int level);
}
