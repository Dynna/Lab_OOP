package lab_4;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Stack;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        String fileName = "C:/New Folder/one_expression.txt";
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            String checkExpression = checkParenthesis(line);
            System.out.println("First expression is : " + checkExpression);
        }

        try {
            reader = new BufferedReader(new FileReader(
                    "C:/New Folder/three_expressions.txt"));
            String lines = reader.readLine();
            while (lines != null) {
                String checkExpressions = checkParenthesis(lines);
                System.out.println("Next expression is : " + checkExpressions);
                lines = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String checkParenthesis(String expr)
    {
        if (expr.isEmpty())
            return "correct";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++)
        {
            char current = expr.charAt(i);
            if (current == '{' || current == '(' || current == '[')
            {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']')
            {
                if (stack.isEmpty())
                    return "incorrect";
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return "incorrect";
            }
        }

        return stack.isEmpty() ? "correct" : "incorrect" ;
    }
}
