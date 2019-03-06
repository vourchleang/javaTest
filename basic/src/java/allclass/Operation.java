/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package allclass;

/**
 *
 * @author SDF-ITD
 */
public class Operation {
    private double a;
    private double b;
    public Operation(double a,double b){
        this.a = a;
        this.b = b;
    }
    public void SetA(double a){this.a = a;}
    public void SetB(double b){this.b = b;}
    public double GetA(){return a;}
    public double GetB(){return b;}
    public double Add(double a,double b){return a+b;}
    public double Div(){return a/b;}
    public double Sub(){return a-b;}
    public double Mul(){return a*b;}
}
