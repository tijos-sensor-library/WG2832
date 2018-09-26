package tijos.framework.transducer.oled;

import java.io.IOException;

import tijos.framework.devicecenter.TiI2CMaster;
import tijos.framework.util.Delay;

/**
 * WG2832 Sample
 *
 */
public class TiOLED_WG2832Sample
{
	
    public static void main( String[] args )
    {
		try {
			/*
			 * TiI2CMaster port 0
			 */
			int i2cPort0 = 0;

			/*
			 * Open the I2C port 
			 */
			TiI2CMaster i2c0 = TiI2CMaster.open(i2cPort0);
			
			TiOLED_WG2832 wg2832 = new TiOLED_WG2832(i2c0, 0x3c);
			
			wg2832.turnOn();
			wg2832.clear();
			wg2832.print(0, 0, "abcdefghijklmnop");
			wg2832.print(1, 0, "ABCDEFGHIJKLMNOP");
			
			while(true) {
				Delay.msDelay(1000);
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}			
    }
}
