/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
/**
 * @ast node
 * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab3/a3-simplic/src/jastadd/lang.ast:7
 * @astdecl Assignment : Statement ::= IdUse:IdUse Expression:Expression;
 * @production Assignment : {@link Statement} ::= <span class="component">IdUse:{@link IdUse}</span> <span class="component">Expression:{@link Expression}</span>;

 */
public class Assignment extends Statement implements Cloneable {
  /**
   * @aspect NameAnalysis
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab3/a3-simplic/src/jastadd/NameAnalysis.jrag:120
   */
  public boolean checkNames(PrintStream err, SymbolTable symbols) {
			return getIdUse().checkNames(err, symbols) && getExpression().checkNames(err, symbols);
    }
  /**
   * @aspect PrettyPrint
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab3/a3-simplic/src/jastadd/PrettyPrint.jrag:113
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind);
		getIdUse().prettyPrint(out, ind);
		out.print(" = ");
		getExpression().prettyPrint(out, ind);
		out.print(";");
	}
  /**
   * @aspect Visitor
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab3/a3-simplic/src/jastadd/Visitor.jrag:90
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Assignment() {
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
    name = {"IdUse", "Expression"},
    type = {"IdUse", "Expression"},
    kind = {"Child", "Child"}
  )
  public Assignment(IdUse p0, Expression p1) {
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
  public Assignment clone() throws CloneNotSupportedException {
    Assignment node = (Assignment) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public Assignment copy() {
    try {
      Assignment node = (Assignment) clone();
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
  public Assignment fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public Assignment treeCopyNoTransform() {
    Assignment tree = (Assignment) copy();
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
  public Assignment treeCopy() {
    Assignment tree = (Assignment) copy();
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
   * Replaces the IdUse child.
   * @param node The new node to replace the IdUse child.
   * @apilevel high-level
   */
  public Assignment setIdUse(IdUse node) {
    setChild(node, 0);
    return this;
  }
  /**
   * Retrieves the IdUse child.
   * @return The current node used as the IdUse child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdUse")
  public IdUse getIdUse() {
    return (IdUse) getChild(0);
  }
  /**
   * Retrieves the IdUse child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdUse child.
   * @apilevel low-level
   */
  public IdUse getIdUseNoTransform() {
    return (IdUse) getChildNoTransform(0);
  }
  /**
   * Replaces the Expression child.
   * @param node The new node to replace the Expression child.
   * @apilevel high-level
   */
  public Assignment setExpression(Expression node) {
    setChild(node, 1);
    return this;
  }
  /**
   * Retrieves the Expression child.
   * @return The current node used as the Expression child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expression")
  public Expression getExpression() {
    return (Expression) getChild(1);
  }
  /**
   * Retrieves the Expression child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expression child.
   * @apilevel low-level
   */
  public Expression getExpressionNoTransform() {
    return (Expression) getChildNoTransform(1);
  }

}
