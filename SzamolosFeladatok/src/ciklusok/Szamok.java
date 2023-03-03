package ciklusok;

public class Szamok {
    public static void main(String[] args) {
        
        //boolean ismetel = true;
        System.out.print("Ismétléssel (i/n): ");
        String v = sc.next();
        boolean ismetel = v.equals("i");
        int ismDb =0, ismNlkDb = 0;
        for (int k = 2; k <=4; k++){
            for (int j =2; j <=4; j++){
                for (int i =2; i <=4; i++){
                    if(ismetel){
                        System.out.printf("%d%d%d\n", k, j, i);
                    }else if(k!=j && k!=i && j!=i){
                        System.out.printf("%d%d%d\n", k, j, i);
                    } 
                }
            }
        }
    }
}
