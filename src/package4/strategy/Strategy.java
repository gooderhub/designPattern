package package4.strategy;

public interface Strategy {
    //获取下一局要出的手势
    public abstract Hand nextHand();
    //如果win为true，表示上一局赢了，否则表示上一局输了
    public abstract void study(boolean win);
}
