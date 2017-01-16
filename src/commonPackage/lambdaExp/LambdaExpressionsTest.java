package commonPackage.lambdaExp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionsTest {

    public static void main(String[] args) {
        LambdaExpressionsTest lambdaExpressionsTest = new LambdaExpressionsTest();
        lambdaExpressionsTest.lambdaExpressionInUse();
    }

    public void lambdaExpressionInUse() {

        List<Integer> arrayList = Arrays.asList(21,7,3,10,5);
        arrayList.sort((Integer a, Integer b) -> {
            return b.compareTo(a);
        });
        for (Integer number : arrayList) {
            System.out.println(number);
        }
    }
}
