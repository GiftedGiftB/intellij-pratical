package DiariesPack;

public class Diary {
        private String userName;
        private String password;
        private boolean isLocked = false;


        public Diary(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }
        public boolean isLocked() {
            return isLocked;
        }
        public int DiaryCounterIsOne(int counter) {
            return counter;
    }
}
