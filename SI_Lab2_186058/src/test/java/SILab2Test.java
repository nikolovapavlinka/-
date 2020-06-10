import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


class SILab2Test {

    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void testEveryPath() {
        IllegalArgumentException ex;


        //A,B, D, E.1, E.2, (H, G,F J, K, L, O, E.3, E.2), P, Q
        //TEST --> 00#
        assertEquals(createList("0","1","#"), SILab2.function(createList("0","0","#")));




        //A,B, D, E.1, E.2, (H, G,F, I, J, K, L, O, E.3, E.2), P, Q
//TEST --> #0#
        assertEquals(createList("#","2","#"), SILab2.function(createList("#","0","#")));


//A,B, D, E.1, E.2, P, Q
//TEST --> NE E MOZHNO




        //A,B, D , E.1, E.2, (H, G,F, I, J, L, O, E.3, E.2), P, G
//TEST --> #00
        assertEquals(createList("#","1","0"), SILab2.function(createList("#","0","0")));


//A,B, D, E.1, E.2, (F, M,N, O, E.3, E.2), P, Q
//TEST --> ##
        assertEquals(createList("#","#"), SILab2.function(createList("#","#")));


        //A,B, D , E.1, E.2, (H, G,F, J, L, O, E.3, E.2), P, Q
//TEST --> 000
        assertEquals(createList("0","0","0"), SILab2.function(createList("0","0","0")));



        //A,B, C, Q
//TEST --> "PRAZEN STRING"
        List <String> list=new ArrayList<String>();
        ex=assertThrows(IllegalArgumentException.class, () -> SILab2.function(list));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
    }
}

class SILab2Test2 {
    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void testEVeryStatement() {
        IllegalArgumentException ex;
        List <String> list=new ArrayList<String>();
        ex=assertThrows(IllegalArgumentException.class, () -> SILab2.function(list));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
    }
}
