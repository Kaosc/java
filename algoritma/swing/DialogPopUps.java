import javax.swing.JOptionPane;

public class DialogPopUps {

   public static void main(String[] args) {
      // JOPtionPane = a component which pops up standard dialog boxes such as message
      // dialog, confirm dialog and input dialog

      JOptionPane.showMessageDialog(null, "This is some useless info", "Title",
            JOptionPane.PLAIN_MESSAGE);
      JOptionPane.showMessageDialog(null, "Here is some more useless info",
            "Title", JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, "Here is some critical info", "Title",
            JOptionPane.ERROR_MESSAGE);
      JOptionPane.showMessageDialog(null, "Here is some more useless info",
            "Title", JOptionPane.QUESTION_MESSAGE);
      JOptionPane.showMessageDialog(null, "Here is some more useless info",
            "Title", JOptionPane.WARNING_MESSAGE);

      int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this?", "Title",
            JOptionPane.YES_NO_CANCEL_OPTION);
      System.out.println(option);

      String answer = JOptionPane.showInputDialog("What is your name?");
      System.out.println("Hello " + answer);

      String[] responses = { "Run", "Hide", "Cry" };
      String question = "You have been infected with a computer virus, what do you do?";
      String title = "Title";

      int choice = JOptionPane.showOptionDialog(null, question,
            title,
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
            responses, 0);

      System.out.println(choice); // Index of the option chosen
   }
}
