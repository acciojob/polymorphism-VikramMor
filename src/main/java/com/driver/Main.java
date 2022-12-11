package com.driver;

public class Main {

    static class Product{
        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }

    }
    public static void main(String[] args){

        Product p = new Product();
        int resP = p.product(1,2);
        int resP1 = p.product(3,1,2);
        double resP2 = p.product(1.0,2.0);
        System.out.println(resP + " " +resP1 + " "+resP2);
    }
}

