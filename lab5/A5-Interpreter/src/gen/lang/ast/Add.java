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
 * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/lang.ast:29
 * @astdecl Add : Expression ::= a:Expression b:Expression;
 * @production Add : {@link Expression} ::= <span class="component">a:{@link Expression}</span> <span class="component">b:{@link Expression}</span>;

 */
public class Add extends Expression implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/Interpreter.jrag:107
   */
  @Override
  public int eval(ActivationRecord actrec){
    int value = geta().eval(actrec) + getb().eval(actrec);
    return value;
  }
  /**
   * @aspect PrettyPrint
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/PrettyPrint.jrag:140
   */
  public void prettyPrint(PrintStream out, String ind) {
		geta().prettyPrint(out, ind);
		out.print(" + ");
		getb().prettyPrint(out, ind);
	}
  /**
   * @aspect Visitor
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/Visitor.jrag:90
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Add() {
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
    children = new ASTNode[2];
  }
  /**
   * @declaredat ASTNode:13
   */
  @ASTNodeAnnotation.Constructor(
    name = {"a", "b"},
    type = {"Expression", "Expression"},
    kind = {"Child", "Child"}
  )
  public Add(Expression p0, Expression p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 2;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    type_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public Add clone() throws CloneNotSupportedException {
    Add node = (Add) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public Add copy() {
    try {
      Add node = (Add) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:61
   */
  @Deprecated
  public Add fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public Add treeCopyNoTransform() {
    Add tree = (Add) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:91
   */
  public Add treeCopy() {
    Add tree = (Add) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Replaces the a child.
   * @param node The new node to replace the a child.
   * @apilevel high-level
   */
  public Add seta(Expression node) {
    setChild(node, 0);
    return this;
  }
  /**
   * Retrieves the a child.
   * @return The current node used as the a child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="a")
  public Expression geta() {
    return (Expression) getChild(0);
  }
  /**
   * Retrieves the a child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the a child.
   * @apilevel low-level
   */
  public Expression getaNoTransform() {
    return (Expression) getChildNoTransform(0);
  }
  /**
   * Replaces the b child.
   * @param node The new node to replace the b child.
   * @apilevel high-level
   */
  public Add setb(Expression node) {
    setChild(node, 1);
    return this;
  }
  /**
   * Retrieves the b child.
   * @return The current node used as the b child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="b")
  public Expression getb() {
    return (Expression) getChild(1);
  }
  /**
   * Retrieves the b child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the b child.
   * @apilevel low-level
   */
  public Expression getbNoTransform() {
    return (Expression) getChildNoTransform(1);
  }
/** @apilevel internal */
protected boolean type_visited = false;
  /** @apilevel internal */
  private void type_reset() {
    type_computed = false;
    
    type_value = null;
    type_visited = false;
  }
  /** @apilevel internal */
  protected boolean type_computed = false;

  /** @apilevel internal */
  protected Type type_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/TypeAnalysis.jrag:38
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/mnt/c/Users/torth/documents/edan65/p003-william-anton/lab5/a5-interpreter/src/jastadd/TypeAnalysis.jrag:4")
  public Type type() {
    ASTState state = state();
    if (type_computed) {
      return type_value;
    }
    if (type_visited) {
      throw new RuntimeException("Circular definition of attribute Expression.type().");
    }
    type_visited = true;
    state().enterLazyAttribute();
    type_value = type_compute();
    type_computed = true;
    state().leaveLazyAttribute();
    type_visited = false;
    return type_value;
  }
  /** @apilevel internal */
  private Type type_compute() {
      return geta().type().isIntType() && getb().type().isIntType() ? intType() : unknownType();
    }

}
