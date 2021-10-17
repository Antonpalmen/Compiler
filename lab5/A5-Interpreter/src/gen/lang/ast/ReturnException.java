package lang.ast;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
/**
 * @ast class
 * @aspect Interpreter
 * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/Interpreter.jrag:193
 */
public class ReturnException extends RuntimeException {
  /**
   * @aspect Interpreter
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/Interpreter.jrag:194
   */
  
    private int returnVal;
  /**
   * @aspect Interpreter
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/Interpreter.jrag:196
   */
  

    public ReturnException(int v){
      returnVal = v;
    }
  /**
   * @aspect Interpreter
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/Interpreter.jrag:199
   */
  
    public int getReturnValue(){
      return returnVal;
    }

}
