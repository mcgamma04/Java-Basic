package tutoriaontest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmetricTest {
    Arithmetric mth =  new Arithmetric();
    @Test
    void twoPlusTwoeshouldEqualFour(){

        assertEquals(4,mth.add(2,2));
    }
    @Test
    void tenPlusthirtyFiveShouldbeFortyFive(){
        assertEquals(45,mth.add(10,35));
    }

    @Test
    void nameMustBeJediContatenateWithExcelma(){
        assertEquals("Hello Jedi!",mth.getName("Jedi"));
    }
    @Test
    void congratMessageExpected(){
        assertEquals("Congratulation you are progress",mth.userAge(12));
    }
}