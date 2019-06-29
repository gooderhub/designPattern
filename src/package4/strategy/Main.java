package package4.strategy;

public class Main {
    public static void main(String[] args) {
        int seed1 = Integer.parseInt("888");
        int seed2 = Integer.parseInt("999");
        Player player1 = new Player("小明", new WinningStrategy(seed1));
        Player player2 = new Player("小紅", new ProbStrategy(seed2));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("胜利:" + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("失败:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("平局...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("结果:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
