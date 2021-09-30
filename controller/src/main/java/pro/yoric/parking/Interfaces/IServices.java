package pro.yoric.parking.Interfaces;

public interface IServices
{
    int getStatus();

    void openBarrier();

    default String getTime()
    {
        return null;
    }

    default int getPay()
    {
        return 0;
    }

    default boolean isBusy()
    {
        return false;
    }
}
