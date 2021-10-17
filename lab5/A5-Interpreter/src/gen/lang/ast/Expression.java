/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5 */
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
 * @ast node
 * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/lang.ast:17
 * @astdecl Expression : ASTNode;
 * @production Expression : {@link ASTNode};

 */
public abstract class Expression extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/Interpreter.jrag:98
   */
  public int eval(ActivationRecord rec) {
      throw new RuntimeException();
  }
  /**
   * @declaredat ASTNode:1
   */
  public Expression() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:13
   */
  protected int numChildren() {
    return 0;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:17
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    expectedType_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:22
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public Expression clone() throws CloneNotSupportedException {
    Expression node = (Expression) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:38
   */
  @Deprecated
  public abstract Expression fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:46
   */
  public abstract Expression treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:54
   */
  public abstract Expression treeCopy();
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/TypeAnalysis.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/TypeAnalysis.jrag:4")
  public abstract Type type();
  /**
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/TypeAnalysis.jrag:78
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/TypeAnalysis.jrag:78")
  public Type expectedType() {
    ASTState state = state();
    if (expectedType_computed) {
      return expectedType_value;
    }
    if (expectedType_visited) {
      throw new RuntimeException("Circular definition of attribute Expression.expectedType().");
    }
    expectedType_visited = true;
    state().enterLazyAttribute();
    expectedType_value = getParent().Define_expectedType(this, null);
    expectedType_computed = true;
    state().leaveLazyAttribute();
    expectedType_visited = false;
    return expectedType_value;
  }
/** @apilevel internal */
protected boolean expectedType_visited = false;
  /** @apilevel internal */
  private void expectedType_reset() {
    expectedType_computed = false;
    
    expectedType_value = null;
    expectedType_visited = false;
  }
  /** @apilevel internal */
  protected boolean expectedType_computed = false;

  /** @apilevel internal */
  protected Type expectedType_value;

  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/Errors.jrag:70
    if (type() == unknownType()) {
      {
        Program target = (Program) (program());
        java.util.Set<ASTNode> contributors = _map.get(target);
        if (contributors == null) {
          contributors = new java.util.LinkedHashSet<ASTNode>();
          _map.put((ASTNode) target, contributors);
        }
        contributors.add(this);
      }
    }
    super.collect_contributors_Program_errors(_root, _map);
  }
  /** @apilevel internal */
  protected void contributeTo_Program_errors(Set<ErrorMessage> collection) {
    super.contributeTo_Program_errors(collection);
    if (type() == unknownType()) {
      collection.add(error("Expression type mistmatch!"));
    }
  }

}
