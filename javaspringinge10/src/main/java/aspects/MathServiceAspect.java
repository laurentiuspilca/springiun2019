package aspects;

import org.aspectj.lang.annotation.*;

@Aspect
public class MathServiceAspect {

    @Before("execution(* services.MathService.add(..))")
    public void before() {
        System.out.println("Method add() will be called!");
    }

    @After("execution(* services.MathService.add(..))")
    public void after() {
        System.out.println("AFTER");
    }

    @AfterReturning("execution(* services.MathService.add(..))")
    public void afterReturning() {
        System.out.println("AFTER RETURNING");
    }

    @AfterThrowing("execution(* services.MathService.add(..))")
    public void afterThrowing() {
        System.out.println("AFTER THROWING");
    }
}
