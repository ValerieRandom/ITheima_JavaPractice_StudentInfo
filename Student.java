// 因為是學生管理器，所以我們現在應該要把每個部份拆解為類

public class Student {
   private String Sex;
   private double Score;
   private String Name;

    public Student() {
    }

    public Student(String sex, double score, String name) {
        Sex = sex;
        Score = score;
        Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}