import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test1 {


    @Test
    public void test() {
        String[] array = {"1","2","3","4"};
        removeArray(array,"3");
        for (String s : array) {
            System.out.println(s);
        }
    }

    private <T>T[] removeArray(T[] array, T t){
        List<T> list = new ArrayList<T>(Arrays.asList(array));
        list.removeIf(itt -> itt.equals(t));
        array = (T[]) list.toArray();
        return array;
    }
}
