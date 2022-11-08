public class pilha {
    int elementos[];
    int topo;
    public pilha(){
        elementos = new int[5];
        topo = -1;
    }
    
    public void push(int e){
        topo++;
        elementos[topo] = e;

    } 
    public int pop(){
        int e;   
        e = elementos[topo];
        topo--;
        return e;
    }
    public boolean isEmpty(){
        return (topo == -1);
    }
    public boolean isFull(){
        return (topo == 4);
    }
    public int top(){
        return elementos[topo];
    }
}