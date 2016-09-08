package in.inspirise.rave.aspects;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Aspect
@Controller
public class PerformanceLoggingAspect {
	final static Logger logger = Logger.getLogger(PerformanceLoggingAspect.class);
	/*@Around("@annotation(in.inspirise.rave.customannotations.Loggable)")
	public Object allServiceMethodsAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		long start = System.currentTimeMillis();
		logger.info("******** Invoked method :" + joinPoint.getSignature().getName() + "execution begin ********");
		logger.info("******** Arguments Passed :" + Arrays.toString(joinPoint.getArgs())+"********");
		Object output=joinPoint.proceed();
		logger.info("******** Execution Time Taken ( "+joinPoint.getSignature().getName()+" ):  " + (System.currentTimeMillis() - start)+ " miliseconds********");
		logger.info("******** Invoked method :" + joinPoint.getSignature().getName() + " execution succesfully ends ********");
		return output;
	}*/
/*
	@AfterThrowing(pointcut = "@annotation(in.inspirise.rave.customannotations.Loggable)", throwing= "error")  
	public void myadvice(JoinPoint jp,Throwable error) 
	{  
		logger.warn("############# Exception logged by method "+jp.getSignature()+ " #############");
		logger.warn("Exception : "+ error.getMessage());
		logger.warn("#####################################################################");
	}  
*/
	
	@AfterThrowing(pointcut = "@annotation(in.inspirise.rave.customannotations.Loggable)", throwing= "error")  
	public void myadvice(JoinPoint jp,Throwable error) 
	{  
		logger.warn("############# Exception logged by method "+jp.getSignature()+ " #############");
		logger.warn("Exception : "+ error.getMessage());
		logger.warn("#####################################################################");
	}  

}
