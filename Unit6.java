public class Unit6 {
    public static void main(String[] args) {
        // String str=new String("Hello,World!");
        // System.out.println(str);

        String str="Hello,java!";

        // System.out.println("Length:"+str.length());
        // System.out.println("Char at Index 1:"+str.charAt(1));
        // System.out.println("Substring:"+str.substring(7));
        // System.out.println("Trimmed:"+str.trim()+"'");
        // System.out.println("Uppercase:"+str.toUpperCase());
        
        // String str2="Programming";
        // System.out.println("Concatenated:"+str.trim().concat(""+str2));

        // SringBuffer---Insert a text(append,insert,reverse,delete)

        // StringBuffer sb=new StringBuffer("Good Morning!");
        // sb.insert(0, "very ");
        // System.out.println("StringBuffer after insert:" +sb);

        // StringBuilder
        StringBuilder sb=new StringBuilder("Happy Coding!");
        sb.delete(6, 12);
        System.out.println("After delete:" +sb);

    }
    
}
