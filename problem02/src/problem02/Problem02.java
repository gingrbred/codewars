
package problem02;

public class Problem02 {

    public static void main(String[] args) {
    int waterscenario1 = 1750;
    int waterscenario2 = 1000;
    int waterscenario3 = 4325;
    int ttlgallons = 10000;
    int week1 = ttlgallons / waterscenario1;
    int week2 = ttlgallons / waterscenario2;
    int week3 = ttlgallons / waterscenario3;
    System.out.printf("%d gallons will last %d total weeks", waterscenario1, week1);
    System.out.println();
    System.out.printf("%d gallons will last %d total weeks", waterscenario2, week2);
    System.out.println();
    System.out.printf("%d gallons will last %d total weeks", waterscenario3, week3);
    }
    
    
}
