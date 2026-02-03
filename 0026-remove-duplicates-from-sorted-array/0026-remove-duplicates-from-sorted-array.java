class Solution {

    public int removeDuplicates(int[] nums) {

        int officer = 0;
        int nunique = 1;
        int cm = 1;
        int n = nums.length ;

        while (cm < n) {
            if (nums[cm] == nums[cm - 1]) { //isme check kiya ki cm jis element pe khada hai and usse phele wala equal hai ke nahi agar  eual hai toh cm ko aage badha do 
                cm++;
                continue ;
            }
            //fir officer + 1 place pe cm ke element ko betha do agar vo unique ho toh 
            nums[officer + 1] = nums[cm] ;
            officer++ ;
            nunique++ ;
            cm++ ;
        }
        return nunique ;

    }
}
