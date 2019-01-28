package com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.aspect;

import java.util.Date;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class BookAspect {
	
	private Logger logger = Logger.getLogger(BookAspect.class);
	
	private long startTime;
	
	private long endTime;
	
	@Pointcut("execution(* com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.dao.IBookDAO.*(..))")
	public void applyPointcutDate() {
	}
	
	@Before("applyPointcutDate()")
	public void showExecutionDate() {
		System.out.println("");
		logger.debug("");
		System.out.println("Method Is Calling On :: "+ new Date());
		logger.debug("Method Is Calling On :: "+ new Date());
		logger.debug("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.dao.IBookDAO.saveBook(..))")
	public void showStartTimeOfSaveBook(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
		logger.debug("Method Name Is :: "+methodName);
		logger.debug("Method Storing Memory Location Code Is :: "+hashCode);
		logger.debug("Method Start Time Is :: "+startTime);
		logger.debug("");
		logger.debug("");
	}
	
	@After("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.dao.IBookDAO.saveBook(..))")
	public void showEndTimeOfSaveBook(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
		logger.debug("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		logger.debug("Method End Time Is :: "+endTime);
		logger.debug("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		logger.debug("");
		logger.debug("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.dao.IBookDAO.getAllBooks(..))")
	public void showStartTimeOfGetAllBooks(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
		logger.debug("Method Name Is :: "+methodName);
		logger.debug("Method Storing Memory Location Code Is :: "+hashCode);
		logger.debug("Method Start Time Is :: "+startTime);
		logger.debug("");
		logger.debug("");
	}
	
	@After("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.dao.IBookDAO.getAllBooks(..))")
	public void showEndTimeOfGetAllBooks(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
		logger.debug("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		logger.debug("Method End Time Is :: "+endTime);
		logger.debug("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		logger.debug("");
		logger.debug("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.dao.IBookDAO.deleteBook(..))")
	public void showStartTimeOfDeleteBook(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
		logger.debug("Method Name Is :: "+methodName);
		logger.debug("Method Storing Memory Location Code Is :: "+hashCode);
		logger.debug("Method Start Time Is :: "+startTime);
		logger.debug("");
		logger.debug("");
	}
	
	@After("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.dao.IBookDAO.deleteBook(..))")
	public void showEndTimeOfDeleteBook(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
		logger.debug("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		logger.debug("Method End Time Is :: "+endTime);
		logger.debug("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		logger.debug("");
		logger.debug("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.dao.IBookDAO.getBook(..))")
	public void showStartTimeOfGetBook(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
		logger.debug("Method Name Is :: "+methodName);
		logger.debug("Method Storing Memory Location Code Is :: "+hashCode);
		logger.debug("Method Start Time Is :: "+startTime);
		logger.debug("");
		logger.debug("");
	}
	
	@After("execution(public * com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.dao.IBookDAO.getBook(..))")
	public void showEndTimeOfGetBook(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
		logger.debug("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		logger.debug("Method End Time Is :: "+endTime);
		logger.debug("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		logger.debug("");
		logger.debug("");
	}	
}
