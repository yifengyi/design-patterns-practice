package patterns.behavioral.templateMethod.demo.studyAbord;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class StudyAbroadClient {
  public static void main(String[] args) {
    StudyAbroad sa = new StudyInAmerica();

    sa.templateMethod();
  }
}
