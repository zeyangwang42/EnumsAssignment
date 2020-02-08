package com.itlize.EnumsPractice;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yang on 02/03/20.
 */
public class DuongXinyuEvaluatorTest {
    @Test
    public void testyang() {
        // Given
        String input = "yang";
        DuongXinyuEvaluator abc = new DuongXinyuEvaluator(input);

        // When
        boolean isDuong = abc.isDuong();
        boolean isXingyu = abc.isXingyu();

        // Then
        Assert.assertFalse(isDuong);
        Assert.assertFalse(isXingyu);
    }

    @Test
    public void testWilhem() {
        // Given
        String input = "Tariq";
        DuongXinyuEvaluator abc = new DuongXinyuEvaluator(input);

        // When
        boolean isDuong = abc.isDuong();
        boolean isXingyu = abc.isXingyu();

        // Then
        Assert.assertFalse(isDuong);
        Assert.assertFalse(isXingyu);
    }

    @Test
    public void testXingyu() {
        // Given
        String input = "Xingyu";
        DuongXinyuEvaluator abc = new DuongXinyuEvaluator(input);

        // When
        boolean isDuong = abc.isDuong();
        boolean isXingyu = abc.isXingyu();

        // Then
        Assert.assertFalse(isDuong);
        Assert.assertTrue(isXingyu);
    }


    @Test
    public void testDuong() {
        // Given
        String input = "Duong";
        DuongXinyuEvaluator abc = new DuongXinyuEvaluator(input);

        // When
        boolean isDuong = abc.isDuong();
        boolean isXingyu = abc.isXingyu();

        // Then
        Assert.assertTrue(isDuong);
        Assert.assertFalse(isXingyu);
    }
}
