class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        int res = 0;

        for(String str : operations){
            switch(str){
                case "+": {
                    int sum = list.get(list.size() - 1) + list.get(list.size() - 2);
                    list.add(sum);
                    res += sum;
                    break;
                }
                case "C": {
                    res -= list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                    break;
                }
                case "D": {
                    int dou = list.get(list.size() - 1) * 2;
                    res += dou;
                    list.add(dou);
                    break;
                }
                default: {
                    int val = Integer.parseInt(str);
                    list.add(val);
                    res += val;
                    break;
                }
            }
        }
        return res;
    }
}