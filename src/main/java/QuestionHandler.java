import java.util.ArrayList;

public class QuestionHandler {
    ArrayList<QuestionClass> questions;

    public QuestionHandler() {
        this.questions = new ArrayList<>();
        generateQuestions();
    }

    // Fyller listan med frågor. Nya frågor läggs in här. Skapar ett frågeobject och lägger in det i listan.
    // When question is added, remember to increase QuestionHandlerTest test questionhandler with one
    private void generateQuestions(){
        String question;
        String[] choices = new String[4];
        int answer;

        question = "Que1: Which one among these is not a primitive datatype?";
        choices[0] = "int";
        choices[1] = "Float";
        choices[2] = "boolean";
        choices[3] = "char";
        answer = 1;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que2: Which class is available to all the class automatically?";
        choices[0] = "Swing";
        choices[1] = "Applet";
        choices[2] = "Object";
        choices[3] = "ActionEvent";
        answer = 2;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que3: Which package is directly available to our class without importing it?";
        choices[0] = "swing";
        choices[1] = "applet";
        choices[2] = "net";
        choices[3] = "lang";
        answer = 3;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que4: String class is defined in which package?";
        choices[0] = "lang";
        choices[1] = "Swing";
        choices[2] = "Applet";
        choices[3] = "awt";
        answer = 0;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que5: Which institute is best for java coaching?";
        choices[0] = "Utek";
        choices[1] = "Aptech";
        choices[2] = "SSS IT";
        choices[3] = "jtek";
        answer = 2;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que6: Which one among these is not a keyword?";
        choices[0] = "class";
        choices[1] = "int";
        choices[2] = "get";
        choices[3] = "if";
        answer = 2;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que7: Which one among these is not a class? ";
        choices[0] = "Swing";
        choices[1] = "ActionPerformed";
        choices[2] = "ActionEvent";
        choices[3] = "Button";
        answer = 1;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que8: which one among these is not a function of Object class?";
        choices[0] = "toString";
        choices[1] = "finalize";
        choices[2] = "equals";
        choices[3] = "getDocumentBase";
        answer = 3;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que9: which function is not present in Applet class?";
        choices[0] = "init";
        choices[1] = "main";
        choices[2] = "start";
        choices[3] = "destroy";
        answer = 1;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que10: Which one among these is not a valid component?";
        choices[0] = "JButton";
        choices[1] = "JList";
        choices[2] = "JButtonGroup";
        choices[3] = "JTextArea";
        answer = 2;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que11: Which person is the coolest?";
        choices[0] = "Peter";
        choices[1] = "Lars";
        choices[2] = "Jens";
        choices[3] = "Jojjo";
        answer = 3;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que12: What is 1+1?";
        choices[0] = "1";
        choices[1] = "2";
        choices[2] = "11";
        choices[3] = "22";
        answer = 1;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que13: Whats the worst place in Sweden";
        choices[0] = "Stockholm";
        choices[1] = "Gothenburg";
        choices[2] = "Malmoe";
        choices[3] = "Knivsta";
        answer = 3;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que14: What's the best place on earth?";
        choices[0] = "Sundsvall";
        choices[1] = "Jönköping";
        choices[2] = "Anywhere but Knivsta";
        choices[3] = "Nacka";
        answer = 2;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

    }

    // Function that returns question at the index supplied
    public QuestionClass getQuestionAtIndex(int i){ // Returnerar frågan som finns på kallade indexet
        return this.questions.get(i);
    }
}
