package com.kode12.aop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SetterMonitor {

	private Logger logger = Logger.getLogger(getClass().getName());

	@Before("execution(void com.kode12.vo.*.set*(*))")
	public void callSetters(JoinPoint joinPoint) {
		logger.info("Setter Called");
		logger.info("Method Invoked: " + joinPoint.getSignature().getName());
		logger.info("Value Passed: " + joinPoint.getArgs()[0]);
	}
}
