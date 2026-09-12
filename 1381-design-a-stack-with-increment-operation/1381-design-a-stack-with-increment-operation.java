class CustomStack {

    private int top;
    private int[] arr;
    private int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        this.top = -1;
    }

    public boolean isStackFull(){
        return top == maxSize - 1;
    }

    public boolean isStackEmpty(){
        return top == -1;
    }
    
    public void push(int x) {
        if(isStackFull()) return;
        arr[++top] = x;
    }
    
    public int pop() {
        if(isStackEmpty()) return -1;
        return arr[top--];
    }
    
    public void increment(int k, int val) {
        int limit = (k > top) ? top : k - 1;
        
        for(int i = 0; i <= limit; i++){
            arr[i] = arr[i] + val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */