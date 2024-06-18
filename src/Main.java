import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create users
        User user1 = new User(1, "David");
        User user2 = new User(2, "Katy");
        User user3 = new User(3, "Maya");

        // Create actions
        Action like = new Action("like");
        Action share = new Action("share");
        Action comment = new Action("comment");

        // Create activity records
        List<ActivityRecord> records = Arrays.asList(
                new ActivityRecord(user1, like),
                new ActivityRecord(user2, comment),
                new ActivityRecord(user1, share),
                new ActivityRecord(user3, like),
                new ActivityRecord(user2, like)
        );

        // Initialize counters
        int totalActions = 0;
        Map<String, Integer> actionCount = new HashMap<>();
        Map<User, Integer> userActionCount = new HashMap<>();

        // Process each record
        for (ActivityRecord record : records) {
            User user = record.getUser();
            Action action = record.getAction();
            String actionType = action.getType();

            totalActions++;

            // Count actions by type
            actionCount.put(actionType, actionCount.getOrDefault(actionType, 0) + 1);

            // Count actions by user
            userActionCount.put(user, userActionCount.getOrDefault(user, 0) + 1);


        }

        // Find the user with the most actions
        User topUser = null;
        int maxActions = 0;
        for (Map.Entry<User, Integer> entry : userActionCount.entrySet()) {
            if (entry.getValue() > maxActions) {
                maxActions = entry.getValue();
                topUser = entry.getKey();
            }
        }

        // Find the most common type of action
        String topAction = null;
        int maxActionCount = 0;
        for (Map.Entry<String, Integer> entry : actionCount.entrySet()) {
            if (entry.getValue() > maxActionCount) {
                maxActionCount = entry.getValue();
                topAction = entry.getKey();
            }
        }

        // Print the report
        System.out.println("Total actions performed: " + totalActions);
        for (Map.Entry<String, Integer> entry : actionCount.entrySet()) {
            System.out.println("Number of '" + entry.getKey() + "': " + entry.getValue());
        }
        System.out.println("User with most actions: " + topUser.getName() + " (" + maxActions + " actions)");
        System.out.println("Most common type of action: " + topAction);
    }

}
