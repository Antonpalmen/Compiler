/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
/**
 * @ast node
 * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab3/a3-simplic/src/jastadd/lang.ast:12
 * @astdecl FunctionCall : Statement ::= FunctionUse;
 * @production FunctionCall : {@link Statement} ::= <span class="component">{@link FunctionUse}</span>;

 */
public class FunctionCall extends Statement implements Cloneable {
  /**
   * @aspect NameAnalysis
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab3/a3-simplic/src/jastadd/NameAnalysis.jrag:124
   */
  public boolean checkNames(PrintStream err, SymbolTable symbols) {
    	return getFunctionUse().checkNames(err, symbols);
    }
  /**
   * @aspect PrettyPrint
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab3/a3-simplic/src/jastadd/PrettyPrint.jrag:51
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind);
		getFunctionUse().prettyPrint(out, ind);
		out.print(";");
	}
  /**
   * @aspect Visitor
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab3/a3-simplic/src/jastadd/Visitor.jrag:70
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public FunctionCall() {
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
  }
  /**
   * @declaredat ASTNode:13
   */
  @ASTNodeAnnotation.Constructor(
    name = {"FunctionUse"},
    type = {"FunctionUse"},
    kind = {"Child"}
  )
  public FunctionCall(FunctionUse p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 1;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:26
   */
  public void flushAttrCache() {
    super.flushAttrCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public FunctionCall clone() throws CloneNotSupportedException {
    FunctionCall node = (FunctionCall) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public FunctionCall copy() {
    try {
      FunctionCall node = (FunctionCall) clone();
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
   * @declaredat ASTNode:60
   */
  @Deprecated
  public FunctionCall fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:70
   */
  public FunctionCall treeCopyNoTransform() {
    FunctionCall tree = (FunctionCall) copy();
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
   * @declaredat ASTNode:90
   */
  public FunctionCall treeCopy() {
    FunctionCall tree = (FunctionCall) copy();
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
   * Replaces the FunctionUse child.
   * @param node The new node to replace the FunctionUse child.
   * @apilevel high-level
   */
  public FunctionCall setFunctionUse(FunctionUse node) {
    setChild(node, 0);
    return this;
  }
  /**
   * Retrieves the FunctionUse child.
   * @return The current node used as the FunctionUse child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="FunctionUse")
  public FunctionUse getFunctionUse() {
    return (FunctionUse) getChild(0);
  }
  /**
   * Retrieves the FunctionUse child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the FunctionUse child.
   * @apilevel low-level
   */
  public FunctionUse getFunctionUseNoTransform() {
    return (FunctionUse) getChildNoTransform(0);
  }

}
