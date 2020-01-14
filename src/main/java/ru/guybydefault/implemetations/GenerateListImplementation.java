package ru.guybydefault.implemetations;

import ru.guybydefault.cast.AsConstantVisitor;
import ru.guybydefault.domain.Constant;
import ru.guybydefault.domain.Expression;
import ru.guybydefault.domain.StringSymbol;
import ru.guybydefault.domain.Symbol;
import ru.guybydefault.dsl.functions.ListFunctions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenerateListImplementation extends AbstractFunctionImplementation  {
    private static final StringSymbol[] names = new StringSymbol[] {ListFunctions.GenerateList};

    public GenerateListImplementation(){
        super(names);
    }

    @Override
    protected Symbol evaluate(Expression expression) {
        Constant count = (Constant) expression.getArguments().get(0).visit(new AsConstantVisitor());

        return new Expression(ListFunctions.List,
                IntStream.rangeClosed(0, (int)count.getValue())
                .boxed().collect(Collectors.toList())
                .stream().map(x -> new Constant(x))
                .collect(Collectors.toList()));
    }
}
