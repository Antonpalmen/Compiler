/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/lang.ast:37
 * @astdecl FunctionUse : Expression ::= IdUse:IdUse Parameter:Expression*;
 * @production FunctionUse : {@link Expression} ::= <span class="component">IdUse:{@link IdUse}</span> <span class="component">Parameter:{@link Expression}*</span>;

 */
public class FunctionUse extends Expression implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/PrettyPrint.jrag:174
   */
  public void prettyPrint(PrintStream out, String ind) {
		getIdUse().prettyPrint(out, ind);
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
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/Visitor.jrag:112
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
    name = {"IdUse", "Parameter"},
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
    type_reset();
    isFunction_reset();
    correctNumParameter_reset();
    correctTypeParameter_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public FunctionUse clone() throws CloneNotSupportedException {
    FunctionUse node = (FunctionUse) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
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
   * @declaredat ASTNode:65
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
   * @declaredat ASTNode:75
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
   * @declaredat ASTNode:95
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
   * Replaces the IdUse child.
   * @param node The new node to replace the IdUse child.
   * @apilevel high-level
   */
  public FunctionUse setIdUse(IdUse node) {
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
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/TypeAnalysis.jrag:73
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/TypeAnalysis.jrag:4")
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
    type_value = getIdUse().type();
    type_computed = true;
    state().leaveLazyAttribute();
    type_visited = false;
    return type_value;
  }
/** @apilevel internal */
protected boolean isFunction_visited = false;
  /** @apilevel internal */
  private void isFunction_reset() {
    isFunction_computed = false;
    isFunction_visited = false;
  }
  /** @apilevel internal */
  protected boolean isFunction_computed = false;

  /** @apilevel internal */
  protected boolean isFunction_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/TypeAnalysis.jrag:119
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/TypeAnalysis.jrag:119")
  public boolean isFunction() {
    ASTState state = state();
    if (isFunction_computed) {
      return isFunction_value;
    }
    if (isFunction_visited) {
      throw new RuntimeException("Circular definition of attribute FunctionUse.isFunction().");
    }
    isFunction_visited = true;
    state().enterLazyAttribute();
    isFunction_value = isFunction_compute();
    isFunction_computed = true;
    state().leaveLazyAttribute();
    isFunction_visited = false;
    return isFunction_value;
  }
  /** @apilevel internal */
  private boolean isFunction_compute() {
    IdDecl dec = getIdUse().decl();
      if(!dec.isUnknown()){
        return dec.isFunction();
      }
      return true;
    }
/** @apilevel internal */
protected boolean correctNumParameter_visited = false;
  /** @apilevel internal */
  private void correctNumParameter_reset() {
    correctNumParameter_computed = false;
    correctNumParameter_visited = false;
  }
  /** @apilevel internal */
  protected boolean correctNumParameter_computed = false;

  /** @apilevel internal */
  protected boolean correctNumParameter_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/TypeAnalysis.jrag:152
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/TypeAnalysis.jrag:152")
  public boolean correctNumParameter() {
    ASTState state = state();
    if (correctNumParameter_computed) {
      return correctNumParameter_value;
    }
    if (correctNumParameter_visited) {
      throw new RuntimeException("Circular definition of attribute FunctionUse.correctNumParameter().");
    }
    correctNumParameter_visited = true;
    state().enterLazyAttribute();
    correctNumParameter_value = getNumParameter() == getIdUse().decl().function().getNumParameter();
    correctNumParameter_computed = true;
    state().leaveLazyAttribute();
    correctNumParameter_visited = false;
    return correctNumParameter_value;
  }
/** @apilevel internal */
protected boolean correctTypeParameter_visited = false;
  /** @apilevel internal */
  private void correctTypeParameter_reset() {
    correctTypeParameter_computed = false;
    correctTypeParameter_visited = false;
  }
  /** @apilevel internal */
  protected boolean correctTypeParameter_computed = false;

  /** @apilevel internal */
  protected boolean correctTypeParameter_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/TypeAnalysis.jrag:155
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/TypeAnalysis.jrag:155")
  public boolean correctTypeParameter() {
    ASTState state = state();
    if (correctTypeParameter_computed) {
      return correctTypeParameter_value;
    }
    if (correctTypeParameter_visited) {
      throw new RuntimeException("Circular definition of attribute FunctionUse.correctTypeParameter().");
    }
    correctTypeParameter_visited = true;
    state().enterLazyAttribute();
    correctTypeParameter_value = correctTypeParameter_compute();
    correctTypeParameter_computed = true;
    state().leaveLazyAttribute();
    correctTypeParameter_visited = false;
    return correctTypeParameter_value;
  }
  /** @apilevel internal */
  private boolean correctTypeParameter_compute() {
      if(hasParameter()){
        for(int i = 0; i < getNumParameter(); i++){
         if(!getParameter(i).type().compatibleType(intType())){
          return false;
         }
        }
      }
      return true;
    }
  /**
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/TypeAnalysis.jrag:129
   * @apilevel internal
   */
  public boolean Define_functionExpected(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getIdUseNoTransform()) {
      // @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/TypeAnalysis.jrag:127
      return true;
    }
    else {
      return getParent().Define_functionExpected(this, _callerNode);
    }
  }
  /**
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/TypeAnalysis.jrag:129
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute functionExpected
   */
  protected boolean canDefine_functionExpected(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }

}
