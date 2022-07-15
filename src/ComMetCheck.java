/*2022_07_16 손건호
* 생성자 파라미터, 메서드의 원리를 알고 싶었다
* 혼자 만들어본 예제이므 좋은 예제가 아닐수도 있다 */
public class ComMetCheck {
    String stance;
    public ComMetCheck() {
        stance = "기본 생성자";
    }

    public ComMetCheck(String a) {
        //this.stance = stance;
        stance = "생성자의 매개변수 = " + a;
    }

    String getStance(){
        //System.out.println("메서드");
        stance = "메서드를 거쳐간 "+ stance;
        return stance;
    }

    public static void main(String[] args) {
        //생성자
        ComMetCheck stateA = new ComMetCheck();// 기본 생성자 상태
        System.out.println(stateA.stance);// 무엇을 거쳐갔는지 출력
        System.out.println(stateA.getStance());// 메서드 출력

        System.out.println("=================");

        ComMetCheck stateB = new ComMetCheck("asd");// 파라미터 생성자 생태
        System.out.println(stateB.stance);
        System.out.println(stateB.getStance());

    }
}
