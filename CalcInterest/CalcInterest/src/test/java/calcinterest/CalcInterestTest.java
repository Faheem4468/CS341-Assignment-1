package calcinterest;


import calcinterest.CalcInterest;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcInterestTest {

    @Test
    public void testCase_1() {
        float result = CalcInterest.computeLoanInterest(-1, 2, 1); // Home Loan
        assertEquals(-1, result, 0.01f);
    }
    
    @Test
    public void testCase_2() {
        float result = CalcInterest.computeLoanInterest(0, 1, 1); // Home Loan
        assertEquals(-1, result, 0.01f);
    }

    @Test
    public void testCase_3() {
        float result = CalcInterest.computeLoanInterest(1, 2, 1); // Home Loan
        assertEquals(0.16f, result, 0.01f);
    }
    
    @Test
    public void testCase_4() {
        float result = CalcInterest.computeLoanInterest(99999, 4, 1); // Home Loan
        assertEquals(31999.68f, result, 0.01f);
    }

    @Test
    public void testCase_5() {
        float result = CalcInterest.computeLoanInterest(100000, 5, 1); // Home Loan
        assertEquals(32500.00f, result, 0.01f);
    }
    
    @Test
    public void testCase_6() {
        float result = CalcInterest.computeLoanInterest(100001, 2, 1); // Home Loan
        assertEquals(13000.13f, result, 0.01f);
    }

    @Test
    public void testCase_7() {
        float result = CalcInterest.computeLoanInterest(57000, 4, 1); // Home Loan
        assertEquals(18240f, result, 0.01f);
    }

    @Test
    public void testCase_8() {
        float result = CalcInterest.computeLoanInterest(120000, 9, 1); // Home Loan
        assertEquals(70200f, result, 0.01f);
    }

    @Test
    public void testCase_9() {
        float result = CalcInterest.computeLoanInterest(-1, 7, 1); // Home Loan
        assertEquals(-1, result, 0.01f);
    }

    @Test
    public void testCase_10() {
        float result = CalcInterest.computeLoanInterest(0, 8, 1); // Home Loan
        assertEquals(-1, result, 0.01f);
    }

    @Test
    public void testCase_11() {
        float result = CalcInterest.computeLoanInterest(1, 6, 1); // Home Loan
        assertEquals(0.39f, result, 0.01f);
    }

    @Test
    public void testCase_12() {
        float result = CalcInterest.computeLoanInterest(99999, 10, 1); // Home Loan
        assertEquals(64999.35f, result, 0.01f);
    }

    @Test
    public void testCase_13() {
        float result = CalcInterest.computeLoanInterest(100000, 9, 1); // Home Loan
        assertEquals(58500f, result, 0.01f);
    }

    @Test
    public void testCase_14() {
        float result = CalcInterest.computeLoanInterest(100001, 9, 1); // Home Loan
        assertEquals(58500.59f, result, 0.01f);
    }

    @Test
    public void testCase_15() {
        float result = CalcInterest.computeLoanInterest(45000, 7, 1); // Home Loan
        assertEquals(20475f, result, 0.01f);
    }

    @Test
    public void testCase_16() {
        float result = CalcInterest.computeLoanInterest(160000, 15, 1); // Home Loan
        assertEquals(132000f, result, 0.01f);
    }
    
    @Test
    public void testCase_21() {
        float result = CalcInterest.computeLoanInterest(100000, 15, 1); // Home Loan
        assertEquals(82500f, result, 0.01f);
    }

    @Test
    public void testCase_22() {
        float result = CalcInterest.computeLoanInterest(100001, 14, 1); // Home Loan
        assertEquals(77000.77f, result, 0.01f);
    }

    @Test
    public void testCase_23() {
        float result = CalcInterest.computeLoanInterest(85000, 14, 1); // Home Loan
        assertEquals(65450f, result, 0.01f);
    }

    @Test
    public void testCase_24() {
        float result = CalcInterest.computeLoanInterest(136000, 4, 1); // Home Loan
        assertEquals(35360f, result, 0.01f);
    }

    @Test
    public void testCase_25() {
        float result = CalcInterest.computeLoanInterest(99999, 8, 1); // Home Loan
        assertEquals(51999.48f, result, 0.01f);
    }

    @Test
    public void testCase_26() {
        float result = CalcInterest.computeLoanInterest(100000, 4, 1); // Home Loan
        assertEquals(26000f, result, 0.01f);
    }

    @Test
    public void testCase_27() {
        float result = CalcInterest.computeLoanInterest(100001, 7, 1); // Home Loan
        assertEquals(45500.46f, result, 0.01f);
    }

    @Test
    public void testCase_28() {
        float result = CalcInterest.computeLoanInterest(499999, 10, 1); // Home Loan
        assertEquals(324999.35f, result, 0.01f);
    }

    @Test
    public void testCase_29() {
        float result = CalcInterest.computeLoanInterest(500000, 9, 1); // Home Loan
        assertEquals(-1, result, 0.01f);
    }

    @Test
    public void testCase_30() {
        float result = CalcInterest.computeLoanInterest(500001, 8, 1); // Home Loan
        assertEquals(-1, result, 0.01f);
    }

    @Test
    public void testCase_31() {
        float result = CalcInterest.computeLoanInterest(300000, 9, 1); // Home Loan
        assertEquals(175500f, result, 0.01f);
    }

    @Test
    public void testCase_32() {
        float result = CalcInterest.computeLoanInterest(45000, 12, 1); // Home Loan
        assertEquals(29700f, result, 0.01f);
    }

    @Test
    public void testCase_33() {
        float result = CalcInterest.computeLoanInterest(499999, 11, 1); // Home Loan
        assertEquals(302499.41f, result, 0.01f);
    }

    @Test
    public void testCase_34() {
        float result = CalcInterest.computeLoanInterest(500000, 13, 1); // Home Loan
        assertEquals(357500f, result, 0.01f);
    }

    @Test
    public void testCase_35() {
        float result = CalcInterest.computeLoanInterest(500001, 16, 1); // Home Loan
        assertEquals(440000.88f, result, 0.01f);
    }

    @Test
    public void testCase_36() {
        float result = CalcInterest.computeLoanInterest(750000, 21, 1); // Home Loan
        assertEquals(866250f, result, 0.01f);
    }

    @Test
    public void testCase_37() {
        float result = CalcInterest.computeLoanInterest(600000, 19, 1); // Home Loan
        assertEquals(627000f, result, 0.01f);
    }

    @Test
    public void testCase_38() {
        float result = CalcInterest.computeLoanInterest(150000, 9, 1); // Home Loan
        assertEquals(87750f, result, 0.01f);
    }
    
     @Test
    public void testCase_39() {
        float result = CalcInterest.computeLoanInterest(-1, 2, 2); // Property Loan
        assertEquals(-1, result, 0.01f);
    }

    @Test
    public void testCase_40() {
        float result = CalcInterest.computeLoanInterest(0, 4, 2); // Property Loan
        assertEquals(-1, result, 0.01f);
    }

    @Test
    public void testCase_41() {
        float result = CalcInterest.computeLoanInterest(1, 2, 2); // Property Loan
        assertEquals(0.24f, result, 0.01f);
    }

    @Test
    public void testCase_42() {
        float result = CalcInterest.computeLoanInterest(99999, 5, 2); // Property Loan
        assertEquals(59999.4f, result, 0.01f);
    }

    @Test
    public void testCase_43() {
        float result = CalcInterest.computeLoanInterest(100000, 3, 2); // Property Loan
        assertEquals(25500f, result, 0.01f);
    }

    @Test
    public void testCase_44() {
        float result = CalcInterest.computeLoanInterest(100001, 5, 2); // Property Loan
        assertEquals(42500.425f, result, 0.01f);
    }

    @Test
    public void testCase_45() {
        float result = CalcInterest.computeLoanInterest(80000, 4, 2); // Property Loan
        assertEquals(38400f, result, 0.01f);
    }

    @Test
    public void testCase_46() {
        float result = CalcInterest.computeLoanInterest(130000, 7, 2); // Property Loan
        assertEquals(77350f, result, 0.01f);
    }

    @Test
    public void testCase_47() {
        float result = CalcInterest.computeLoanInterest(-1, 7, 2); // Property Loan
        assertEquals(-1, result, 0.01f);
    }

    @Test
    public void testCase_48() {
        float result = CalcInterest.computeLoanInterest(0, 6, 2); // Property Loan
        assertEquals(-1, result, 0.01f);
    }

    @Test
    public void testCase_49() {
        float result = CalcInterest.computeLoanInterest(1, 9, 2); // Property Loan
        assertEquals(0.76f, result, 0.01f);
    }

    @Test
    public void testCase_50() {
        float result = CalcInterest.computeLoanInterest(99999, 10, 2); // Property Loan
        assertEquals(84999.15f, result, 0.01f);
    }

    @Test
    public void testCase_51() {
        float result = CalcInterest.computeLoanInterest(100000, 8, 2); // Property Loan
        assertEquals(68000f, result, 0.01f);
    }

    @Test
    public void testCase_52() {
        float result = CalcInterest.computeLoanInterest(100001, 8, 2); // Property Loan
        assertEquals(68000.68f, result, 0.01f);
    }

    @Test
    public void testCase_53() {
        float result = CalcInterest.computeLoanInterest(40000, 10, 2); // Property Loan
        assertEquals(34000f, result, 0.01f);
    }

    @Test
    public void testCase_54() {
        float result = CalcInterest.computeLoanInterest(180000, 12, 2); // Property Loan
        assertEquals(151200f, result, 0.01f);
    }

    @Test
    public void testCase_55() {
        float result = CalcInterest.computeLoanInterest(-1, 12, 2); // Property Loan
        assertEquals(-1, result, 0.01f);
    }

    @Test
    public void testCase_56() {
        float result = CalcInterest.computeLoanInterest(0, 11, 2); // Property Loan
        assertEquals(-1, result, 0.01f);
    }

    @Test
    public void testCase_57() {
        float result = CalcInterest.computeLoanInterest(1, 11, 2); // Property Loan
        assertEquals(0.77f, result, 0.01f);
    }

    @Test
    public void testCase_58() {
        float result = CalcInterest.computeLoanInterest(99999, 14, 2); // Property Loan
        assertEquals(97999.02f, result, 0.01f);
    }

    @Test
    public void testCase_59() {
        float result = CalcInterest.computeLoanInterest(100000, 17, 2); // Property Loan
        assertEquals(119000f, result, 0.01f);
    }
    
    @Test
    public void testCase_60() {
        float result = CalcInterest.computeLoanInterest(100001, 15, 2); // Property Loan
        assertEquals(105001.05f, result, 0.01f);
    }

    @Test
    public void testCase_61() {
        float result = CalcInterest.computeLoanInterest(50000, 18, 2); // Property Loan
        assertEquals(63000f, result, 0.01f);
    }

    @Test
    public void testCase_62() {
        float result = CalcInterest.computeLoanInterest(200000, 5, 2); // Property Loan
        assertEquals(85000f, result, 0.01f);
    }

    @Test
    public void testCase_63() {
        float result = CalcInterest.computeLoanInterest(99999, 7, 2); // Property Loan
        assertEquals(59499.41f, result, 0.01f);
    }

    @Test
    public void testCase_64() {
        float result = CalcInterest.computeLoanInterest(100000, 8, 2); // Property Loan
        assertEquals(68000f, result, 0.01f);
    }

    @Test
    public void testCase_65() {
        float result = CalcInterest.computeLoanInterest(100001, 9, 2); // Property Loan
        assertEquals(76500.765f, result, 0.01f);
    }

    @Test
    public void testCase_66() {
        float result = CalcInterest.computeLoanInterest(499999, 6, 2); // Property Loan
        assertEquals(254999.48f, result, 0.01f);
    }

    @Test
    public void testCase_67() {
        float result = CalcInterest.computeLoanInterest(500000, 6, 2); // Property Loan
        assertEquals(-1, result, 0.01f);
    }

    @Test
    public void testCase_68() {
        float result = CalcInterest.computeLoanInterest(500001, 7, 2); // Property Loan
        assertEquals(-1, result, 0.01f);
    }

    @Test
    public void testCase_69() {
        float result = CalcInterest.computeLoanInterest(230000, 9, 2); // Property Loan
        assertEquals(175950, result, 0.01f);
    }

    @Test
    public void testCase_70() {
        float result = CalcInterest.computeLoanInterest(600000, 13, 2); // Property Loan
        assertEquals(546000f, result, 0.01f);
    }

    @Test
    public void testCase_71() {
        float result = CalcInterest.computeLoanInterest(499999, 12, 2); // Property Loan
        assertEquals(419999.16f, result, 0.01f);
    }

    @Test
    public void testCase_72() {
        float result = CalcInterest.computeLoanInterest(500000, 11, 2); // Property Loan
        assertEquals(385000f, result, 0.01f);
    }

    @Test
    public void testCase_73() {
        float result = CalcInterest.computeLoanInterest(500001, 15, 2); // Property Loan
        assertEquals(525001.05f, result, 0.01f);
    }

    @Test
    public void testCase_74() {
        float result = CalcInterest.computeLoanInterest(750000, 13, 2); // Property Loan
        assertEquals(682500f, result, 0.01f);
    }

    @Test
    public void testCase_75() {
        float result = CalcInterest.computeLoanInterest(600000, 17, 2); // Property Loan
        assertEquals(714000f, result, 0.01f);
    }

    @Test
    public void testCase_76() {
        float result = CalcInterest.computeLoanInterest(150000, 6, 2); // Property Loan
        assertEquals(76500f, result, 0.01f);
    }

}
