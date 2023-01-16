package UserIDGenerator;

import java.util.ArrayList;



    public class UserIDGenerator {
        private ArrayList<String> takenUIDS;

        public UserIDGenerator() {
            this.takenUIDS = new ArrayList<>();
        }

        public String generateUID(String navn) {
            int max = 0;
            for (String uid : takenUIDS) {
                String[] parts = uid.split("_");
                if (parts.length == 2) {
                    try {
                        int num = Integer.parseInt(parts[1]);
                        max = Math.max(max, num);
                    } catch (NumberFormatException e) {

                    }
                }
            }
            String nextUID = navn + "_" + (max + 1);
            takenUIDS.add(nextUID);
            return nextUID;
        }
    }

