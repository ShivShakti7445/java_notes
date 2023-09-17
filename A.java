class B{
    private int value;   //data hidding
    public void value(int x) {
        value=  x;
        
    }
    public int value() {
        return value ;
        
    }
}
class A
{public static void main(String[] args) {
    B r=new B();
    r.value(100);
    System.out.print(r.value());
    
}

}