package com.misa.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	// if there is a method addAccount on a component, run this code before it.
	@Before("execution(public void addAccount())")
	public void beforeMethod() {
		System.out.println("# " + getClass());
	}
}
