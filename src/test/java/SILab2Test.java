import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everyStatementTest() {
        List<String> list=createList();
        assertThrows(IllegalArgumentException.class,()->SILab2.function( list));
        String str="#,#,#,#,#,#,#,#";
        String [] parts=str.split(",");
        List<String> list1=createList(parts);
        assertThrows(IllegalArgumentException.class,()->SILab2.function( list1));
        parts= new String[]{"0", "#", "0",
                            "#", "0", "#",
                            "0", "#", "#"};
        List<String> list2=createList(parts);
        parts=new String[]{"2", "#", "2",
                           "#", "4", "#",
                           "2", "#", "#"};
        List<String> list3=createList(parts);
        assertArrayEquals(parts,SILab2.function( list2).toArray());
    }

    @Test
    void everyBranchTest() {
        List<String> list=createList();
        assertThrows(IllegalArgumentException.class,()->SILab2.function( list));
        String str="#,#,#,#,#,#,#,#";
        String [] parts=str.split(",");
        List<String> list1=createList(parts);
        assertThrows(IllegalArgumentException.class,()->SILab2.function( list1));
        parts= new String[]{"0", "#", "0", "0",
                            "#", "0", "#", "0",
                            "0", "#", "#", "0",
                            "0", "#", "#", "0"};
        List<String> list2=createList(parts);
        parts= new String[]{"2", "#", "2", "0",
                            "#", "4", "#", "1",
                            "2", "#", "#", "1",
                            "1", "#", "#", "1"};
        List<String> list3=createList(parts);
        assertArrayEquals(parts,SILab2.function( list2).toArray());
    }

}
