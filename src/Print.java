/*MyOOP에서 분리
* + class가 아닌 인스턴스로 사용하기 위해 static 제거
* ++ 자바에서 static 이 있는 이유는 어떠한 class가 있을때
* 그 class의 인스턴스 값들 과 구분 하여 사용하기 위함인것 같다 */
public class Print{
    public String delimiter = "";

    public void prA(){// void 라서 리턴이 없는 메서드
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public void prB(){
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}