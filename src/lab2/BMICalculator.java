/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author ltr103
 */
public class BMICalculator {
    
    int feet; 
    int inches;
    int pounds;
    
    
    public BMICalculator(int feet, int inches, int pounds){
        this.feet = feet; 
        this.inches = inches; 
        this.pounds = pounds;
    }
    
    public double calculateBMI(){
        //Here is the calculation
        
        double weight = pounds * 703;
        double height = (feet * 12) + inches; 
        double square = height * height;
        double bmi = (weight / square);
        return bmi; 
    }
}
