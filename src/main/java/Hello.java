public class Hello {
    public static void main(String[] args) {
        Hello hello = new Hello();
        int a=2;
        int b=3;
        int c=4;
        int d=10;
        int e=5;
        b=hello.add(b,a);
        c=hello.sub(c,a);
        e=hello.mul(e,a);
        if(e==d){
            for (int i = 0; i < 2; i++) {
                b=hello.div(b,a);
            }
        }
    }

    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
