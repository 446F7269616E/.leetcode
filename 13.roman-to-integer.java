/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char x[] = s.toCharArray();
        int before = 0;
        int after = 1;
        int value = switch (x[before]) {
        case 'I' -> 1;
        case 'V' -> 5;
        case 'X' -> 10;
        case 'L' -> 50;
        case 'C' -> 100;
        case 'D' -> 500;
        case 'M' -> 1000;
        default -> 0;
    };
        while (after <= x.length){
            if((x[after] == 'V'&& x[before] == 'I')||(x[after] == 'I'&& x[before] == 'V')){
                result += before -1;
            }
            else{result += before;}
            before++;
            after++;
        }
        return result;
    }
}
// @lc code=end

