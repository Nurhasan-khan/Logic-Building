package arrays;

class CanPlaceFlowers {
    public static void main(String[] args) {
        int []flowerbed = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed,1));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) return true;
        for (int i = 0; i<flowerbed.length; i++){
            if (flowerbed[i] == 0){
                if ((i == 0 || flowerbed[i-1] == 0)
                    && (flowerbed.length-1 == i || flowerbed[i+1] == 0)){
                        flowerbed[i] = 1;
                        n--;
                    }
            }
        }
         return n == 0;
        }
       
}