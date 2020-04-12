package com.vladis1350;

import com.vladis1350.bean.Product;
import com.vladis1350.services.ProductService;
import com.vladis1350.validate.ProductValidator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class FinalProjectJavaOneApplicationTests {

	@Autowired
	private ProductService service;

	@Test
	void testValidateNameShouldReturnTrue() {
		boolean actualTrue = ProductValidator.validateName("ugii");
		boolean actualFalse = ProductValidator.validateName("ug");
		boolean actualFalseTwo = ProductValidator.validateName("");

		Assert.assertEquals(true, actualTrue);
		Assert.assertEquals(false, actualFalse);
		Assert.assertEquals(false, actualFalseTwo);

	}

	@Test
	void testValidatePriceShouldReturnFalse() {
		boolean actualFalseOne = ProductValidator.validatePrice(new BigDecimal(0));
		boolean actualFalseTwo = ProductValidator.validatePrice(new BigDecimal(-26));
		boolean actualTrueThree = ProductValidator.validatePrice(new BigDecimal(13.2));

		Assert.assertEquals(false, actualFalseOne);
		Assert.assertEquals(false, actualFalseTwo);
		Assert.assertNotEquals(false, actualTrueThree);
	}

	@Test
	void testValidateDiscountShouldReturnFalse(){
		boolean actualTrueOne = ProductValidator.validateDiscount(new BigDecimal(0));
		boolean actualFalseTwo = ProductValidator.validateDiscount(new BigDecimal(-26));
		boolean actualTrueThree = ProductValidator.validateDiscount(new BigDecimal(13.2));

		Assert.assertEquals(true, actualTrueOne);
		Assert.assertEquals(false, actualFalseTwo);
		Assert.assertNotEquals(false, actualTrueThree);
	}

	@Test
	void testShouldReturnProductById() throws Exception {
		Product productActual = new Product(2l,"Nokia", new BigDecimal("630.00"), "Technical goods", new BigDecimal("10.00"));
		Product expectedProduct = service.getById(2l);
		Assert.assertEquals(expectedProduct, productActual);
	}

	@Test
	void testShouldReturnProductByCategory() throws Exception {
		int expected = 1;
		int actual = service.findAllByCategory("Fruit").size();
		Assert.assertEquals(expected, actual);
	}

}
