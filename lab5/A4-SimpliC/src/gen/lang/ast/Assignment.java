/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/lang.ast:10
 * @astdecl Assignment : Statement ::= IdUse:IdUse Expression:Expression;
 * @production Assignment : {@link Statement} ::= <span class="component">IdUse:{@link IdUse}</span> <span class="component">Expression:{@link Expression}</span>;

 */
public class Assignment extends Statement implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/Visitor.jrag:86
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/PrettyPrint.jrag:96
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind);
		getIdUse().prettyPrint(out, ind);
		out.print(" = ");
		getExpression().prettyPrint(out, ind);
		out.print(";");
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
    compatibleType_reset();
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
/** @apilevel internal */
protected boolean compatibleType_visited = false;
  /** @apilevel internal */
  private void compatibleType_reset() {
    compatibleType_computed = false;
    compatibleType_visited = false;
  }
  /** @apilevel internal */
  protected boolean compatibleType_computed = false;

  /** @apilevel internal */
  protected boolean compatibleType_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:98
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:98")
  public boolean compatibleType() {
    ASTState state = state();
    if (compatibleType_computed) {
      return compatibleType_value;
    }
    if (compatibleType_visited) {
      throw new RuntimeException("Circular definition of attribute Assignment.compatibleType().");
    }
    compatibleType_visited = true;
    state().enterLazyAttribute();
    compatibleType_value = compatibleType_compute();
    compatibleType_computed = true;
    state().leaveLazyAttribute();
    compatibleType_visited = false;
    return compatibleType_value;
  }
  /** @apilevel internal */
  private boolean compatibleType_compute() {
      return getExpression().expectedType().compatibleType(getExpression().type());
    }
  /**
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:78
   * @apilevel internal
   */
  public Type Define_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getExpressionNoTransform()) {
      // @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:81
      return intType();
    }
    else {
      return getParent().Define_expectedType(this, _callerNode);
    }
  }
  /**
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:78
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute expectedType
   */
  protected boolean canDefine_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:115
   * @apilevel internal
   */
  public boolean Define_isVariable(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getIdUseNoTransform()) {
      // @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:137
      return true;
    }
    else {
      return getParent().Define_isVariable(this, _callerNode);
    }
  }
  /**
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:115
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isVariable
   */
  protected boolean canDefine_isVariable(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:116
   * @apilevel internal
   */
  public boolean Define_isFunction(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getIdUseNoTransform()) {
      // @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:138
      return false;
    }
    else {
      return getParent().Define_isFunction(this, _callerNode);
    }
  }
  /**
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:116
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isFunction
   */
  protected boolean canDefine_isFunction(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:84
   * @apilevel internal
   */
  public boolean Define_inExpression(ASTNode _callerNode, ASTNode _childNode, IdDecl decl) {
    if (_callerNode == getIdUseNoTransform()) {
      // @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:87
      return getIdUse().getID() == decl.getID() || inExpression(decl);
    }
    else {
      return getParent().Define_inExpression(this, _callerNode, decl);
    }
  }
  /**
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:84
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute inExpression
   */
  protected boolean canDefine_inExpression(ASTNode _callerNode, ASTNode _childNode, IdDecl decl) {
    return true;
  }
  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/Errors.jrag:50
    if (!compatibleType()) {
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
    if (!compatibleType()) {
      collection.add(error("Assign type mistmatch!"));
    }
  }

}
