public class MaxHeap {

    static class MxHeap {

        private int[] Heap;
        private int size;
        private int maxsize;

        // Constructure
        public MxHeap(int size) {
            this.maxsize = size;
            this.size = 0;
            Heap = new int[this.maxsize + 1];
            Heap[0] = Integer.MAX_VALUE;
        }

        private int parent(int pos) {
            return pos / 2;
        }

        private int leftChild(int pos) {
            return (2 * pos);
        }

        private int rightChild(int pos) {
            return (2 * pos) + 1;
        }

        private void swap(int fpos, int spos) {
            int tmp;
            tmp = Heap[fpos];
            Heap[fpos] = Heap[spos];
            Heap[spos] = tmp;
        }

        // When we delete root then we usually use this.
        private void downHeapify(int pos) {
            if ((leftChild(pos) <= size || rightChild(pos) <= size) && size > 0) {
                if (Heap[pos] < Heap[leftChild(pos)] || Heap[pos] < Heap[rightChild(pos)]) {
                    if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
                        swap(pos, leftChild(pos));
                        downHeapify(leftChild(pos));
                    }
                    else{
                        swap(pos, rightChild(pos)); // 1,3
                        downHeapify(rightChild(pos)); // dhf=3
                    }
                }
            }
            else {
                return;
            }
        }

        // When we insert in a heap, then we use upHeapify.
        private void upHeapify(int pos) {
            // Storing the element which is finding their correc position.
            int temp = Heap[pos];
            while (pos > 0 && temp > Heap[parent(pos)]) {
                Heap[pos] = Heap[parent(pos)];
                pos = parent(pos);
            }
            Heap[pos] = temp;
        }

        public void insert(int element) {
            Heap[++size] = element;
            int current = size;
            upHeapify(current);
        }

        public void print() {
            for (int i = 1; i <= size / 2; i++) {
                System.out.print(Heap[i] + ": L- " + Heap[2 * i] + " R- " + Heap[2 * i + 1] );
                System.out.println();
            }
        }

        //this is also called delete method.
        public int extractMax() {
            int max = Heap[1];
            Heap[1] = Heap[size--];
            downHeapify(1);
            return max;
        }
    }

    public static void main(String[] arg) {

        // int c=MxHeap.size;
        // for(int i=1;i<=c;i++) {
        // System.out.print(obj_max_heap.extractMax()+" ");
        // }

        MxHeap obj_max_heap = new MxHeap(10);
        obj_max_heap.insert(19);
        obj_max_heap.insert(4);
        obj_max_heap.insert(2);
        obj_max_heap.insert(5);
        obj_max_heap.insert(13);
        obj_max_heap.insert(100);
        obj_max_heap.insert(6);
        obj_max_heap.insert(17);
        obj_max_heap.insert(0);
        obj_max_heap.print();
        System.out.println("The max is " + obj_max_heap.extractMax());
        System.out.println("The next max is " + obj_max_heap.extractMax());
        obj_max_heap.print();
        
    }
}
