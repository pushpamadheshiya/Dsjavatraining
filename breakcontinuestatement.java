public class breakcontinuestatement {
    public static void main(String[] args) {
        //break statement
        for(int i=1;i<=10;i++){
            if(i==7){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();

        //continue statement
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();

        //Print even by continue statement
        for(int i=1;i<=10;i++){

        if(i%2!=0){
            continue;
        
        
        }
        System.out.print(i+" ");
    }


    System.out.println();

    for(int i=1;i<10;i++){
        if(i%2==0){
            System.out.println("even no"+i+" ");
        }
        else{
            continue;
            //System.out.println("odd no"+i);
        
        }
    }
}


    
}
