package edu.mc.cwh;

public class Temperature {
	
	// instance variables for each temperature scale
    private double degreesFahrenheit;
    private double degreesCelsius;
    private double degreesKelvin;
       
    // Constructor for objects of class Temperature
    public Temperature() {
    }
    
    /* Method initializes instance variables based on an
     * input temperature scale and an input temperature.
    */
    public void convertTemp(String scale, double temperature)
        	throws IllegalArgumentException
    {    	
        if (scale.equalsIgnoreCase("F"))
            setdegreesFahrenheit(temperature);
        else
            if (scale.equalsIgnoreCase("C"))
                setdegreesCelsius(temperature);
            else
                if (scale.equalsIgnoreCase("K"))
                    setdegreesKelvin(temperature);
                else { 
                	throw new IllegalArgumentException(scale +  
                	           		" is not a valid temperature scale.");
                	} 
    }
   
    public void setdegreesFahrenheit(double temperature) 
    			throws IllegalArgumentException 
    {
    	if (temperature < -459.67) {
    	    throw new IllegalArgumentException(temperature + " F is not a valid temperature"); 
    	}
        degreesFahrenheit = temperature;
        degreesCelsius = (degreesFahrenheit - 32) * 5 / 9;
        degreesKelvin = degreesCelsius + 273.15;
       
    }
   
    public double getdegreesFahrenheit()
    {
        return(degreesFahrenheit);
    }
   
    public void setdegreesCelsius(double temperature)
    		throws IllegalArgumentException
    {
    	if (temperature < -273.15) {
    		throw new IllegalArgumentException(temperature + " C is not a valid temperature");
    	}
        degreesCelsius = temperature;
        degreesFahrenheit = degreesCelsius * 9 / 5 + 32;
        degreesKelvin = degreesCelsius + 273.15;
    }
   
    public double getdegreesCelsius()
    {
        return(degreesCelsius);
    }
   
    public void setdegreesKelvin(double temperature)
    		throws IllegalArgumentException
    {
    	if (temperature < 0.0) {
    		throw new IllegalArgumentException(temperature + " K is not a valid temperature");
    	}
        degreesKelvin = temperature;
        degreesFahrenheit = (degreesKelvin - 273.15) * 9 / 5 + 32;
        degreesCelsius = degreesKelvin - 273.15;    
    }
   
    public double getdegreesKelvin()
    {
        return(degreesKelvin);
    }
    
    // A method to check for a valid temperature scale    
    public boolean validScale(String inputScale) {
        if ((inputScale.equalsIgnoreCase("C")) || 
            (inputScale.equalsIgnoreCase("F")) ||
            (inputScale.equalsIgnoreCase("K"))) 
                return true;
        else
                return false;
    } 
    
    // A method to check if the temperature is valid      
    public boolean validTemperature(String inputScale, double inputTemperature) {
        if ((inputTemperature >= 0.0 && inputScale.equalsIgnoreCase("K")) ||
           (inputTemperature >= -273.15 && inputScale.equalsIgnoreCase("C")) ||
           (inputTemperature >= -459.67 && inputScale.equalsIgnoreCase("F"))) 
                return true;         
        else 
                return false;
    }


}
