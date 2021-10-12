/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/lang.ast:35
 * @astdecl Mod : Expression ::= a:Expression b:Expression;
 * @production Mod : {@link Expression} ::= <span class="component">a:{@link Expression}</span> <span class="component">b:{@link Expression}</span>;

 */
public class Mod extends Expression implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/PrettyPrint.jrag:169
   */
  public void prettyPrint(PrintStream out, String ind) {
		geta().prettyPrint(out, ind);
		out.print(" % ");
		getb().prettyPrint(out, ind);
	}
  /**
   * @aspect Visitor
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/Visitor.jrag:106
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Mod() {
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
  public Mod(Expression p0, Expression p1) {
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
  public Mod clone() throws CloneNotSupportedException {
    Mod node = (Mod) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public Mod copy() {
    try {
      Mod node = (Mod) clone();
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
  public Mod fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public Mod treeCopyNoTransform() {
    Mod tree = (Mod) copy();
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
  public Mod treeCopy() {
    Mod tree = (Mod) copy();
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
  public Mod seta(Expression node) {
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
  public Mod setb(Expression node) {
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

}
