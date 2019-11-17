package Ex2_2;

public class Dragon {
    private int countOfHeads = 3;
    private int newHeads = 3;
    private int age;

    public int getCountOfHeads() {
        return countOfHeads;
    }

    public void setCountOfHeads(int countOfHeads) {
        this.countOfHeads = countOfHeads;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void growHeads(){
        for (int year=0; year<age; year++){
            if(year == 200){
                newHeads = 2;
            }
            if (year == 300){
                newHeads = 1;
            }
            countOfHeads += newHeads;
        }
    }
}
