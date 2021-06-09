import java.util.NoSuchElementException;
import java.util.Scanner;

public class Arena {
    private int level = 1;
    private Player player;
    private Enemy enemy;

    public Arena(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void play() {
        System.out.println("Level :" + level);
        System.out.println("Enter the 'c' to click");

        while (this.enemy.alive()) {

            switch (click()) {
                case 'n':
                    System.out.println(" try 'c'  ");;
                    break;
                case 'c':
                    getLevel();
                    player.attack(enemy,level);
                    System.out.println("Enemy health :" + enemy.getHealth());
                    break;
            }
        }
    }

    private static char click(){
        char c = 'n';
        try (Scanner reader = new Scanner(System.in)) {
            c = reader.next().charAt(0);
        } catch (NoSuchElementException e){
            System.out.println("Lav eli... " + e);
        } catch (RuntimeException e){
            System.out.println("Lava eli... " + e);
        }
        return c;
    }

    public void getLevel() {
                try {
                    Thread.sleep(10000);
                    System.out.println(level);
                    level++;
                    enemy.defense();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    }
}
