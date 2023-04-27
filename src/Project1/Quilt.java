package Project1;

 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * class                Quilt
 * File:                Quilt.java
 * Description          Provides Quilt with methods, private instances,
 *                      we handle code for extended price, for each of the 3 
 *                      quilt types. 
 *                      We also provide a tax method as well 
 *                      Finally we provide a method to add everything together
 *                      for the final price, which includes all quilts bought,
 *                      as well as the added tax.
 *
 * Environment          JDK 1.0.0_241; NetBeans IDE 17.0, MAC OS Monterey
 * Course               CS 141 ON1, Spring 2023, Edmonds
 * History              Log Updated from 4/24/2023
 * Date:                April 24, 2023
 * @author              <i>Steven Halla</i>
 * @version             1.0.0
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

public class Quilt {
    final int QUILTHIGHPRICE = 950;
    final int QUILTMEDIUMPRICE = 480;
    final int QUILTLOWPRICE = 315;
    final int QUILTHIGHMAX = 6;
    final int QUILTMEDIUMMAX = 10;
    final int QUILTLOWMAX = 3;
    final double TAX_Rate = 9.8;
    
    private byte highQuiltNumber;
    private byte mediumQuiltNumber;
    private byte lowQuiltNumber;
    
 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Method:               setHighQuiltNumber()
 * Description:          Sets the number of high-quality quilts being purchased.
 * @param                highQuiltNumber the number of high-quality quilts
 * @throws               IllegalArgumentException if high quilt quantity exceeds the maximum limit
 *  History              Log Updated from 4/25/2023
 * Date:                April 25, 2023
 * @author              <i>Steven Halla</i>
 * @version             1.0.0
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    
    public void setHighQuiltNumber(byte highQuiltNumber) {
        if (highQuiltNumber > QUILTHIGHMAX) {
            throw new IllegalArgumentException("High quilt quantity exceeds maximum limit of " + QUILTHIGHMAX);
        }
        this.highQuiltNumber = highQuiltNumber;
    }
    
 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Method:               setMediumQuiltNumber
 * Description:          Sets the number of medium-quality quilts being purchased.
 * @param                mediumQuiltNumber the number of medium-quality quilts
 * @throws              IllegalArgumentException if medium quilt quantity exceeds the maximum limit
 * History              Log Updated from 4/25/2023
 * Date:                April 25, 2023
 * @author              <i>Steven Halla</i>
 * @version             1.0.0
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    
    public void setMediumQuiltNumber(byte mediumQuiltNumber) {
        if (mediumQuiltNumber > QUILTMEDIUMMAX) {
            throw new IllegalArgumentException("Medium quilt quantity exceeds maximum limit of " + QUILTMEDIUMMAX);
        }
        this.mediumQuiltNumber = mediumQuiltNumber;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Method:               setLowQuiltNumber
 * Description:          Sets the number of low-quality quilts being purchased.
 * @param               lowQuiltNumber the number of low-quality quilts
 * @throws              IllegalArgumentException if low quilt quantity exceeds the maximum limit
 * History              Log Updated from 4/25/2023
 * Date:                April 25, 2023
 * @author              <i>Steven Halla</i>
 * @version             1.0.0
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    
    public void setLowQuiltNumber(byte lowQuiltNumber) {
        if (lowQuiltNumber > QUILTLOWMAX) {
            throw new IllegalArgumentException("Low quilt quantity exceeds maximum limit of " + QUILTLOWMAX);
        }
        this.lowQuiltNumber = lowQuiltNumber;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Method:               calculateHighExtendedPrice
 * Description:          Calculates the extended price for high-quality quilts.
 * @return              the extended price for high-quality quilts
 * @throws              IllegalArgumentException if high quilt quantity is negative
 * History              Log Updated from 4/25/2023
 * Date:                April 25, 2023
 * @author              <i>Steven Halla</i>
 * @version             1.0.0
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    
    public int calculateHighExtendedPrice() {
        if (highQuiltNumber < 0) {
            throw new IllegalArgumentException("High quilt quantity must be a positive number.");
        }
        return QUILTHIGHPRICE * highQuiltNumber;
    }
    
 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Method:               calculateMediumExtendedPrice
 * Description:          Calculates the extended price for medium-quality quilts.
 * @return              the extended price for medium-quality quilts
 * @throws              IllegalArgumentException if medium quilt quantity is negative
 * History              Log Updated from 4/25/2023
 * Date:                April 25, 2023
 * @author              <i>Steven Halla</i>
 * @version             1.0.0
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    
    public int calculateMediumExtendedPrice() {
        if (mediumQuiltNumber < 0) {
            throw new IllegalArgumentException("Medium quilt quantity must be a positive number.");
        }
        return QUILTMEDIUMPRICE * mediumQuiltNumber;
    }
    
  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Method:               calculateLowExtendedPrice
 * Description:          Calculates the extended price for low-quality quilts.
 * @return              the extended price for low-quality quilts
 * @throws              IllegalArgumentException if low quilt quantity is negative
 * History              Log Updated from 4/25/2023
 * Date:                April 25, 2023
 * @author              <i>Steven Halla</i>
 * @version             1.0.0
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    
    public int calculateLowExtendedPrice() {
        if (lowQuiltNumber < 0) {
            throw new IllegalArgumentException("Low quilt quantity must be a positive number.");
        }
        return QUILTLOWPRICE * lowQuiltNumber;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Method:               calculateSubTotal
 * Description:          Calculates the subtotal for all quilts being purchased.
 * @return              the subtotal for all quilts
 * History              Log Updated from 4/25/2023
 * Date:                April 25, 2023
 * @author              <i>Steven Halla</i>
 * @version             1.0.0
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public int calculateSubTotal() {
        int extendedHighPrice = calculateHighExtendedPrice();
        int extendedMediumPrice = calculateMediumExtendedPrice();
        int extendedLowPrice = calculateLowExtendedPrice();
        return extendedHighPrice + extendedMediumPrice + extendedLowPrice;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Method:               calculateTax
 * Description:          Calculates the tax amount based on the given subtotal.
 * @param               subTotal the subtotal for all quilts
 * @return              the tax amount
 * History              Log Updated from 4/25/2023
 * Date:                April 25, 2023
 * @author              <i>Steven Halla</i>
 * @version             1.0.0
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    
    public double calculateTax(int subTotal) {
        double taxRate = TAX_Rate / 100.0;
        return subTotal * taxRate;
    }
}

