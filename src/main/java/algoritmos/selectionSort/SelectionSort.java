package algoritmos.selectionSort;

/*
 * 
Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue 
having an non-negative integer size. Since he likes to make things perfect, he wants to arrange 
them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. 
He may need some additional statues to be able to accomplish that. Help him figure out the minimum 
number of additional statues needed.

Example

For statues = [6, 2, 3, 8], the output should be
makeArrayConsecutive2(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer statues

An array of distinct non-negative integers.

Guaranteed constraints:
1 ≤ statues.length ≤ 10,
0 ≤ statues[i] ≤ 20.

[output] integer

The minimal number of statues that need to be added to existing statues such that it contains every 
integer size from an interval [L, R] (for some L, R) and no other sizes.


 * 
 */

public class SelectionSort {
	

	public int makeArrayConsecutive2(int[] statues) {		
		//antes da ordenação
		System.out.print("\nAntes da ordenação: \t");
		imprimeVetor(statues);
		//ordena o array
		int[] estatuasOrdenadas = ordenarArray(statues);		
		//depois da ordenação
		System.out.print("\nDepois da ordenação: \t");
		imprimeVetor(estatuasOrdenadas);		
		//conta a quantidade de estátuas adicionais
		return contarEstatuasAdicionais(estatuasOrdenadas); 
	}
/*

Vamos ordenar pelo método Selection Sort

Este algoritmo é baseado em se passar sempre o menor valor do vetor para a primeira posição 
(ou o maior dependendo da ordem requerida), depois o segundo menor valor para a segunda posição e 
assim sucessivamente, até os últimos dois elementos.

 */	
	private int[] ordenarArray(int[] statues) {		
		for (int s = 0; s < statues.length; s ++) {			
			//encontra o índice do menor valor
			int indiceMenorValor = indiceMenorNumero(statues, s);
			//guarda o valor do vetor que está no índice que está sendo avaliado
			int espacoTemporario = statues[s];
			//substitui o valor do vetor que está sendo avaliado pelo menor valor do vetor depois daquele índice
			statues[s] = statues[indiceMenorValor];
			//preenche o lugar que era ocupado pelo menor valor
			statues[indiceMenorValor] = espacoTemporario;			
		}		
		return statues;
	}	
	private int indiceMenorNumero(int[] array, int indiceInicial) {		
		int indiceMenorNumero = indiceInicial;
		int menorNumero = array[indiceMenorNumero];
		for(int i = 0; i < array.length; i++) {			
			int valor = array[i];
			if(i >= indiceInicial) {				
				if(valor < menorNumero) {
					menorNumero = valor;
					indiceMenorNumero = i;
				}
			}			
		}
		return indiceMenorNumero;		
	}	
	private int contarEstatuasAdicionais(int[] estatuasOrdenadas) {		
		int estatuasAdicionais = 0;		
		//vreifica se o tamanho do vetor é maior que 1
		if(estatuasOrdenadas.length > 1) {
			for(int e = 0; e < estatuasOrdenadas.length; e++) {				
				//verifica se não está no último indice do vetor
				if(e < estatuasOrdenadas.length - 1) {
					estatuasAdicionais += (estatuasOrdenadas[e + 1] - estatuasOrdenadas[e] - 1);
				}				
			}
		}		
		System.out.println("\nNúmero de estátuas adicionais: " + estatuasAdicionais);
		return estatuasAdicionais;		
	}	
	private void imprimeVetor(int[] v) {		
		System.out.print("[");
		for(int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			if( i < (v.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.print("]");		
	}
}
