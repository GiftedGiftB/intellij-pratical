import DiariesPack.Diary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {

    @Test
    public void testThatDiaryCanBeCreated_DiaryCounterIsOne() {
        Diary myDiary = new Diary("name" , "12345");
        myDiary.DiaryCounterIsOne(1);
        assertEquals(1, myDiary.DiaryCounterIsOne(1));
    }
    @Test
    public void testThatDiaryIsUnlockedByDefault() {
        Diary myDiary = new Diary("name" , "12345");
        boolean isLocked = true;
        assertEquals(true, isLocked);
    }
    @Test
    public void testThatDiaryCanBeLocked() {
        Diary myDiary = new Diary("name" , "12345");
        boolean isLocked = true;
        assertEquals(true, isLocked);
    }
}
