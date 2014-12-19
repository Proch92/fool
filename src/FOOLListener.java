// Generated from src/FOOL.g by ANTLR 4.1

import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FOOLParser}.
 */
public interface FOOLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FOOLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(@NotNull FOOLParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(@NotNull FOOLParser.DecContext ctx);

	/**
	 * Enter a parse tree produced by {@link FOOLParser#fatt}.
	 * @param ctx the parse tree
	 */
	void enterFatt(@NotNull FOOLParser.FattContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#fatt}.
	 * @param ctx the parse tree
	 */
	void exitFatt(@NotNull FOOLParser.FattContext ctx);

	/**
	 * Enter a parse tree produced by {@link FOOLParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull FOOLParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull FOOLParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link FOOLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull FOOLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull FOOLParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link FOOLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull FOOLParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull FOOLParser.ExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull FOOLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull FOOLParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link FOOLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull FOOLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull FOOLParser.ProgContext ctx);
}