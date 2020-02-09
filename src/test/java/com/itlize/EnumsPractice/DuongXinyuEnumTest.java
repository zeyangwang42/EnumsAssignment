package com.itlize.EnumsPractice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yang on 02/4/20.
 */
public class DuongXinyuEnumTest {
    @Test
    public void testDuongName() {
        // Given
        Duong duong = DuongxinyuEnum.Duong;
        String expected = "Duong";

        // When
        String actual = Duong.name();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testXinyuName() {
        // Given
        DuongxinyuEnum Xinyu = DuongxinyuEnum.Xinyu;
        String expected = "Xinyu";

        // When
        String actual = Xinyu.name();

        // Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testDuongCatchPhrase() {
        // Given
        DuongxinyuEnum Duong = DuongxinyuEnum.Duong;
        String expected = "Hey, my name is Duong!";

        // When
        String actual = Duong.getCatchPhrase();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testXinyuCatchPhrase() {
        // Given
        DuongxinyuEnum Xinyu = DuongxinyuEnum.Xinyu;
        String expected = "Hey, my name is Xinyu!";

        // When
        String actual = Xinyu.getCatchPhrase();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDuongIsDuong() {
        // Given
        DuongxinyuEnum Duong = DuongxinyuEnum.Duong;

        // When
        boolean outcome = Duong.isDuong();

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void testDuongIsXinyu() {
        // Given
        DuongxinyuEnum Duong = DuongxinyuEnum.Duong;

        // When
        boolean outcome = Duong.isXinyu();

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void testXinyuIsXinyu() {
        // Given
        DuongxinyuEnum Xinyu = DuongxinyuEnum.Xinyu;

        // When
        boolean outcome = Xinyu.isXinyu();

        // Then
        Assert.assertTrue(outcome);
    }

    @Test
    public void testXinyuIsDuong() {
        // Given
        DuongxinyuEnum Xinyu = DuongxinyuEnum.Xinyu;

        // When
        boolean outcome = Xinyu.isDuong();

        // Then
        Assert.assertFalse(outcome);
    }


}
