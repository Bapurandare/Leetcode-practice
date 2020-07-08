class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> Result = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i % 3==0 && i % 5==0){
                Result.add("FizzBuzz");
            } else if(i % 5==0){
                Result.add("Buzz");
            } else if(i % 3==0){
                Result.add("Fizz");
            } else {
                Result.add(Integer.toString(i));
            }
        }
        return Result;
    }
}
