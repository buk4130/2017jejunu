package 출력자모음;

/**
 * Created by samsung on 2017-05-10.
 */
public abstract class 출력자<T> {
    protected abstract void 출력값설정(T 출력값);
    protected abstract void 출력();

    public void 출력하기(T 출력값) {
        출력값설정(출력값);
        출력();
   }
}
