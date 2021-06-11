import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Arena {
    private int level;
    private int increment;
    private int score;
    private final Player player;
    private final Enemy enemy;


    public Arena(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
        this.score = 0;
        this.level=1;
    }

    public void play() throws Exception {
        System.out.println("Level :" + level);
        System.out.println("Enter the 'a' to attack");

        while (this.enemy.alive()) {
try {
            switch (click()) {
                case 'n':
                    System.out.println(" Do your best...  ");
                    break;
                case 'a':
                    player.attack(enemy,level);
                    score+=player.getDamage();
                    if (!enemy.alive()){
                        System.out.println("YOU WIN !!!");
                    }
                    break;
                default: if (increment>20) levelUp();
            }
        } catch (Exception e){
                throw new MainException(e.getMessage());}
        }
    }

    private static char click() {
        Scanner reader = new Scanner(System.in);
        char c = 'n';
        try {
            c = reader.next().charAt(0);
        } catch (NoSuchElementException e){
            System.out.println("Lav eli... " + e);
        } catch (Exception e){
            System.out.println("Lava eli... " + e);
        }
        return c;
    }

    public void printScore(){
        try {
            Thread.sleep(10);
            System.out.println("Score : " + formatForLocale(score));
            System.out.println("Enemy health :" + formatForLocale(enemy.getHealth()));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void levelUp() {
                try {
                    Thread.sleep(5);
                    enemy.increaseHealth(increment++);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    }
    private String formatForLocale(int number) {
        NumberFormat nf = NumberFormat.getCompactNumberInstance(Locale.US,NumberFormat.Style.SHORT);
        nf.setRoundingMode(RoundingMode.HALF_DOWN);
        String format = nf.format(number);
        System.out.println(format);
        return format;
    }
}
