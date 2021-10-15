/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/lang.ast:9
 * @astdecl Declaration : Statement ::= IdDecl:IdDecl [Assignment:Expression];
 * @production Declaration : {@link Statement} ::= <span class="component">IdDecl:{@link IdDecl}</span> <span class="component">[Assignment:{@link Expression}]</span>;

 */
public class Declaration extends Statement implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/Visitor.jrag:83
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/PrettyPrint.jrag:86
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
    compatibleType_reset();
    localLookup_String_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();

  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public Declaration clone() throws CloneNotSupportedException {
    Declaration node = (Declaration) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
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
   * @declaredat ASTNode:63
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
   * @declaredat ASTNode:73
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
   * @declaredat ASTNode:93
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
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:91
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:91")
  public boolean compatibleType() {
    ASTState state = state();
    if (compatibleType_computed) {
      return compatibleType_value;
    }
    if (compatibleType_visited) {
      throw new RuntimeException("Circular definition of attribute Declaration.compatibleType().");
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
      if(hasAssignment()){
        return getAssignment().expectedType().compatibleType(getAssignment().type());
      }
      return true;
    }
/** @apilevel internal */
protected java.util.Set localLookup_String_visited;
  /** @apilevel internal */
  private void localLookup_String_reset() {
    localLookup_String_values = null;
    localLookup_String_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map localLookup_String_values;

  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:66
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:66")
  public IdDecl localLookup(String name) {
    Object _parameters = name;
    if (localLookup_String_visited == null) localLookup_String_visited = new java.util.HashSet(4);
    if (localLookup_String_values == null) localLookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (localLookup_String_values.containsKey(_parameters)) {
      return (IdDecl) localLookup_String_values.get(_parameters);
    }
    if (localLookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Declaration.localLookup(String).");
    }
    localLookup_String_visited.add(_parameters);
    state().enterLazyAttribute();
    IdDecl localLookup_String_value = localLookup_compute(name);
    localLookup_String_values.put(_parameters, localLookup_String_value);
    state().leaveLazyAttribute();
    localLookup_String_visited.remove(_parameters);
    return localLookup_String_value;
  }
  /** @apilevel internal */
  private IdDecl localLookup_compute(String name) {
  			return getIdDecl().getID().equals(name) ? getIdDecl() : unknownDecl();
  		}
  /**
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:78
   * @apilevel internal
   */
  public Type Define_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getAssignmentOptNoTransform()) {
      // @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:80
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
    if (_callerNode == getIdDeclNoTransform()) {
      // @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:140
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
    if (_callerNode == getIdDeclNoTransform()) {
      // @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:141
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
  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/Errors.jrag:58
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
      collection.add(error("Declaration type mistmatch!"));
    }
  }

}
