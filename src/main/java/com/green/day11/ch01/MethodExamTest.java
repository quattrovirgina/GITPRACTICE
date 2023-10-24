package com.green.day11.ch01;

public class MethodExamTest { // 패키지 다르면 같은이름이어도 상관없음
    public static void main(String[] args) {
        MethodExam met = new MethodExam();

       String r1 = met.scoreResultOptV2(-1);

        // 해당 메소드에 100초과 0미만이라면 점수를 확인해주세요
        // A: 90~100, B: 80~89, C: 70~79 D:69이하
        // 8 9 일때 +, 그외에는 0, 3 이하는 -

        String season = met.getSeason(13);
        String season2 = met.getSeasonV2(3);
        System.out.println();
        System.out.println(season2);

        // 3, 4, 5는 봄, 6,7,8은 여름, 9,10,11은 가을, 12,1,2는 겨울, 나머지는 없음
    }
}
