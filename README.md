# Activity Log Analyzer Challenge

## Challenge Description
You are tasked with developing a Java application that analyzes user activity logs from a social network. Your application should process these logs and generate a report with the following statistics:
1. Total number of actions performed.
2. Number of actions for each type (like, comment, share).
3. User who performed the most actions and how many.
4. Most common type of action.

## Project Structure
You need to implement the following classes:
- `User`: Represents a user with an `id` and a `name`.
- `Action`: Represents an action with a `type`.
- `ActivityRecord`: Represents a record of an action performed by a user.
- `Main`: Contains the main logic to process activity records and generate the report.

## Requirements
1. Implement the `User`, `Action`, and `ActivityRecord` classes according to the provided descriptions.
2. Develop the `Main` class to:
    - Create instances of `User`, `Action`, and `ActivityRecord`.
    - Process activity records to calculate required statistics.
    - Print a report showing the total actions performed, actions by type, user with the most actions, and the most common type of action.