package algoritmos.increasingSequence;

/*
 * 
Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence 
by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing 
only one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
almostIncreasingSequence(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
almostIncreasingSequence(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get 
the strictly increasing sequence [1, 3].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer sequence

Guaranteed constraints:
2 ≤ sequence.length ≤ 105,
-105 ≤ sequence[i] ≤ 105.

[output] boolean

Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence, 
otherwise return false.

 * 
 */
public class IncreasingSequence {

	
	boolean almostIncreasingSequence(int[] seq) {
		int quantidadeElementosQuebramSequenciaCrescente = 0;		
		for(int s = 0; s < seq.length; s ++) {			
			//verifica se o próximo número existe e quebra a sequencia crescente
			try {//prevent index out of bounds exception
				if(seq[s+1] <= seq[s]) {
					quantidadeElementosQuebramSequenciaCrescente += 1;
				}
			}catch(Exception e) {System.out.println("não há mais números na sequência");}			
			try {
				//se os próximos dois números forem menores ou iguais ao atual, retornar false				
				if(seq[s+1] <= seq[s] && seq[s+2] <= seq[s] && s != 0) {
					return false;
				}									
			}catch(Exception e) {System.out.println("não há mais dois números");}					
		}						
		return (quantidadeElementosQuebramSequenciaCrescente > 1)? false: true;
	}	
}
