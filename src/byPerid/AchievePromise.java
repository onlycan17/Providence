package byPerid;

import character.MainCharacter;
import character.SubCharacter;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AchievePromise implements IProvidence {

  MainCharacter road;
  SubCharacter naviePeople;
  SubCharacter orderPeople;
  SubCharacter joan;
  SubCharacter belevers;
  SubCharacter knave;

  @Override
  public void history() throws InterruptedException {
    //사생애
    road.action("인생이 허무함을 깨달음. 산기도 20년 수행");
    naviePeople.action("미쳤다. 영들렸다. 하며 유언비어");
    road.action("베트남 참전, 생명의 기적과 평화의 조건을 세우심.");
    road.action("70일 금식기도 조건 세우심");
    road.action("성경의 핵심 인봉 풀고 30개론으로 말씀 정리. 도표 제작");
    Thread.sleep(3000);

    //공생애
    road.action("서울 상경. 복음 전파 시작");
    belevers.action("말씀을 듣고 믿고 따름.");
    road.action("많은 자들이 모일 수 있는 공간이 필요. 월명동 건축 시작.");
    orderPeople.action("말씀을 불신, 이단으로 판명");
    Thread.sleep(3000);

    //공생애 - 무덤기간
    road.action("해외선교 시작");
    orderPeople.action("방송국을 통해 진실왜곡. 환난 시작");
    knave.action("성도들 믿음을 실족시킴.");
    belevers.action("방송을 보고 실족하여 믿음을 저버린 자들이 생김.");
    knave.action("각종 죄의 누명을 뒤집어 씌우고 돈을 요구함.");
    road.action("악인들의 협상하지 않으심. 재판 승소. 방송국 왜곡 보도 승소.");
    belevers.action("남은 자들 환난을 버티고 계속 전도함. 주가 오시길 기다림.");
    joan.action("주 증거 사명 시작");
    belevers.action("일부 시기 질투함.");
    knave.action("조은 목사 내외적으로 공격함.");
    road.action("중국 공안에 붙잡히심. 10개월간 고문과 심문 당함.");
    road.action("무죄 판명받고 한국으로 귀국");
    road.action("증거가 없으나 증인의 증언만으로 10년형 선고");
    Thread.sleep(3000);
    joan.action("흔들리지 않음. 천국성령운동 시작. 섭리체계를 세우기 시작.");
    road.action("옥중 말씀 편지 조건.");
    joan.action("세상노래에 가사만 바꿔 부르던 것을. 섭리만의 우리곡을 만듬.");
    road.action("117 기도 조건 선포");
    belevers.action("117 기도 조건 시작");
    road.action("월명동 성자사랑의 집 건축. 이후 각 지역 대형교회 건축 ~ing.");
    road.action("성자 승천. 우리의 영 휴거 일");
    road.action("우리가 이곳을 중심으로 휴거되어 성자 사랑의 집 명칭을. 316 휴거 기념관으로 명칭 변경.");
    Thread.sleep(3000);
    //공생애 - 무덤기간 끝
    road.action("10년형 기간을 마치고 해방.");
    belevers.action("모두 기쁨과 환희. 그런데 모두 힘이 없음.");
    road.action("먼저 부활하여 섭리사 부활되기 위한 말씀 시작.");
    Thread.sleep(3000);
    //코로나.
    road.action("비대면 예배선포");
    belevers.action("비대면 예배시작");
    road.action("부활말씀 선포.");
    joan.action("살아남. SS부장교사 사명 시작. ");
    belevers.action("ss들이 살아남.");
    belevers.action("ss들이 살아나며 다른 부서들도 자극 받기 시작.");
    Thread.sleep(3000);
    road.action("미리 아시고 기도 조건 시작");
    belevers.action("기도하며 준비");
    knave.action("316날 언론에 거짓누명 선포");
    joan.action("섭리의 체계 재정비 선포. 질서 강조");
    belevers.action("116 / 316 기도조건 시작...ing");

  }
}
