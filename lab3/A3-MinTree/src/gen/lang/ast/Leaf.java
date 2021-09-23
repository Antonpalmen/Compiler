/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.5 */
package lang.ast;
import java.io.PrintStream;
/**
 * @ast node
 * @declaredat /mnt/c/Users/torth/documents/a3-mintree/src/jastadd/Lang.ast:5
 * @astdecl Leaf : Node ::= <Number:int>;
 * @production Leaf : {@link Node} ::= <span class="component">&lt;Number:{@link int}&gt;</span>;

 */
public class Leaf extends Node implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /mnt/c/Users/torth/documents/a3-mintree/src/jastadd/PrettyPrint.jadd:27
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind);
		if(isMinValue()) {
			out.println("*** MINIMUM ***");
		} else {
			out.println("Leaf " + getNumber());
		}
	}
  /**
   * @declaredat ASTNode:1
   */
  public Leaf() {
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
  }
  /**
   * @declaredat ASTNode:12
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Number"},
    type = {"int"},
    kind = {"Token"}
  )
  public Leaf(int p0) {
    setNumber(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 0;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:25
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    localMin_reset();
    isMinValue_reset();
    nbrOfMinValues_reset();
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
  public Leaf clone() throws CloneNotSupportedException {
    Leaf node = (Leaf) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public Leaf copy() {
    try {
      Leaf node = (Leaf) clone();
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
  public Leaf fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public Leaf treeCopyNoTransform() {
    Leaf tree = (Leaf) copy();
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
  public Leaf treeCopy() {
    Leaf tree = (Leaf) copy();
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
   * Replaces the lexeme Number.
   * @param value The new value for the lexeme Number.
   * @apilevel high-level
   */
  public Leaf setNumber(int value) {
    tokenint_Number = value;
    return this;
  }
  /** @apilevel internal 
   */
  protected int tokenint_Number;
  /**
   * Retrieves the value for the lexeme Number.
   * @return The value for the lexeme Number.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Number")
  public int getNumber() {
    return tokenint_Number;
  }
/** @apilevel internal */
protected boolean localMin_visited = false;
  /** @apilevel internal */
  private void localMin_reset() {
    localMin_computed = false;
    localMin_visited = false;
  }
  /** @apilevel internal */
  protected boolean localMin_computed = false;

  /** @apilevel internal */
  protected int localMin_value;

  /**
   * @attribute syn
   * @aspect MinValue
   * @declaredat /mnt/c/Users/torth/documents/a3-mintree/src/jastadd/MinValue.jrag:5
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="MinValue", declaredAt="/mnt/c/Users/torth/documents/a3-mintree/src/jastadd/MinValue.jrag:3")
  public int localMin() {
    ASTState state = state();
    if (localMin_computed) {
      return localMin_value;
    }
    if (localMin_visited) {
      throw new RuntimeException("Circular definition of attribute Node.localMin().");
    }
    localMin_visited = true;
    state().enterLazyAttribute();
    localMin_value = getNumber();
    localMin_computed = true;
    state().leaveLazyAttribute();
    localMin_visited = false;
    return localMin_value;
  }
/** @apilevel internal */
protected boolean isMinValue_visited = false;
  /** @apilevel internal */
  private void isMinValue_reset() {
    isMinValue_computed = false;
    isMinValue_visited = false;
  }
  /** @apilevel internal */
  protected boolean isMinValue_computed = false;

  /** @apilevel internal */
  protected boolean isMinValue_value;

  /**
   * @attribute syn
   * @aspect MinValue
   * @declaredat /mnt/c/Users/torth/documents/a3-mintree/src/jastadd/MinValue.jrag:20
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="MinValue", declaredAt="/mnt/c/Users/torth/documents/a3-mintree/src/jastadd/MinValue.jrag:20")
  public boolean isMinValue() {
    ASTState state = state();
    if (isMinValue_computed) {
      return isMinValue_value;
    }
    if (isMinValue_visited) {
      throw new RuntimeException("Circular definition of attribute Leaf.isMinValue().");
    }
    isMinValue_visited = true;
    state().enterLazyAttribute();
    isMinValue_value = isMinValue_compute();
    isMinValue_computed = true;
    state().leaveLazyAttribute();
    isMinValue_visited = false;
    return isMinValue_value;
  }
  /** @apilevel internal */
  private boolean isMinValue_compute() {
  		return getNumber() == globalMin();
  	}
/** @apilevel internal */
protected boolean nbrOfMinValues_visited = false;
  /** @apilevel internal */
  private void nbrOfMinValues_reset() {
    nbrOfMinValues_computed = false;
    nbrOfMinValues_visited = false;
  }
  /** @apilevel internal */
  protected boolean nbrOfMinValues_computed = false;

  /** @apilevel internal */
  protected int nbrOfMinValues_value;

  /**
   * @attribute syn
   * @aspect MinValue
   * @declaredat /mnt/c/Users/torth/documents/a3-mintree/src/jastadd/MinValue.jrag:34
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="MinValue", declaredAt="/mnt/c/Users/torth/documents/a3-mintree/src/jastadd/MinValue.jrag:28")
  public int nbrOfMinValues() {
    ASTState state = state();
    if (nbrOfMinValues_computed) {
      return nbrOfMinValues_value;
    }
    if (nbrOfMinValues_visited) {
      throw new RuntimeException("Circular definition of attribute Node.nbrOfMinValues().");
    }
    nbrOfMinValues_visited = true;
    state().enterLazyAttribute();
    nbrOfMinValues_value = nbrOfMinValues_compute();
    nbrOfMinValues_computed = true;
    state().leaveLazyAttribute();
    nbrOfMinValues_visited = false;
    return nbrOfMinValues_value;
  }
  /** @apilevel internal */
  private int nbrOfMinValues_compute() {
          if(localMin() == globalMin())
              return 1;
          return 0;
      }

}
