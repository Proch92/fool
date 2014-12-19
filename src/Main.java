import java.io.*;
import org.antlr.runtime.*;

public class Main {
	public static void main(String[] args) {
		String fileName = "prova.fool";
		
		ANTLRFileStream input = new ANTLRFileStream(fileName);
		FOOLLexer lexer = new FOOLLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		FOOLParser parser = new FOOLParser(tokens);
		
		Node ast = parser.prog();
		System.out.println( (ast.typeCheck()).toPrint("") );
		String code=ast.codeGeneration();
		
		FileWriter fstream = new FileWriter(fileName+".asm");
		BufferedWriter out = new BufferedWriter(fstream);
		out.write(code);
		out.close();
		
		SVMLexer lex = new SVMLexer(new ANTLRFileStream(fileName+".asm"));
		CommonTokenStream tokensVM = new CommonTokenStream(lex);
		SVMParser parserVM = new SVMParser(tokensVM);
		
		ExecuteVM vm = new ExecuteVM(parserVM.createCode());
		vm.cpu();
	}
}
