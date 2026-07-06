import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SlotMachineTest {
    @Test
    void allJackpots(){
        assertEquals(100, SlotMachine.getPrize(6,6,6));
    }

    @Test
    void allMangoes(){
        assertEquals(50, SlotMachine.getPrize(5,5,5));
    }

    @Test
    void allLemons(){
        assertEquals(25, SlotMachine.getPrize(4,4,4));
    }

    @Test
    void allBells(){    
        assertEquals(15, SlotMachine.getPrize(3,3,3));
    }

    @Test 
    void allOranges(){
        assertEquals(10, SlotMachine.getPrize(2,2,2));
    }
    
    @Test 
    void allCherries(){
        assertEquals(5, SlotMachine.getPrize(1,1,1));
    }

    @Test 
    void twoCherries(){
        assertEquals(2, SlotMachine.getPrize(1,1,4));
    }
    
    @Test
    void oneCherry(){
        assertEquals(1, SlotMachine.getPrize(1,5,6));
    }

    @Test
    void noPrize(){
        assertEquals(0, SlotMachine.getPrize(2,3,4));
    }
}
