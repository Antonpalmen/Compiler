/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/lang.ast:10
 * @astdecl Else : Statement ::= Statement*;
 * @production Else : {@link Statement} ::= <span class="component">{@link Statement}*</span>;

 */
public class Else extends Statement implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/PrettyPrint.jrag:77
   */
  public void prettyPrint(PrintStream out, String ind) {
		if(hasStatement()) {
			for(int i = 0; i < getNumStatement(); i++){
				getStatement(i).prettyPrint(out, ind + "	");
				out.println();
			}
		} else {
			out.println();
			}
}
  /**
   * @aspect Visitor
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/Visitor.jrag:64
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Else() {
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
    setChild(new List(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Statement"},
    type = {"List<Statement>"},
    kind = {"List"}
  )
  public Else(List<Statement> p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 1;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    localLookup_String_int_reset();
    lookup_String_reset();
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
  public Else clone() throws CloneNotSupportedException {
    Else node = (Else) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public Else copy() {
    try {
      Else node = (Else) clone();
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
  public Else fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public Else treeCopyNoTransform() {
    Else tree = (Else) copy();
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
  public Else treeCopy() {
    Else tree = (Else) copy();
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
   * Replaces the Statement list.
   * @param list The new list node to be used as the Statement list.
   * @apilevel high-level
   */
  public Else setStatementList(List<Statement> list) {
    setChild(list, 0);
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
  public Else addStatement(Statement node) {
    List<Statement> list = (parent == null) ? getStatementListNoTransform() : getStatementList();
    list.addChild(node);
    return this;
  }
  /** @apilevel low-level 
   */
  public Else addStatementNoTransform(Statement node) {
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
  public Else setStatement(Statement node, int i) {
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
    List<Statement> list = (List<Statement>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Statement list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Statement list.
   * @apilevel low-level
   */
  public List<Statement> getStatementListNoTransform() {
    return (List<Statement>) getChildNoTransform(0);
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
/** @apilevel internal */
protected java.util.Set localLookup_String_int_visited;
  /** @apilevel internal */
  private void localLookup_String_int_reset() {
    localLookup_String_int_values = null;
    localLookup_String_int_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map localLookup_String_int_values;

  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/NameAnalysis.jrag:61
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/NameAnalysis.jrag:61")
  public IdDecl localLookup(String name, int index) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(name);
    _parameters.add(index);
    if (localLookup_String_int_visited == null) localLookup_String_int_visited = new java.util.HashSet(4);
    if (localLookup_String_int_values == null) localLookup_String_int_values = new java.util.HashMap(4);
    ASTState state = state();
    if (localLookup_String_int_values.containsKey(_parameters)) {
      return (IdDecl) localLookup_String_int_values.get(_parameters);
    }
    if (localLookup_String_int_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Else.localLookup(String,int).");
    }
    localLookup_String_int_visited.add(_parameters);
    state().enterLazyAttribute();
    IdDecl localLookup_String_int_value = localLookup_compute(name, index);
    localLookup_String_int_values.put(_parameters, localLookup_String_int_value);
    state().leaveLazyAttribute();
    localLookup_String_int_visited.remove(_parameters);
    return localLookup_String_int_value;
  }
  /** @apilevel internal */
  private IdDecl localLookup_compute(String name, int index) {
          for(int i = 0; i <= index; i++) {
              IdDecl decl = getStatement(index).localLookup(name);
              if(!decl.isUnknown()) {
                  return decl;
              }
          }
  
          return unknownDecl();
      }
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/NameAnalysis.jrag:49
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/NameAnalysis.jrag:49")
  public IdDecl lookup(String name) {
    Object _parameters = name;
    if (lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_values == null) lookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (lookup_String_values.containsKey(_parameters)) {
      return (IdDecl) lookup_String_values.get(_parameters);
    }
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Else.lookup(String).");
    }
    lookup_String_visited.add(_parameters);
    state().enterLazyAttribute();
    IdDecl lookup_String_value = getParent().Define_lookup(this, null, name);
    lookup_String_values.put(_parameters, lookup_String_value);
    state().leaveLazyAttribute();
    lookup_String_visited.remove(_parameters);
    return lookup_String_value;
  }
/** @apilevel internal */
protected java.util.Set lookup_String_visited;
  /** @apilevel internal */
  private void lookup_String_reset() {
    lookup_String_values = null;
    lookup_String_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map lookup_String_values;

  /**
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/NameAnalysis.jrag:19
   * @apilevel internal
   */
  public IdDecl Define_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (_callerNode == getStatementListNoTransform()) {
      // @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/NameAnalysis.jrag:76
      int index = _callerNode.getIndexOfChild(_childNode);
      {
              IdDecl decl = localLookup(name, index);
              return !decl.isUnknown() ? decl : lookup(name);
          }
    }
    else {
      return getParent().Define_lookup(this, _callerNode, name);
    }
  }
  /**
   * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab4/a4-simplic/src/jastadd/NameAnalysis.jrag:19
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute lookup
   */
  protected boolean canDefine_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    return true;
  }

}
