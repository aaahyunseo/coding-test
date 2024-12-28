public class Main {
    public static void main(String[] args){
        print_row("SHIP NAME","CLASS","DEPLOYMENT","IN SERVICE");
        print_row("N2 Bomber","Heavy Fighter","Limited","21");
        print_row("J-Type 327","Light Combat","Unlimited","1");
        print_row("NX Cruiser","Medium Fighter","Limited","18");
        print_row("N1 Starfighter","Medium Fighter","Unlimited","25");
        print_row("Royal Cruiser","Light Combat","Limited","4");
    }

    public static void print_row(String shipName, String className, String deployment, String inService){
        System.out.printf("%-15s%-15s%-11s%-10s\n",shipName,className,deployment,inService);
    }
}