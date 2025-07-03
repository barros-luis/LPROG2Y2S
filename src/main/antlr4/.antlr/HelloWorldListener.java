// Generated from /Users/andreianeves/luisinho/trabalho/LPROG2Y2S/src/main/antlr4/HelloWorld.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloWorldParser}.
 */
public interface HelloWorldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloWorldParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HelloWorldParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWorldParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HelloWorldParser.ProgramContext ctx);
}