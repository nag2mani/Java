public class MinHeap {
    public static class MnHeap{
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

        private void swap(int fpos, int spos) {
            int tmp;
            tmp = Heap[fpos];
            Heap[fpos] = Heap[spos];
            Heap[spos] = tmp;
        }

        private void downHeapify(int pos){
            if ((leftChild(pos)<= size || rightChild(pos) <=size) && size >0){
                if (Heap[leftChild(pos)] < Heap[pos] || Heap[rightChild(pos)] < Heap[pos]){
                    if (Heap[leftChild(pos)] < Heap[rightChild(pos)]){
                        swap(pos, leftChild(pos));
                        downHeapify(leftChild(pos));
                    }else{
                        swap(pos, rightChild(pos));
                        downHeapify(rightChild(pos));
                    }
                }

            } else{
                return;
            }
        }

        private void upHeapify(int pos){
            int temp = Heap[pos];
            while (pos > 0 && Heap[parent(pos)] > temp) {
                // swap(pos, parent(pos));
                Heap[pos] = Heap[parent(pos)];
                pos = parent(pos);
            }
            Heap[pos] = temp;
        }

        public void print() {
            for (int i = 1; i <= size / 2; i++) {
                System.out.print(Heap[i] + ": L- " + Heap[2 * i] + " R- " + Heap[2 * i + 1] );
                System.out.println();
            }
        }

        public void insert(int element){
            Heap[++size]=element;
            int current = size;
            upHeapify(current);
        }

        public int extractMin(){
            int min = Heap[1];
            Heap[1] = Heap[size--];
            downHeapify(1);
            return min;
        }

    }

    
    public static void main(String[] args) {
        MnHeap obj_min_heap = new MnHeap(10);
        obj_min_heap.insert(9);
        obj_min_heap.insert(19);
        obj_min_heap.insert(3);
        obj_min_heap.insert(5);
        obj_min_heap.insert(7);
        obj_min_heap.insert(11);
        obj_min_heap.insert(8);
        obj_min_heap.insert(2);
        obj_min_heap.insert(0);

        obj_min_heap.print();
        
        System.out.println("Minimum element " + obj_min_heap.extractMin());
        System.out.println("Next Minimum element " + obj_min_heap.extractMin());
        
        obj_min_heap.print();
    }
}