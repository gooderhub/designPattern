package package7.mediator;

public interface Colleague {
    //设置中介
    public abstract void setMediator(Mediator mediator);
    //设置自己的状态是(可用/不可用)
    public abstract void setColleagueEnabled(boolean enabled);
}
