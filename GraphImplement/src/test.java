class test {
    public static void main(String[] args) {
        ans(5);
    }
    private static void ans(int n){
        if(n <= 0){
            return;
        }
        System.out.println(n);
        ans(--n);
    }
}