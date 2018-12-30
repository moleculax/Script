class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[8];

        System.arraycopy(copyFrom, 2, copyTo, 0, 8);
        System.out.println(new String(copyTo));
    }
}
