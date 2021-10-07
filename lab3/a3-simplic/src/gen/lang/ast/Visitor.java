package lang.ast;

import java.io.PrintStream;
import java.util.Set;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/**
 * Visitor interface for SimpliC language. Each concrete node type must
 * have a visit method.
 * @ast interface
 * @aspect Visitor
 * @declaredat /mnt/c/Users/torth/documents/edan65/p003-william-anton/lab3/a3-simplic/src/jastadd/Visitor.jrag:6
 */
public interface Visitor {

		 
		public Object visit(List node, Object data);

		 
		public Object visit(Opt node, Object data);

		 
		public Object visit(Program node, Object data);

		 
		public Object visit(Function node, Object data);

		//public Object visit(Parameter node, Object data);
		 
		//public Object visit(Parameter node, Object data);
		public Object visit(Return node, Object data);


		 

		public Object visit(IfStatement node, Object data);

		 
		public Object visit(Else node, Object data);

		 
		public Object visit(WhileStatement node, Object data);

		 
		public Object visit(FunctionCall node, Object data);


		 

		public Object visit(LesserThan node, Object data);

		 
		public Object visit(GreaterThan node, Object data);

		 
		public Object visit(Equal node, Object data);

		 
		public Object visit(NotEqual node, Object data);

    	 
    	public Object visit(Declaration node, Object data);

		 
		public Object visit(Assignment node, Object data);


		 

		public Object visit(Add node, Object data);

		 
		public Object visit(Sub node, Object data);

		 
		public Object visit(Mul node, Object data);

		 
		public Object visit(Div node, Object data);

		 
		public Object visit(Mod node, Object data);


		 

		public Object visit(Numeral node, Object data);

		 
		public Object visit(IdDecl node, Object data);

		 
		public Object visit(IdUse node, Object data);

		 
		public Object visit(FunctionUse node, Object data);
}
