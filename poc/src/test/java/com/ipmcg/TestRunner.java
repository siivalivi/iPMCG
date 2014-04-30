package com.ipmcg;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      System.out.println ( "=========JUNIT Testing MyArrayList =========");
      Result result = JUnitCore.runClasses(MyArrayListTest.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
      
      //Testing MyArray Copy
      System.out.println ( "=========JUNIT Testing MyArrayCopy =========");
      result = JUnitCore.runClasses(MyArrayCopyTest.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}  	