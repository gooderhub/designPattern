package package7.mediator;


public interface Mediator {
    //生成组员方法
    public abstract void createColleagues();
    //组员状态改变后向中介报告
    public abstract void colleagueChanged();
}
