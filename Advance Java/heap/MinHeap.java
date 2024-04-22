public class MinHeap {
    public class MnHeap{
        private int[] Heap;
        private int size;
        private int maxSize;

        public MnHeap(int size){
            this.maxSize = size;
            this.size =0;
            Heap = new int[this.maxSize+1];
            Heap[0] = Integer.MIN_VALUE;
        }

        private int parent(int pos){
            return pos/2;
        }

        private int leftChild(int pos){
            return pos*2;
        }

        private int rightChild(int pos){
            return pos * 2 + 1;
        }

        private void downHeapify(int pos){

        }

        private void upHeapify(int pos){

        }

        public void print(){
        
        }

        public void insert(int element){

        }

        public int extractMin(){

        }

    }

    
    public static void main(String[] args) {
        
    }
}
