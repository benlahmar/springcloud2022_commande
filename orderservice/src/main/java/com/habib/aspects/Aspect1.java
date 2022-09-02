/**
 * 
 */
package com.habib.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

/**
 * @author moi
 *
 */
@Aspect
@Service
public class Aspect1 {

	//execution(* *.*(..))")
	@Before("execution(* *.addc(..))")
	
	public void message()
	{
		System.out.println("message .....");
	}
	
  @After("execution(* *.search(..))")
	
	public void message2()
	{
		System.out.println("fin de methode  .....");
	}
}
