/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
/**
 * @ast node
 * @declaredat /mnt/c/Users/torth/.git/branches/lab3/a3-simplic/src/jastadd/lang.ast:6
 * @astdecl Declaration : Statement ::= IdDecl:IdDecl [Assignment:Expression];
 * @production Declaration : {@link Statement} ::= <span class="component">IdDecl:{@link IdDecl}</span> <span class="component">[Assignment:{@link Expression}]</span>;

 */
public class Declaration extends Statement implements Cloneable {
  /**
   * @aspect NameAnalysis
   * @declaredat /mnt/c/Users/torth/.git/branches/lab3/a3-simplic/src/jastadd/NameAnalysis.jrag:86
   */
  public void checkNames(PrintStream err, SymbolTable symbols) {
	    getIdDecl().checkNames(err, symbols);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /mnt/c/Users/torth/.git/branches/lab3/a3-simplic/src/jastadd/PrettyPrint.jrag:103
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind + "int ");
		getIdDecl().prettyPrint(out, ind);
		if(hasAssignment()) {
			out.print(" = ");
			getAssignment().prettyPrint(out, ind);
		}
		out.println(";");
	}
  /**
   * @aspect Visitor
   * @declaredat /mnt/c/Users/torth/.git/branches/lab3/a3-simplic/src/jastadd/Visitor.jrag:87
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Declaration() {
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
    setChild(new Opt(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"IdDecl", "Assignment"},
    type = {"IdDecl", "Opt<Expression>"},
    kind = {"Child", "Opt"}
  )
  public Declaration(IdDecl p0, Opt<Expression> p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 2;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public Declaration clone() throws CloneNotSupportedException {
    Declaration node = (Declaration) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public Declaration copy() {
    try {
      Declaration node = (Declaration) clone();
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
   * @declaredat ASTNode:62
   */
  @Deprecated
  public Declaration fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public Declaration treeCopyNoTransform() {
    Declaration tree = (Declaration) copy();
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
   * @declaredat ASTNode:92
   */
  public Declaration treeCopy() {
    Declaration tree = (Declaration) copy();
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
   * Replaces the IdDecl child.
   * @param node The new node to replace the IdDecl child.
   * @apilevel high-level
   */
  public Declaration setIdDecl(IdDecl node) {
    setChild(node, 0);
    return this;
  }
  /**
   * Retrieves the IdDecl child.
   * @return The current node used as the IdDecl child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdDecl")
  public IdDecl getIdDecl() {
    return (IdDecl) getChild(0);
  }
  /**
   * Retrieves the IdDecl child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdDecl child.
   * @apilevel low-level
   */
  public IdDecl getIdDeclNoTransform() {
    return (IdDecl) getChildNoTransform(0);
  }
  /**
   * Replaces the optional node for the Assignment child. This is the <code>Opt</code>
   * node containing the child Assignment, not the actual child!
   * @param opt The new node to be used as the optional node for the Assignment child.
   * @apilevel low-level
   */
  public Declaration setAssignmentOpt(Opt<Expression> opt) {
    setChild(opt, 1);
    return this;
  }
  /**
   * Replaces the (optional) Assignment child.
   * @param node The new node to be used as the Assignment child.
   * @apilevel high-level
   */
  public Declaration setAssignment(Expression node) {
    getAssignmentOpt().setChild(node, 0);
    return this;
  }
  /**
   * Check whether the optional Assignment child exists.
   * @return {@code true} if the optional Assignment child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasAssignment() {
    return getAssignmentOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Assignment child.
   * @return The Assignment child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Expression getAssignment() {
    return (Expression) getAssignmentOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Assignment child. This is the <code>Opt</code> node containing the child Assignment, not the actual child!
   * @return The optional node for child the Assignment child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Assignment")
  public Opt<Expression> getAssignmentOpt() {
    return (Opt<Expression>) getChild(1);
  }
  /**
   * Retrieves the optional node for child Assignment. This is the <code>Opt</code> node containing the child Assignment, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Assignment.
   * @apilevel low-level
   */
  public Opt<Expression> getAssignmentOptNoTransform() {
    return (Opt<Expression>) getChildNoTransform(1);
  }

}
