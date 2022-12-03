package Set;


public class DemoLinkedHashSet {


        public  void CreateList(){

            java.util.LinkedHashSet st=new java.util.LinkedHashSet();

            st.add("AGRA");
            st.add("RAM");
            st.add("KANPUR");
            st.add("SHYAM");
            st.add(12);
            st.add(null);
            st.add(123.453);

            System.out.println(st);


            for(Object var: st){

                System.out.println(var);
            }
        }

    public static void main(String[] args) {
        DemoLinkedHashSet obj=new DemoLinkedHashSet();
        obj.CreateList();
    }
}
