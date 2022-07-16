/*2022_07_16 손건호
* 변수를 응용한 메서드 사용 예제
* + Print class 생성으로 main 영역을 간소화
* + 인스턴스를 사용해 변수 delimiter 사용을 간소화 */

public class MyOOP {
    public static void main(String[] args) {
        Print p1 = new Print();
        p1.delimiter = "----";
        p1.prA();
        p1.prA();
        p1.prB();
        p1.prB();

        Print p2 = new Print();
        p2.delimiter = "*****";
        p2.prA();
        p2.prA();
        p2.prB();
        p2.prB();

        p1.prA();// Print 의 메서드들을 인스턴스 p1,p2로 실행
        p2.prB();
        p1.prB();
        p2.prA();
    }
}
