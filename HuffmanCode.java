public class HuffmanCode{

    char[] harfler = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] harflerDizi = new char[27];

    //Tekrar sayısı
    int[] harfIndex = new int[27];


    int tekrarSayisi = 0;
    char[] kodlar = new char[27];
    char[] ekstra = new char[27];

    String metin = "";
    String binary = "";


    {
        for(int l=0;l<harfIndex.length;l++) {
            harfIndex[l] =0;
        }
    }

    public void tekrarBul(){
        for (int y=0;y<harflerDizi.length;y++){

            if(harflerDizi[y] == harflerDizi[y+1] ){
                tekrarSayisi = y;
                return;

            }
        }
    }

    public void sayAlp(String s){
        metin = s;
        for (int i=0;i<harfler.length;i++){
            for (int j=0;j<s.length();j++){
                if(harfler[i] == s.charAt(j)){
                    harfIndex[i] = harfIndex[i] +1;
                }
            }
        }
    }
    {

    }




    public void kodDonustur() {

        int max = 0;
        int maxindex = 0;
        for(int m=0;m<27;m++) {
            max = 0;
            maxindex = 0;
            for (int n = 0; n < harfIndex.length; n++) {
                if (max < harfIndex[n]) {
                    max = harfIndex[n];
                    maxindex = n;
                }
            }
            harflerDizi[m] = harfler[maxindex];
            harfIndex[maxindex] = 0;

        }
        tekrarBul();


        for(int y=0;y<tekrarSayisi;y++){
            kodlar[y] = harflerDizi[y];

        }

    }

    public void yaz(){
        for (int a=0;a<kodlar.length;a++){
        }
    }

    public void kodYap(){ //stringi binary yapar.
        for (int e =0;e<metin.length();e++){

            if(metin.charAt(e)==kodlar[0]){ // 0. elemanda 0 yazar
                System.out.print("0");
                binary = binary + "0";
                continue;
            }else{
            for (int u=0;u<kodlar.length;u++){
                if(kodlar[u] == metin.charAt(e)){


                    for (int g =0;g<u;g++){
                        System.out.print("1");
                        binary = binary + "1";

                    }
                    System.out.print("0");
                    binary = binary + "0";

                }
            }}
        }
    }

    public static void main(String[] args) {
        HuffmanCode huffmanCode = new HuffmanCode();
        String degoisken = "bccdaa";
        huffmanCode.sayAlp(degoisken);
        huffmanCode.kodDonustur();
        huffmanCode.kodYap();
        System.out.println("");
        System.out.println(huffmanCode.binary);






    }


    }

