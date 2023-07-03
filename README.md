
Bank Question Project
The Bank Question project is a Java application that allows users to manage and organize questions for quizzes. Users can create, edit, and delete questions, as well as import questions from a text file. The application also provides a quiz feature for users to test their knowledge based on the available questions.

Features
The Bank Question project includes the following features:

Question Management:

Create new questions with customizable details such as question text, answer choices, and grading.
Edit existing questions to update their content or modify answer choices and grading.
Delete unwanted questions from the database.
Quiz Creation:

Create quizzes by selecting a set of questions from the available question bank.
Specify the quiz name, description, time limit, and start/end times.
Question Import:

Import questions from a text file in a specified format.
The text file should contain question details such as question text, answer choices, and grading.
Prerequisites
To run the Bank Question project, ensure you have the following installed:

Java Development Kit (JDK) version 8 or later.
MySQL Server installed and running.
MySQL Connector/J library added to your project's classpath.
Setup
Follow these steps to set up and run the Bank Question project:

Clone the project repository from GitHub.

Import the project into your preferred Java IDE.

Create a MySQL database named bank_question or adjust the database name in the project's configuration if desired.

Execute the createDatabaseStructure method in the Main class to create the required database tables and structure.

Update the MySQL connection settings in the Main class to match your MySQL server configuration.

Run the Main class to start the application.

Usage
Upon running the application, you will be presented with a menu to interact with various options.

Use the menu options to create, edit, or delete questions, create quizzes, or import questions from a text file.

When creating or editing a question, provide the necessary details such as question text, answer choices, and grading.

When creating a quiz, select the questions from the question bank, provide the quiz details, and specify the time limit and start/end times.

To import questions from a text file, follow the specified format and provide the file path.

The application will guide you through the available options and provide appropriate prompts for input.

Example Question Import File Format
To import questions from a text file, follow the format outlined below:

Question: What is the capital of France?
Answer 1: Paris (Correct)
Answer 2: London
Answer 3: Berlin
Answer 4: Rome

Each question and its answer choices should be on separate lines. Use the "Question:" prefix for the question text and "Answer X:" prefix for each answer choice. Mark the correct answer with the "(Correct)" suffix.

License
This project is licensed under the MIT License.

Feel free to customize and modify the project as per your requirements.

Acknowledgements
This project was developed as a learning exercise and is inspired by various question bank and quiz management systems. Special thanks to the creators and contributors of Java, MySQL, and the various libraries used in this project.
