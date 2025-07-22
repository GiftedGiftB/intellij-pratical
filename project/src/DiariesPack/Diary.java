package DiariesPack;

import java.util.ArrayList;
import java.util.List;

public class Diary {
        private String userName;
        private String password;
        private boolean isLocked;
        private int id = 0;
        private List<Entry> entries;


        public Diary(String userName, String password) {
            this.userName = userName;
            this.password = password;
            this.entries = new ArrayList<>();
        }
        public void unLock(String key) {
            isLocked = true;
        }
        public boolean isLocked() {
            return isLocked;
        }
        public void locked() {
            isLocked = false;
        }
        public void createEntry(String title, String body) {
            ++id;
            entries.add(new Entry(id, userName, password));
        }
        public List<Entry> getEntries() {
            return entries;
        }
        public void deleteEntry(int id) {
            for(Entry counter: entries) {
                if(counter.getId() == id) {
                    entries.remove(counter);
                    break;
                }
            }
        }
        public Entry findEntryById(int id) {
            for(Entry counter: entries) {
                if(counter.getId() == id) {
                    return counter;
                }
            }
            return null;
        }
        public void updateEntry(int id, String title, String body) {
            for(Entry counter: entries) {
                if(counter.getId() == id) {
                    counter.setTitle(title);
                    counter.setBody(body);
                    break;
                }

            }
    }
}
