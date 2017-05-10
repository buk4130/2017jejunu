package View;

/**
 * Created by samsung on 2017-05-03.
 */
public abstract class ViewWork<T> {
    protected abstract void setResult(T resultSet);
    protected abstract void showResult();

    public void viewWork(T resultSet) {
        setResult(resultSet);
        showResult();
    }
}
