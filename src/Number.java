public class Number {
    public void setNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    private double number;

    public void maxMin(){
        double n1=(int)number/1;
        double n2=(int)((number-(int)number)*10);
        double n3=((int)((number-(int)number)*100))%10;
        if(n3<5){
            n3+=1;
        }

        double max=0;
        if (n1 > n2){
            max=n1;
        }
        else max=n2;
        if (max < n3) {
            max = n3;
        }
        System.out.println("max="+max);
        double min=0;
        if (n1 < n2){
            min=n1;
        }
        else min=n2;
        if (min > n3) {
            min = n3;
        }
        System.out.println("min="+min);
    }
}


