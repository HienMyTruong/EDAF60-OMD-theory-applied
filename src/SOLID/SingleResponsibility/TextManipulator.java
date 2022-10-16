package src.SOLID.SingleResponsibility;

/* a class where its only job is to manipulate text
 * Although this may seem fine, it is not good example of the SRP. 
 * Here we actually have two responsibilities: manipulating and printing text.
 * 
 * Having a method that prints out text in this class violate the Single Responsibility Principle. 
 * For this purpose, we should create another class, which will only handle printing text.
 * 
 * Following SRP, our classes will adhere to one functionality. Their methods and data will be cocerned witgh one clear purpose.
 * This means high cohesion, as well as robustness, which together reduce errors. 
 * 
 */

public class TextManipulator {
    private String text;

    public TextManipulator(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    /*
     * Demonstrating a problem with SRP if the definition for responsibility is
     * unclear
     * 
     * From appendText() to findMoreAndDelete():
     * - Here we have a clear representation of what this class does: Manipulating
     * text.
     * If we don't think about cohesion and we don't have a clear definition of what
     * this class's responsibility is,
     * we could say that writing and updating the text are two different and
     * seperate jobs. Lead by this thought we can
     * conclude that these should be two seperate classes: WriteText and UpdateTezt
     * 
     * In reality, we'd get two classes that are tightly coupled and loosely
     * cohesive, which should always be used together.
     * These three methods may perform different operations, but they essentially
     * serve one single purpose: Text manipulation. The key is not to overthink.
     * 
     * One of the tools that can help achieve high cohesion in methods is LCOM, that
     * essentially measures the connection between class components and their
     * relationship to one another.
     */

    public void appendText(String newText) {
        text = text.concat(newText);
    }

    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }

    public String findWordAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        }
        return text;
    }

    /* Should be in another class to not violate SRP-principle */

    /*
     * public void printText() {
     * System.out.println(textManipulator.getText());
     * }
     */
}