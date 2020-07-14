package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
@Test(dependsOnGroups= {"smoke1"})
	public void test1(){
		System.out.println("I am Inside test 1");
	}
@Test(groups= {"smoke1"})
public void test2(){
	System.out.println("I am Inside test 2");
}
@Test
public void test3(){
	System.out.println("I am Inside test 3");
}
}