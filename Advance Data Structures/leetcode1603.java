class leetcode1603 {
    public leetcode1603(int big, int medium, int small) {
      count = new int[] {big, medium, small};
    }
  
    public boolean addCar(int carType) {
      return count[carType - 1]-- > 0;
    }
  
    private int[] count;
  }