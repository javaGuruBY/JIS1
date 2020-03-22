package com.company.service;

import com.company.exception.ProductException;

import java.math.BigDecimal;

public class ProductService{
    public boolean validateDiscount(BigDecimal number) {
        try {
            if ((number.compareTo(new BigDecimal(0)) == -1) || (number.compareTo(new BigDecimal(1)) == 1))
                throw new ProductException("Discount should be form 0 to 1");
            if(number.compareTo(new BigDecimal(-1)) == 0) return true;
            else return true;
        } catch (ProductException ex) {
            System.out.println(ex.getMessage());
            return false;
            }
    }

    public boolean validatePrice(BigDecimal number) {
            try {
                if (number.signum() == -1) {
                    throw new ProductException("The min price is 0");
                }
                if (number.signum() == 0) return false;
                else return true;
            } catch (ProductException e) {
                System.out.println(e.getMessage());
                return false;
            }

       }


    public boolean validateId(Long number){
        try{
            if(number < -1)
                throw new ProductException("The min id is 0");
            if(number == -1) return false;
            else return true;
        }catch (ProductException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
