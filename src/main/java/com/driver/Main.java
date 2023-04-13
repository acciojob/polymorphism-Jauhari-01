package com.driver;

public class Main {
    public static class Product{
        public int product(int x,int y){
            System.out.println("HelloWorld");
            return x+y;
        }
        public int product(int x,int y,int z){
            System.out.println("HelloWorld2");
            return x+y+z;
        }
        public double product(double x,double y){
            System.out.println("HelloWorld3");
            return x+y;
        }
    }
   public static void main(String[] args){
        Product p = new Product();
        p.product(2,3);
        p.product(2,3,4);
        p.product(2.0,3.6);
   }
}