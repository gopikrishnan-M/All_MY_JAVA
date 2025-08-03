package HuffManCoding;

public class Main {
    public static void main(String[] args) {
        String msg="hello";
        //object creation
        HuffmanCoder hc=new HuffmanCoder();

        //coding the string using huffman code wiht the help of tree
        String codedString= hc.encode(msg);
        System.out.println(codedString);

        //deconding the code
        String dc=hc.decode(codedString);
        System.out.println(dc);
    }
}
