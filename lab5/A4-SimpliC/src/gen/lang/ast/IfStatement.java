/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/lang.ast:11
 * @astdecl IfStatement : Statement ::= Condition:Expression Then:Block [Else:Block];
 * @production IfStatement : {@link Statement} ::= <span class="component">Condition:{@link Expression}</span> <span class="component">Then:{@link Block}</span> <span class="component">[Else:{@link Block}]</span>;

 */
public class IfStatement extends Statement implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/Visitor.jrag:59
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/PrettyPrint.jrag:49
   */
  public void prettyPrint(PrintStream out, String ind) {
			out.print("if(");
			getCondition().prettyPrint(out,ind);
			out.print(")");
			getThen().prettyPrint(out,ind);
			if (hasElse()){
				out.print("else");
				getElse().prettyPrint(out,ind);
			}
	}
  /**
   * @declaredat ASTNode:1
   */
  public IfStatement() {
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
    children = new ASTNode[3];
    setChild(new Opt(), 2);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Condition", "Then", "Else"},
    type = {"Expression", "Block", "Opt<Block>"},
    kind = {"Child", "Child", "Opt"}
  )
  public IfStatement(Expression p0, Block p1, Opt<Block> p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:25
   */
  protected int numChildren() {
    return 3;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:29
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    compatibleType_reset();
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
  public IfStatement clone() throws CloneNotSupportedException {
    IfStatement node = (IfStatement) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public IfStatement copy() {
    try {
      IfStatement node = (IfStatement) clone();
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
  public IfStatement fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public IfStatement treeCopyNoTransform() {
    IfStatement tree = (IfStatement) copy();
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
  public IfStatement treeCopy() {
    IfStatement tree = (IfStatement) copy();
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
   * Replaces the Condition child.
   * @param node The new node to replace the Condition child.
   * @apilevel high-level
   */
  public IfStatement setCondition(Expression node) {
    setChild(node, 0);
    return this;
  }
  /**
   * Retrieves the Condition child.
   * @return The current node used as the Condition child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Condition")
  public Expression getCondition() {
    return (Expression) getChild(0);
  }
  /**
   * Retrieves the Condition child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Condition child.
   * @apilevel low-level
   */
  public Expression getConditionNoTransform() {
    return (Expression) getChildNoTransform(0);
  }
  /**
   * Replaces the Then child.
   * @param node The new node to replace the Then child.
   * @apilevel high-level
   */
  public IfStatement setThen(Block node) {
    setChild(node, 1);
    return this;
  }
  /**
   * Retrieves the Then child.
   * @return The current node used as the Then child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Then")
  public Block getThen() {
    return (Block) getChild(1);
  }
  /**
   * Retrieves the Then child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Then child.
   * @apilevel low-level
   */
  public Block getThenNoTransform() {
    return (Block) getChildNoTransform(1);
  }
  /**
   * Replaces the optional node for the Else child. This is the <code>Opt</code>
   * node containing the child Else, not the actual child!
   * @param opt The new node to be used as the optional node for the Else child.
   * @apilevel low-level
   */
  public IfStatement setElseOpt(Opt<Block> opt) {
    setChild(opt, 2);
    return this;
  }
  /**
   * Replaces the (optional) Else child.
   * @param node The new node to be used as the Else child.
   * @apilevel high-level
   */
  public IfStatement setElse(Block node) {
    getElseOpt().setChild(node, 0);
    return this;
  }
  /**
   * Check whether the optional Else child exists.
   * @return {@code true} if the optional Else child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasElse() {
    return getElseOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Else child.
   * @return The Else child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Block getElse() {
    return (Block) getElseOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Else child. This is the <code>Opt</code> node containing the child Else, not the actual child!
   * @return The optional node for child the Else child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Else")
  public Opt<Block> getElseOpt() {
    return (Opt<Block>) getChild(2);
  }
  /**
   * Retrieves the optional node for child Else. This is the <code>Opt</code> node containing the child Else, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Else.
   * @apilevel low-level
   */
  public Opt<Block> getElseOptNoTransform() {
    return (Opt<Block>) getChildNoTransform(2);
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
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:106
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:106")
  public boolean compatibleType() {
    ASTState state = state();
    if (compatibleType_computed) {
      return compatibleType_value;
    }
    if (compatibleType_visited) {
      throw new RuntimeException("Circular definition of attribute IfStatement.compatibleType().");
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
      return getCondition().expectedType().compatibleType(getCondition().type());
    }
  /**
   * @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:78
   * @apilevel internal
   */
  public Type Define_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getConditionNoTransform()) {
      // @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:83
      return boolType();
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
  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /Users/antonpalmen/github/p003-william-anton/lab4/A4-SimpliC/src/jastadd/Errors.jrag:62
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
      collection.add(error("If condition type mistmatch!"));
    }
  }

}
