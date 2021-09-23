/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
/**
 * @ast node
 * @declaredat /mnt/c/Users/torth/.git/branches/lab3/a3-simplic/src/jastadd/lang.ast:37
 * @astdecl FunctionUse : Expression ::= Name:IdUse Parameter:Expression*;
 * @production FunctionUse : {@link Expression} ::= <span class="component">Name:{@link IdUse}</span> <span class="component">Parameter:{@link Expression}*</span>;

 */
public class FunctionUse extends Expression implements Cloneable {
  /**
   * @aspect NameAnalysis
   * @declaredat /mnt/c/Users/torth/.git/branches/lab3/a3-simplic/src/jastadd/NameAnalysis.jrag:117
   */
  public void checkNames(PrintStream err, SymbolTable symbols) {
    	getName().checkNames(err, symbols);
    	if(hasParameter()){
            for(int i = 0; i < getNumParameter(); i++){
        	    getParameter(i).checkNames(err, symbols);
        	}
        }
    }
  /**
   * @aspect PrettyPrint
   * @declaredat /mnt/c/Users/torth/.git/branches/lab3/a3-simplic/src/jastadd/PrettyPrint.jrag:183
   */
  public void prettyPrint(PrintStream out, String ind) {
		getName().prettyPrint(out, ind);
		out.print("(");
		if(hasParameter()){
				for(int i = 0; i < getNumParameter(); i++){
						getParameter(i).prettyPrint(out, ind);
						if(i - (getNumParameter()-1) > 0){
								out.print(", ");
						}
					}
			}
		out.print(")");
	}
  /**
   * @aspect Visitor
   * @declaredat /mnt/c/Users/torth/.git/branches/lab3/a3-simplic/src/jastadd/Visitor.jrag:119
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public FunctionUse() {
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
    name = {"Name", "Parameter"},
    type = {"IdUse", "List<Expression>"},
    kind = {"Child", "List"}
  )
  public FunctionUse(IdUse p0, List<Expression> p1) {
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
  public FunctionUse clone() throws CloneNotSupportedException {
    FunctionUse node = (FunctionUse) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public FunctionUse copy() {
    try {
      FunctionUse node = (FunctionUse) clone();
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
  public FunctionUse fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public FunctionUse treeCopyNoTransform() {
    FunctionUse tree = (FunctionUse) copy();
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
  public FunctionUse treeCopy() {
    FunctionUse tree = (FunctionUse) copy();
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
   * Replaces the Name child.
   * @param node The new node to replace the Name child.
   * @apilevel high-level
   */
  public FunctionUse setName(IdUse node) {
    setChild(node, 0);
    return this;
  }
  /**
   * Retrieves the Name child.
   * @return The current node used as the Name child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Name")
  public IdUse getName() {
    return (IdUse) getChild(0);
  }
  /**
   * Retrieves the Name child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Name child.
   * @apilevel low-level
   */
  public IdUse getNameNoTransform() {
    return (IdUse) getChildNoTransform(0);
  }
  /**
   * Replaces the Parameter list.
   * @param list The new list node to be used as the Parameter list.
   * @apilevel high-level
   */
  public FunctionUse setParameterList(List<Expression> list) {
    setChild(list, 1);
    return this;
  }
  /**
   * Retrieves the number of children in the Parameter list.
   * @return Number of children in the Parameter list.
   * @apilevel high-level
   */
  public int getNumParameter() {
    return getParameterList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Parameter list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Parameter list.
   * @apilevel low-level
   */
  public int getNumParameterNoTransform() {
    return getParameterListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Parameter list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Parameter list.
   * @apilevel high-level
   */
  public Expression getParameter(int i) {
    return (Expression) getParameterList().getChild(i);
  }
  /**
   * Check whether the Parameter list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasParameter() {
    return getParameterList().getNumChild() != 0;
  }
  /**
   * Append an element to the Parameter list.
   * @param node The element to append to the Parameter list.
   * @apilevel high-level
   */
  public FunctionUse addParameter(Expression node) {
    List<Expression> list = (parent == null) ? getParameterListNoTransform() : getParameterList();
    list.addChild(node);
    return this;
  }
  /** @apilevel low-level 
   */
  public FunctionUse addParameterNoTransform(Expression node) {
    List<Expression> list = getParameterListNoTransform();
    list.addChild(node);
    return this;
  }
  /**
   * Replaces the Parameter list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public FunctionUse setParameter(Expression node, int i) {
    List<Expression> list = getParameterList();
    list.setChild(node, i);
    return this;
  }
  /**
   * Retrieves the Parameter list.
   * @return The node representing the Parameter list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Parameter")
  public List<Expression> getParameterList() {
    List<Expression> list = (List<Expression>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameter list.
   * @apilevel low-level
   */
  public List<Expression> getParameterListNoTransform() {
    return (List<Expression>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the Parameter list without
   * triggering rewrites.
   */
  public Expression getParameterNoTransform(int i) {
    return (Expression) getParameterListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Parameter list.
   * @return The node representing the Parameter list.
   * @apilevel high-level
   */
  public List<Expression> getParameters() {
    return getParameterList();
  }
  /**
   * Retrieves the Parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameter list.
   * @apilevel low-level
   */
  public List<Expression> getParametersNoTransform() {
    return getParameterListNoTransform();
  }

}
