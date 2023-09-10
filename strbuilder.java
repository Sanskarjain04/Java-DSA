public class strbuilder {

    public static void main(String[] args) {
        // Create a string builder object
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);
        sb.insert(2, 'n');
        System.out.println(sb);
        sb.delete(2, 3);
        System.out.println(sb);
       StringBuilder sj = new StringBuilder("h");
       sj.append('e');
       sj.append('l');
       sj.append('l');
       sj.append('0');
       System.out.println(sj);
    }
}