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
 * @aspect FunctionCalls
 * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/FunctionCalls.jrag:19
 */
public class Comp extends java.lang.Object implements Comparator<Function> {
  /**
   * @aspect FunctionCalls
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/FunctionCalls.jrag:21
   */
  

    public int compare(Function f1, Function f2){
      return f1.getIdDecl().getID().compareTo(f2.getIdDecl().getID());
    }

}
