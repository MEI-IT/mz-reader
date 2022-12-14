package com.mz.reader.utils;

import java.util.Scanner;

public class EquationSolving {
        //求b^2-4ac的结果
        private double getValue(double a, double b, double c) {
            return b*b - 4*a*c;
        }

        //求解
        public String EqualRoots(double a, double b, double c) {
            double x1;
            double x2;
            Double delta = getValue(a,b,c);
            x1 = ((-b + Math.sqrt(getValue(a,b,c))) / (2*a));
            x2 = ((-b - Math.sqrt(getValue(a,b,c))) / (2*a));
            if (delta == 0.00) {
                String result = "此方程有两个相同的解：x=" + x1;
                return result;
            }else if (delta > 0.00){
                String result = "此方程有两个的解：x1=" + x1 + ";x2=" + x2;
                return result;
            }else {
                return "此方程无解";
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入参数a：");
        double a = sc.nextDouble();
        System.out.print("请输入参数b：");
        double b = sc.nextDouble();
        System.out.print("请输入参数c：");
        double c = sc.nextDouble();
        EquationSolving er = new EquationSolving();
        String result = er.EqualRoots(a, b, c);
        System.out.println(result);

    }
}
