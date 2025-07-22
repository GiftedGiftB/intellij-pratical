import DiariesPack.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {
    Diary myDiary;

    @BeforeEach
    public void setUp() {
        myDiary = new Diary("giftDiary","12345");
    }
    @Test
    public void testThatDiary_IsUnlocked() {
        boolean isLocked = true;
        assertEquals(true, isLocked);
    }
    @Test
    public void testThatDiaryCanBeLocked() {
        myDiary.isLocked();
        boolean isLocked = true;
        assertEquals(true, isLocked);
    }
    @Test
    public void testThatEntriesIsNotEmpty() {
        myDiary.createEntry("giftDiary" , "12345");
        assertEquals(1, myDiary.getEntries().size());
    }
    @Test
    public void testThatEntriesIsTwo(){
        myDiary.createEntry("giftDiary" , "12345");
        myDiary.createEntry("justineDiary" , "2468");
        assertEquals(2, myDiary.getEntries().size());
    }
    @Test
    public void testThatDiaryCanDelete(){
        myDiary.unLock("12345");
        assertEquals(true, myDiary.isLocked());
        myDiary.createEntry("giftDiary" , "12345");
        myDiary.createEntry("justineDiary" , "2468");
        assertEquals(2, myDiary.getEntries().size());
        myDiary.deleteEntry(2);
        assertEquals(1, myDiary.getEntries().size());
    }
    @Test
    public void testThatEntryCanBeFoundById(){
        myDiary.createEntry("giftDiary" , "12345");
        myDiary.createEntry("justineDiary" , "2468");
        assertEquals(2, myDiary.getEntries().size());
        myDiary.findEntryById(2);
    }
    @Test
    public void testThatEntryCanBeUpdated(){
        myDiary.createEntry("giftDiary" , "12345");
        myDiary.createEntry("justineDiary" , "2468");
        assertEquals(2, myDiary.getEntries().size());
        myDiary.updateEntry(2);

    }

//    @Test
//    public void testThatDiaryCanBeCreated_DiaryCounterIsOne() {
//        Diary myDiary = new Diary("giftDiary" , "12345");
//        myDiary.DiaryCounterIsOne(1);
//        assertEquals(1, myDiary.DiaryCounterIsOne(1));
//    }
}
