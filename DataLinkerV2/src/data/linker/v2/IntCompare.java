package data.linker.v2;

public class IntCompare implements interfaces.ICompare{
    @Override
    public int compare(Object o1, Object o2) {
        int s1 = (int) o1;
        int s2 = (int) o2;

        if(s1 > s2){
            return 1;
        }else if(s1 < s2){
            return -1;
        }
        return 0;
    }
}
