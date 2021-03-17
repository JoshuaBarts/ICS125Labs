package calcrpn;

import java.util.Stack;

public class CalcBrain implements CalcRPNOperations {
    
    Stack<Float> results;
    String operand;
    
    public CalcBrain() {
        results = new Stack<>();
        operand = "";
    }
    
    @Override
    public String digit(String digit) {
       this.operand += digit;
       return digit;
    }

    @Override
    public String operator(String op) {
        Float a;
        Float b;
        Float c = 0F;
        
        if (!this.operand.equals("")) {
            results.push(Float.parseFloat(this.operand));
            this.operand = "";
        }
        if (this.results.size() < 1) {
            return "";
        }
        
        if (this.results.size() == 1 && this.operand.equals("")) {
            return "";
        }
        
        switch (op) {
            
            case "+" :
                a = results.pop();
                b = results.pop();
                c = a + b;
                results.push(c);
            break;
            
            case "-" :
                a = results.pop();
                b = results.pop();
                c = b - a;
                results.push(c);
            break;
            
            case "*" :
                a = results.pop();
                b = results.pop();
                c = a * b;
                results.push(c);
            break;
            
            case "/" :
                a = results.pop();
                b = results.pop();
                c = b / a;
                results.push(c);
            break;
            
            case "^" :
                a = results.pop();
                b = results.pop();
                c = (float)Math.pow(b, a);
                results.push(c);
            break;
            
            default :
            break;
        }
        
        this.operand = "";
        return " " + op + "\n" + Float.toString(c) + "\n";
    }

    @Override
    public String clearEntry() {
       this.operand = "";
       String clearEntry = "\nCleared Digits\n";
       return clearEntry;
    }

    @Override
    public String clear() {
        this.operand = "";
        String clear = "\nClear All\n";
        this.results.clear();
        return clear;
    }

    @Override
    public String enterPressed() {
       
        if (this.operand.equals("")) {
            return ""; //if operand is blank just return blank string
        }
        results.push(Float.parseFloat(this.operand));
        this.operand = "";
        
        return " "; //single space
    }

    @Override
    public String addDecimal() {
       
       if (!this.operand.contains(".")) {
          this.operand += ".";
          return ".";
       }
       return "";
    }
   
}