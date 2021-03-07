/* Contoh pengoperasian variabel bertype dasar */
public class Oprator {
    /**
    * @param args
    */
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    /* Kamus */
    boolean Bool1, Bool2, TF ; int i,j, hsl ;
    float x,y,res;
    /* algoritma */
    System.out.println ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");
    System.out.println ("=============================================================================");
    Bool1 = true; Bool2 = false;
    TF = Bool1 && Bool2 ;System.out.println("Apabila "+Bool1+" And "+Bool2+" = "+TF); /* Boolean AND */
    TF = Bool1 || Bool2 ;System.out.println("Apabila "+Bool1+" Or "+Bool2+" = "+TF); /* Boolean OR */
    TF = !Bool1 ; /* NOT */System.out.println("Apabila "+"!"+Bool1+" = "+TF);
    TF = Bool1 ^ Bool2; /* XOR */System.out.println("Apabila "+Bool1+" ^ "+Bool2+" = "+TF);
    System.out.println ("=============================================================================");
    /* operasi numerik */
    i = 5; j = 2 ;
    hsl = i+j;System.out.println("hsl = "+((int)i)+"+"+((int)j)+"="+((int)hsl)); 
    hsl = i - j;System.out.println("hsl = "+((int)i)+"-"+((int)j)+"="+((int)hsl));
    hsl = i / j;System.out.println("hsl = "+((int)i)+"/"+((int)j)+"="+((int)hsl)); 
    hsl = i * j;System.out.println("hsl = "+((int)i)+"*"+((int)j)+"="+((int)hsl)); 
    hsl = i /j ;System.out.println("hsl = "+((int)i)+"/"+((int)j)+"="+((int)hsl));  /* pembagian bulat */
    hsl = i%j ;System.out.println("hsl = "+((int)i)+"%"+((int)j)+"="+((int)hsl));  /* sisa. modulo */
    System.out.println ("=============================================================================");
    /* operasi numerik */
    x = 5 ; y = 5 ;
    res = x + y;System.out.println("Hasil Dari "+((int)x)+"+"+((int)y)+"="+((int)res));  
    res = x - y; System.out.println("Hasil Dari "+((int)x)+"-"+((int)y)+"="+((int)res));
    res = x / y; System.out.println("Hasil Dari "+((int)x)+"/"+((int)y)+"="+((int)res));
    res = x * y;System.out.println("Hasil Dari "+((int)x)+"*"+((int)y)+"="+((int)res));
    System.out.println ("=============================================================================");
    /* operasi relasional numerik */
    TF = (i==j);System.out.println("Apakah "+" i==j "+" : "+TF);
    TF = (i!=j);System.out.println("Apakah "+" i != j "+" : "+TF);
    TF = (i < j); System.out.println("Apakah "+" i<j "+" : "+TF);
    TF = (i > j); System.out.println("Apakah "+" i>j "+" : "+TF);
    TF = (i <= j); System.out.println("Apakah "+" i<=j "+" : "+TF);
    TF =(i >= j);System.out.println("Apakah "+" i>=j "+" : "+TF);
    System.out.println ("=============================================================================");
    /* operasi relasional numerik */
    TF = (x != y);System.out.println("Apakah "+" x != y "+" : "+TF);
    TF = (x < y);System.out.println("Apakah "+" x<y "+" : "+TF); 
    TF = (x > y);System.out.println("Apakah "+" x>y "+" : "+TF); 
    TF = (x <= y);System.out.println("Apakah "+" x<=y "+" : "+TF); 
    TF = (x >= y);System.out.println("Apakah "+" x>=y "+" : "+TF);
    }}