package principal;

record MyClass(int id, String name){
    static int rate;
    public int getRate(){
        return rate;
    }
}
