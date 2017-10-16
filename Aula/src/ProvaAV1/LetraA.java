package ProvaAV1;

public class LetraA {
    
    public static void main(String[] args) {
        System.out.println("-----------A ordem dos vetores ão:-------------");
        int[] a = {6,19,18};
        int[] b = {9,11,12,20};
        int[] c = new int[a.length + b.length];
        int ab=0, pb=0, t;
        
        
        for(t = 0; t < c.length; t++) {
             if(ab == a.length) {
                c[t] = b[pb];
                pb++;
            }
            else if(pb == b.length) {
                c[t] = a[ab];
                ab++;
            }
            
            
             else if(a[ab] < b[pb]) {
                c[t] = a[ab];
                ab++;
            }
             
             
              else {
                c[t] = b[pb];
                pb++;
            }
        }
           for(int i = 0; i < c.length; i++) {
               
            System.out.println(+c[i]);
        }
    }
}
 
