/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
/**
 * @ast node
 * @declaredat /mnt/c/Users/torth/.git/branches/lab3/a3-simplic/src/jastadd/lang.ast:1
 * @astdecl Program : ASTNode ::= Function*;
 * @production Program : {@link ASTNode} ::= <span class="component">{@link Function}*</span>;

 */
public class Program extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @param err where to write error messages
   * @aspect NameAnalysis
   * @declaredat /mnt/c/Users/torth/.git/branches/lab3/a3-simplic/src/jastadd/NameAnalysis.jrag:56
   */
  public void checkNames(PrintStream err) {
		SymbolTable symbols = new SymbolTable();
		checkNames(err, symbols);
	}
  /**
   * @aspect Visitor
   * @declaredat /mnt/c/Users/torth/.git/branches/lab3/a3-simplic/src/jastadd/Visitor.jrag:48
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Program() {
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
    children = new ASTNode[1];
    setChild(new List(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Function"},
    type = {"List<Function>"},
    kind = {"List"}
  )
  public Program(List<Function> p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 1;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushAttrCache() {
    super.flushAttrCache();

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
  public Program clone() throws CloneNotSupportedException {
    Program node = (Program) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public Program copy() {
    try {
      Program node = (Program) clone();
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
  public Program fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public Program treeCopyNoTransform() {
    Program tree = (Program) copy();
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
  public Program treeCopy() {
    Program tree = (Program) copy();
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
   * Replaces the Function list.
   * @param list The new list node to be used as the Function list.
   * @apilevel high-level
   */
  public Program setFunctionList(List<Function> list) {
    setChild(list, 0);
    return this;
  }
  /**
   * Retrieves the number of children in the Function list.
   * @return Number of children in the Function list.
   * @apilevel high-level
   */
  public int getNumFunction() {
    return getFunctionList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Function list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Function list.
   * @apilevel low-level
   */
  public int getNumFunctionNoTransform() {
    return getFunctionListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Function list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Function list.
   * @apilevel high-level
   */
  public Function getFunction(int i) {
    return (Function) getFunctionList().getChild(i);
  }
  /**
   * Check whether the Function list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasFunction() {
    return getFunctionList().getNumChild() != 0;
  }
  /**
   * Append an element to the Function list.
   * @param node The element to append to the Function list.
   * @apilevel high-level
   */
  public Program addFunction(Function node) {
    List<Function> list = (parent == null) ? getFunctionListNoTransform() : getFunctionList();
    list.addChild(node);
    return this;
  }
  /** @apilevel low-level 
   */
  public Program addFunctionNoTransform(Function node) {
    List<Function> list = getFunctionListNoTransform();
    list.addChild(node);
    return this;
  }
  /**
   * Replaces the Function list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public Program setFunction(Function node, int i) {
    List<Function> list = getFunctionList();
    list.setChild(node, i);
    return this;
  }
  /**
   * Retrieves the Function list.
   * @return The node representing the Function list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Function")
  public List<Function> getFunctionList() {
    List<Function> list = (List<Function>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Function list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Function list.
   * @apilevel low-level
   */
  public List<Function> getFunctionListNoTransform() {
    return (List<Function>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the Function list without
   * triggering rewrites.
   */
  public Function getFunctionNoTransform(int i) {
    return (Function) getFunctionListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Function list.
   * @return The node representing the Function list.
   * @apilevel high-level
   */
  public List<Function> getFunctions() {
    return getFunctionList();
  }
  /**
   * Retrieves the Function list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Function list.
   * @apilevel low-level
   */
  public List<Function> getFunctionsNoTransform() {
    return getFunctionListNoTransform();
  }

}
