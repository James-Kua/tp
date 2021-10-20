package seedu.address.model.modulelesson;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.TypicalModuleLessons.CS2100_LAB1;
import static seedu.address.testutil.TypicalModuleLessons.CS2100_TUT1;
import static seedu.address.testutil.TypicalModuleLessons.CS2103_TUT1;

import org.junit.jupiter.api.Test;

import seedu.address.testutil.ModuleLessonBuilder;

public class ModuleLessonTest {

    @Test
    public void isSameModuleClass() {
        assertTrue(CS2100_LAB1.isSameModuleLesson(CS2100_LAB1));

        assertFalse(CS2100_TUT1.isSameModuleLesson(null));

        // same module code, all other attributes same -> return true
        ModuleLesson editedCS2100Lab = new ModuleLessonBuilder(CS2100_LAB1).withRemark("hello").build();
        assertTrue(CS2100_LAB1.isSameModuleLesson(editedCS2100Lab));

        // name differs in case, all other attributes same -> returns false
        editedCS2100Lab = new ModuleLessonBuilder(CS2100_LAB1).withModuleCode("cs2100").build();
        assertFalse(CS2100_LAB1.isSameModuleLesson(editedCS2100Lab));
    }

    @Test
    public void equals() {
        ModuleLesson cs2103Tut1Copy = new ModuleLessonBuilder(CS2103_TUT1).build();
        assertEquals(CS2103_TUT1, cs2103Tut1Copy);

        assertEquals(CS2100_TUT1, CS2100_TUT1);

        assertNotEquals(CS2100_TUT1, null);

        assertNotEquals(CS2100_TUT1, 5);

        assertNotEquals(CS2103_TUT1, CS2100_TUT1);

    }

    @Test
    public void toStringTest() {
        assertEquals(CS2100_LAB1.toString(), "Module: [CS2100 B31]; Day: Tuesday; Time: 15:00; Remark: COM1 0113");

        assertEquals(CS2100_TUT1.toString(), "Module: [CS2100 T18]; Day: Wednesday; Time: 17:00; "
                + "Remark: COM1 01-20");
    }

}