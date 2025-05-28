import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        // Texto de entrada para testar
        String inputText = "HELLO WORLD";
        //String inputText = "HELLO WRONG"; // Para testar um caso que não deve imprimir

        System.out.println("Analisando input: \"" + inputText + "\"");

        // 1. Criar um CharStream a partir do texto de entrada
        CharStream inputCharStream = CharStreams.fromString(inputText);

        // 2. Criar um Lexer que processa o CharStream
        HelloWorldLexer lexer = new HelloWorldLexer(inputCharStream);

        // 3. Criar um buffer de tokens a partir do Lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 4. Criar um Parser que processa o buffer de tokens
        HelloWorldParser parser = new HelloWorldParser(tokens);

        // 5. Chamar a regra inicial da gramática (neste caso, 'program')
        // A ação {System.out.println("Hello World!!!");} será executada se a regra for correspondida.
        try {
            parser.program(); // Esta chamada irá disparar a análise e a ação na gramática
            System.out.println("Análise concluída com sucesso.");
        } catch (Exception e) {
            System.err.println("Erro durante a análise: " + e.getMessage());
            // ANTLR por padrão já imprime erros de sintaxe na consola,
            // mas você pode adicionar um ErrorListener customizado para um controle maior.
        }

        // Teste com outro input
        System.out.println("\nAnalisando input: \"HELLO WRONG WORLD\"");
        inputCharStream = CharStreams.fromString("HELLO WRONG WORLD");
        lexer = new HelloWorldLexer(inputCharStream);
        tokens = new CommonTokenStream(lexer);
        parser = new HelloWorldParser(tokens);
        try {
            parser.program(); // Aqui não deve imprimir "Hello World!!!"
            System.out.println("Análise concluída com sucesso."); // Pode não chegar aqui se houver erro de sintaxe
        } catch (Exception e) {
            System.err.println("Erro durante a análise: " + e.getMessage());
        }
        System.out.println("Fim do programa Java.");
    }
}