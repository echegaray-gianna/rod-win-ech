/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.cropControl;

import byui.cit260.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hernan rodriguez
 */
public class CropControlTest {
    
    public CropControlTest() {
    }


    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLand() {
        System.out.println("sellLand");
        int landPrice = 15;
        int acresToSell = 10;
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(1000);
        theCrops.setAcresOwned(2800);
        int expResult = 2790;
        int result = CropControl.sellLand(landPrice, acresToSell, theCrops);
        assertEquals(expResult, result);
    }

    /**
     * Test of buyLand method, of class CropControl.
     * Test 1
     */
    @Test
    public void testBuyLand1() {
        System.out.println("buyLand - test 1");
        
        int acresToBuy = 50;
        int pricePerAcre = 20;
        CropData cropData = new CropData();
        cropData.setWheatInStore(2000);
        cropData.setPopulation(6);
        cropData.setAcresOwned(10);
        
        int expResult = 60;
        int result = CropControl.buyLand(acresToBuy, pricePerAcre, cropData);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of buyLand method, of class CropControl.
     * Test 2
     */
    @Test
    public void testBuyLand2() {
        System.out.println("buyLand  - test 2");
        
        int acresToBuy = -50;
        int pricePerAcre = 20;
        CropData cropData = new CropData();
        cropData.setWheatInStore(2000);
        cropData.setPopulation(6);
        cropData.setAcresOwned(10);
        
        int expResult = -1;
        int result = CropControl.buyLand(acresToBuy, pricePerAcre, cropData);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of buyLand method, of class CropControl.
     * Test 3
     */
    @Test
    public void testBuyLand3() {
        System.out.println("buyLand  - test 3");
        
        int acresToBuy = 50;
        int pricePerAcre = 20;
        CropData cropData = new CropData();
        cropData.setWheatInStore(10);
        cropData.setPopulation(6);
        cropData.setAcresOwned(10);
        
        int expResult = -1;
        int result = CropControl.buyLand(acresToBuy, pricePerAcre, cropData);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of buyLand method, of class CropControl.
     * Test 4
     */
    @Test
    public void testBuyLand4() {
        System.out.println("buyLand  - test 4");
        
        int acresToBuy = 50;
        int pricePerAcre = 20;
        CropData cropData = new CropData();
        cropData.setWheatInStore(2000);
        cropData.setPopulation(1);
        cropData.setAcresOwned(10);
        
        int expResult = -1;
        int result = CropControl.buyLand(acresToBuy, pricePerAcre, cropData);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of buyLand method, of class CropControl.
     * Test 5
     */
    @Test
    public void testBuyLand5() {
        System.out.println("buyLand  - test 5");
        
        int acresToBuy = 50;
        int pricePerAcre = 20;
        CropData cropData = new CropData();
        cropData.setWheatInStore(1000);
        cropData.setPopulation(6);
        cropData.setAcresOwned(10);
        
        int expResult = 60;
        int result = CropControl.buyLand(acresToBuy, pricePerAcre, cropData);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of buyLand method, of class CropControl.
     * Test 6
     */
    @Test
    public void testBuyLand6() {
        System.out.println("buyLand  - test 6");
        
        int acresToBuy = 0;
        int pricePerAcre = 20;
        CropData cropData = new CropData();
        cropData.setWheatInStore(1000);
        cropData.setPopulation(6);
        cropData.setAcresOwned(10);
        
        int expResult = 10;
        int result = CropControl.buyLand(acresToBuy, pricePerAcre, cropData);
        assertEquals(expResult, result);
    }
    
}
