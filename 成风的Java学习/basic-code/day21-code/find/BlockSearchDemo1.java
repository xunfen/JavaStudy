public class BlockSearchDemo1 {
    public static void main(String[] args) {
        // 分块查找：块内无序，块间有序
        int[] arr = { 16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66 };

        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block[] blockArr = { b1, b2, b3 };

        int num = 61;

        int index = getIndex(blockArr, arr, num);
        System.out.println("num在数组中的索引为：" + index);
    }

    private static int getIndex(Block[] blockArr, int[] arr, int num) {
        int index = findIndexBlock(blockArr, num);
        if (index == -1) {
            return -1;
        }
        int startIndex = blockArr[index].getStartIndex();
        int endIndex = blockArr[index].getEndIndex();

        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;

    }

    private static int findIndexBlock(Block[] blockArr, int num) {
        //从0索引遍历blockArr，如果num小于max，那么num就在这一块中
        for (int i = 0; i < blockArr.length; i++) {
            if (num < blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }

    static class Block {
        private int max;
        private int startIndex;
        private int endIndex;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public int getStartIndex() {
            return startIndex;
        }

        public void setStartIndex(int startIndex) {
            this.startIndex = startIndex;
        }

        public int getEndIndex() {
            return endIndex;
        }

        public void setEndIndex(int endIndex) {
            this.endIndex = endIndex;
        }

        public Block() {

        }

        public Block(int max, int startIndex, int endIndex) {
            this.max = max;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

    }

}
