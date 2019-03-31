package kyu7;

public class Dinglemouse {

    public static int tvRemote(final String word) {

        int result = 0;
        int x = 0, y = 0, index = 0, x1 = 0, y1 = 0;
        String s = "abcde123fghij456klmno789pqrst.@0uvwxyz_/0";

        for (char ch : word.toCharArray()) {
            index = s.indexOf(ch);
            x1 = index % 8;
            y1 = index / 8;
            result += Math.abs(x - x1) + Math.abs(y - y1) + 1; // + 1 for the OK button
            x = x1;
            y = y1;
        }
        return result;
    }
}

//My TV remote control has arrow buttons and an OK button.
//
//I can use these to move a "cursor" on a logical screen keyboard to type words...
//
//The screen "keyboard" layout looks like this
//
//a	b	c	d	e	1	2	3
//f	g	h	i	j	4	5	6
//k	l	m	n	o	7	8	9
//p	q	r	s	t	.	@	0
//u	v	w	x	y	z	_	/
//Kata task
//How many button presses on my remote are required to type a given word?
//
//Notes
//The cursor always starts on the letter a (top left)
//
//Remember to also press OK to "accept" each letter.
//
//Take a direct route from one letter to the next
//
//The cursor does not wrap (e.g. you cannot leave one edge and reappear on the opposite edge)
//
//Example
//word = codewars
//
//c => a-b-c-OK = 3
//o => c-d-e-j-o-OK = 5
//d => o-j-e-d-OK = 4
//e => d-e-OK = 2
//w => e-j-o-t-y-x-w-OK = 7
//a => w-r-m-h-c-b-a-OK = 7
//r => a-f-k-p-q-r-OK = 6
//s => r-s-OK = 2
//Answer = 3 + 5 + 4 + 2 + 7 + 7 + 6 + 2 = 36
