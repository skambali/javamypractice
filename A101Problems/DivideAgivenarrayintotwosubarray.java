package A101Problems;

public class DivideAgivenarrayintotwosubarray {
	
	/*Are you sorting your subset into decending order or ascending order?

Think about it like this, the array {1, 3, 5, 8, 9, 25}

if you were to divide, you would have {1,8,9} =18 {3,5,25} =33

If it were sorted into descending order it would work out a lot better

{25,1}=26 {9,8,5,3}=25

So your solution is basically correct, it just needs to make sure to take the largest values first.

EDIT: Read tskuzzy's post. Mine does not work

sort the array
Take the first 2 elements..consider them as 2 sets (each having 1 element)
Take the next element from the array.
Now decide into which set should this element go (by computing the sum..it should be minimum)
repeat
*
*http://stackoverflow.com/questions/6597180/divide-an-array-into-two-sets-with-minimal-difference
*/
	
	
	/*Divide a given array into two subarray (not necessary to be continuous) such that difference
	between sum of both array is minimum. */

}
