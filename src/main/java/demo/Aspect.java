package demo;

import org.aspectj.lang.annotation.Before;

@org.aspectj.lang.annotation.Aspect
@org.springframework.stereotype.Component
public class Aspect {
    @Before("within(demo.Service)")
    public void someAdvice() {
        System.out.println("advice");
    }
}
