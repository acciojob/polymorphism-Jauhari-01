package com.driver;

public class Main {
    public static class Product{
        public void product(int x,int y){
            System.out.println("HelloWorld");
        }
        public void product(int x,int y,int z){
            System.out.println("HelloWorld2");
        }
        public void product(double x,double y){
            System.out.println("HelloWorld3");
        }
    }
   public static void main(String[] args){
        Product p = new Product();
        p.product(2,3);
        p.product(2,3,4);
        p.product(2.0,3.6);
   }
}