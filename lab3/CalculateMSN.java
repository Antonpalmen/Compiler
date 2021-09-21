package lang;

import lang.ast.*;


class CalculateMSN extends TraversingVisitor {
  static int currentDepth;
  static int maxDepth;

  public static int result(Program root) {
    currentDepth = 0;
    maxDepth = 0;
    CalculateMSN msn = new CalculateMSN();
    root.accept(msn, null);
    return maxDepth;
  }

  public Object visit(Function node, Object data) {
    currentDepth++;
    super.visit(node, data);
    if (currentDepth > maxDepth) {
      maxDepth = currentDepth;
    }
    currentDepth--;
    return null;
	}

  public Object visit(IfStatement node, Object data) {
    currentDepth++;
    super.visit(node, data);
    if (currentDepth > maxDepth) {
      maxDepth = currentDepth;
    }
    currentDepth--;
    return null;
	}

  public Object visit(WhileStatement node, Object data) {
    currentDepth++;
    super.visit(node, data);
    if (currentDepth > maxDepth) {
      maxDepth = currentDepth;
    }
    currentDepth--;
    return null;
	}
}
