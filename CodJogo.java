package inicio;


public class CodJogo {
	
				
		Jogador jogador1;
		Jogador jogador2;
		Jogador jogador3;
		
		
		public void iniciarjogo() {		
			jogador1=new Jogador();
			jogador2=new Jogador();
			jogador3=new Jogador();
			
			
			boolean jogar1Acertou=false;
			boolean jogar2Acertou=false;
			boolean jogar3Acertou=false;
			
			int numeroAlvo=(int)(Math.random()*10);
			System.out.println("Estou pensando em um numero ente 0 a 9 \ntente adivinhar qual.\n");
			
			while(true) {
				
				
				
				System.out.print("o Jogador 1 ");jogador1.adivinhar();
				System.out.print("o Jogador 2 ");jogador2.adivinhar();
				System.out.print("o Jogador 3 ");jogador3.adivinhar();
				
				int respostaJogador1 = jogador1.numero;
				int respostaJogador2 = jogador2.numero;
				int respostaJogador3 = jogador3.numero;
				
				System.out.println("\n ");
				
				System.out.println("O jogador 1 forneceu o palpite:"+ respostaJogador1);
				System.out.println("O jogador 2 forneceu o palpite:"+ respostaJogador2);
				System.out.println("O jogador 3 forneceu o palpite:"+ respostaJogador3);
				
				System.out.println("\n ");
				
				if(respostaJogador1 == numeroAlvo) {
					jogar1Acertou=true;
				}
				if(respostaJogador2 == numeroAlvo) {
					jogar2Acertou=true;
					
				}
				if(respostaJogador3 == numeroAlvo) {
					jogar3Acertou=true;
					
				}
				
				if(jogar1Acertou || jogar2Acertou || jogar3Acertou) {
					
					System.out.println("Temos um vencedor! \n");
					System.out.println("\nO Numero a adivinhar era: "+ numeroAlvo+"\n");
					
					System.out.println("O Jogador 1 acertou?" + jogar1Acertou );
					System.out.println("O Jogador 2 acertou?" + jogar2Acertou );
					System.out.println("O Jogador 3 acertou?" + jogar3Acertou );
					
					break;
				}else {
					System.out.println("Todos erraram.\nOs Jogadores Terão Que Tentar Novamente\n");

			}
					
		}
			
	}
}
