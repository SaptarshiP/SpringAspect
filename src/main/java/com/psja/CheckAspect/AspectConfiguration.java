package com.psja.CheckAspect;

import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Component
public class AspectConfiguration {

	@Before(value = "execution(* com.psja.CheckAspect.*.*.*(..))", argNames = "joinPoint")
	public void testAspect(JoinPoint joinPoint) {
		System.out.println("Inserting into "+joinPoint.getSignature().toShortString());
	}
	
	@AfterReturning(value="execution(* com.psja.CheckAspect.*.*.*(..))", argNames = "joinPoint")
	public void testAfterAspect(JoinPoint joinPoint) {
		System.out.println("Exiting from "+joinPoint.getSignature().toShortString());
	}
}
