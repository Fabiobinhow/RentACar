/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;


/**
 *
 * @author fabio
 */
        
       
public class BookingSystem implements BookingSystemInterface {
   
    
    @Override
    
    /*
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        
        String car = in.readLine();
        String rate = "";
        
        RentACarInterface car = new Car();
        
        while(car != null){
            //System.out.println(title);
           rate = in.readLine();
            //System.out.println(content);
            
           make item = new Make(car, rate);
            Car.addItem(item);
            
            car = in.readLine();
        }

        
        return make;
    }
   
    
    
}
*/ 

public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
       
                String name = in.readLine();
                String content = "";
        
        RentACarInterface Car  = (RentACarInterface) new Car();
        
        while(name != null){
            //System.out.println(title);
            content = in.readLine();
            //System.out.println(content);
            
            RentACarInterface rent = new RentACarInterface (name, content) {};
            Car.addItem(rent);
            
            name = in.readLine();
        }
        return Car;
    }
}