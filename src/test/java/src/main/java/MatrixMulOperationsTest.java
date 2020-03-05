package src.main.java;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import ru.guybydefault.domain.Constant;
import ru.guybydefault.domain.Expression;
import ru.guybydefault.dsl.functions.ListFunctions;
import ru.guybydefault.dsl.functions.MatrixFunctions;

import java.util.Arrays;

import static src.main.java.tools.TestRunner.evaluateAndAssert;

@RunWith(JUnit4.class)
public class MatrixMulOperationsTest {

    @org.junit.Test
    public void testMatrixMulMatrix_1() {
        evaluateAndAssert(
                new Expression(
                        MatrixFunctions.MatrixMult, Arrays.asList(
                        new Expression(ListFunctions.List,
                                new Expression(ListFunctions.List, new Constant(1), new Constant(2)),
                                new Expression(ListFunctions.List, new Constant(3), new Constant(4))
                        ),
                        new Expression(ListFunctions.List,
                                new Expression(ListFunctions.List, new Constant(4), new Constant(3)),
                                new Expression(ListFunctions.List, new Constant(2), new Constant(1))
                        ))
                ),
                new Expression(ListFunctions.List, Arrays.asList(
                        new Expression(ListFunctions.List, new Constant(8), new Constant(5)),
                        new Expression(ListFunctions.List, new Constant(20), new Constant(13))
                ))
        );
    }
}
