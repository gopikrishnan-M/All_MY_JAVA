package HuffManCoding;

import Heaps.Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HuffmanCoder {
    HashMap<Character,String> encoder;
    HashMap<String,Character> decoder;

    private class Node implements Comparable<Node>{
        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data,int cost ) {
            this.cost = cost;
            this.data = data;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }
    public void encoder(String feed) throws Exception{
        HashMap<Character,Integer> fmap=new HashMap<>();

        for(int i=0;i<feed.length();i++){
            char ch=feed.charAt(i);
            if(fmap.containsKey(ch)){
                int ov=fmap.get(ch); //original value tat already exist
                ov+=1;
                fmap.put(ch,ov);
            }
            else{
                fmap.put(ch,1);
            }
        }

        Heap<Node> minheap=new Heap<>();
        Set<Map.Entry<Character,Integer>> entryset=fmap.entrySet();

        for(Map.Entry<Character,Integer> entry:entryset){
            Node node=new Node(entry.getKey(),entry.getValue());
            minheap.insert(node);
        }

        while (minheap.size()!=1) {
            Node first=minheap.remove();
            Node second= minheap.remove();

            Node newNode=new Node('\0', first.cost+second.cost);
            newNode.left=first;
            newNode.right=second;

            minheap.insert(newNode);
        }

        Node fulltree=minheap.remove();

        this.encoder=new HashMap<>();
        this.decoder=new HashMap<>();
        initEncoderDecoder(fulltree,"");

    }
    private void initEncoderDecoder(Node node ,String opSoFar){
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            this.encoder.put(node.data,opSoFar);
            this.decoder.put(opSoFar,node.data);
        }
        initEncoderDecoder(node.left,opSoFar+"0");
        initEncoderDecoder(node.right,opSoFar+"1");
    }
    public String encode(String input){
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<input.length();i++){
            ans.append(encoder.get(input.charAt(i)));
        }
        return ans.toString();
    }

    public String decode(String code){
        StringBuilder ans=new StringBuilder();
        String key="";
        for (int i = 0; i < code.length(); i++) {
            key=key + code.charAt(i);
            if (decoder.containsKey(key)) {
                ans.append(decoder.get(key));
                key="";
            }
        }
        return ans.toString();
    }

}
