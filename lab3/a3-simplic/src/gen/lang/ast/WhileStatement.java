/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
/**
 * @ast node
 * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab3/a3-simplic/src/jastadd/lang.ast:10
 * @astdecl WhileStatement : Statement ::= Expression Statement*;
 * @production WhileStatement : {@link Statement} ::= <span class="component">{@link Expression}</span> <span class="component">{@link Statement}*</span>;

 */
public class WhileStatement extends Statement implements Cloneable {
  /**
   * @aspect NameAnalysis
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab3/a3-simplic/src/jastadd/NameAnalysis.jrag:107
   */
  public boolean checkNames(PrintStream err, SymbolTable symbols) {
		boolean result = getExpression().checkNames(err, symbols);
		symbols = symbols.push();
		for(int i = 0; i < getNumStatement(); i++) {
			result = result && getStatement(i).checkNames(err, symbols);
			}
		return result;
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab3/a3-simplic/src/jastadd/PrettyPrint.jrag:88
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind + "while (");
		getExpression().prettyPrint(out, ind);
		out.println(") {");
		if(hasStatement()) {
			for(int i = 0; i < getNumStatement(); i++){
				getStatement(i).prettyPrint(out, ind + "	");
				out.println();
			}
		} else {
				out.println();
				}
				out.print(ind + "}");
	}
  /**
   * @aspect Visitor
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab3/a3-simplic/src/jastadd/Visitor.jrag:67
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public WhileStatement() {
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
    setChild(new List(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Expression", "Statement"},
    type = {"Expression", "List<Statement>"},
    kind = {"Child", "List"}
  )
  public WhileStatement(Expression p0, List<Statement> p1) {
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
  public WhileStatement clone() throws CloneNotSupportedException {
    WhileStatement node = (WhileStatement) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public WhileStatement copy() {
    try {
      WhileStatement node = (WhileStatement) clone();
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
  public WhileStatement fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public WhileStatement treeCopyNoTransform() {
    WhileStatement tree = (WhileStatement) copy();
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
  public WhileStatement treeCopy() {
    WhileStatement tree = (WhileStatement) copy();
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
   * Replaces the Expression child.
   * @param node The new node to replace the Expression child.
   * @apilevel high-level
   */
  public WhileStatement setExpression(Expression node) {
    setChild(node, 0);
    return this;
  }
  /**
   * Retrieves the Expression child.
   * @return The current node used as the Expression child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expression")
  public Expression getExpression() {
    return (Expression) getChild(0);
  }
  /**
   * Retrieves the Expression child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expression child.
   * @apilevel low-level
   */
  public Expression getExpressionNoTransform() {
    return (Expression) getChildNoTransform(0);
  }
  /**
   * Replaces the Statement list.
   * @param list The new list node to be used as the Statement list.
   * @apilevel high-level
   */
  public WhileStatement setStatementList(List<Statement> list) {
    setChild(list, 1);
    return this;
  }
  /**
   * Retrieves the number of children in the Statement list.
   * @return Number of children in the Statement list.
   * @apilevel high-level
   */
  public int getNumStatement() {
    return getStatementList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Statement list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Statement list.
   * @apilevel low-level
   */
  public int getNumStatementNoTransform() {
    return getStatementListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Statement list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Statement list.
   * @apilevel high-level
   */
  public Statement getStatement(int i) {
    return (Statement) getStatementList().getChild(i);
  }
  /**
   * Check whether the Statement list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasStatement() {
    return getStatementList().getNumChild() != 0;
  }
  /**
   * Append an element to the Statement list.
   * @param node The element to append to the Statement list.
   * @apilevel high-level
   */
  public WhileStatement addStatement(Statement node) {
    List<Statement> list = (parent == null) ? getStatementListNoTransform() : getStatementList();
    list.addChild(node);
    return this;
  }
  /** @apilevel low-level 
   */
  public WhileStatement addStatementNoTransform(Statement node) {
    List<Statement> list = getStatementListNoTransform();
    list.addChild(node);
    return this;
  }
  /**
   * Replaces the Statement list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public WhileStatement setStatement(Statement node, int i) {
    List<Statement> list = getStatementList();
    list.setChild(node, i);
    return this;
  }
  /**
   * Retrieves the Statement list.
   * @return The node representing the Statement list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Statement")
  public List<Statement> getStatementList() {
    List<Statement> list = (List<Statement>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Statement list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Statement list.
   * @apilevel low-level
   */
  public List<Statement> getStatementListNoTransform() {
    return (List<Statement>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the Statement list without
   * triggering rewrites.
   */
  public Statement getStatementNoTransform(int i) {
    return (Statement) getStatementListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Statement list.
   * @return The node representing the Statement list.
   * @apilevel high-level
   */
  public List<Statement> getStatements() {
    return getStatementList();
  }
  /**
   * Retrieves the Statement list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Statement list.
   * @apilevel low-level
   */
  public List<Statement> getStatementsNoTransform() {
    return getStatementListNoTransform();
  }

}
