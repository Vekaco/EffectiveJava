package org.effectivejava.examples.chapter07.item42;

import java.util.Arrays;
import java.util.List;

public class VariableArityMethod {
    //simple use of varargs:0个或多个参数

    static int sum(int... args) {
        int sum = 0;
        for (int arg : args)
            sum += arg;
        return sum;
    }

    //the WRONG way to use varargs to pass one or more arguments!
    static int min(int... args) {
        //运行时异常而非编译时代码不够美观
        if (args.length == 0)
            throw new IllegalArgumentException("Too few arguments");
        int min = args[0];//显示引用，不美观
        for (int i = 1; i < args.length; i++) {
            if (args[i] < min)
                min = args[i];
        }
        return min;
    }

    //The right way to use varargs to pass one or more arguments
    static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs)
            if (arg < min)
                min = arg;
        return min;
    }

    //DON'T USE THIS WAY => Arrays.asList(arg1,arg2...), replace as the below way.
    public static <T> List<T> gather(T... args){
        return Arrays.asList(args);
    }
}
