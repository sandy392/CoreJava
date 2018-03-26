package com.finalize;
public class B {
 /**
 * Finalize() method in java
 * @author www.instanceofjava.com
 */
  @Override
  protected void finalize() throws Throwable {
            try{
                System.out.println("Inside Finalize() method of Sub Class : B");
            }catch(Throwable t){
                throw t;
            }finally{
                System.out.println("Calling finalize() method of Super Class:  Object");
                super.finalize();
            }
         
 }
 
public static void main(String[] args) throws Throwable{
        B obj= new B();
        String str=new String("finalize method in java");
        str=null;
        obj.finalize();
        
        }
}