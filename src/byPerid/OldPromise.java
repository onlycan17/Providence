package byPerid;

import character.MainCharacter;
import character.SubCharacter;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OldPromise implements IProvidence,Runnable{


  MainCharacter mose;
  SubCharacter baroKing;
  SubCharacter israelPeople;

  MainCharacter isaiah;
  MainCharacter daniel;



  @Override
  public void history() throws InterruptedException {
    //애굽 10가지 재앙
    mose.action("바로왕에게 하나님의 명으로 이스라엘 백성들을 해방시키길 말함.");
    baroKing.action("모세의 요청을 거절함");
    Thread.sleep(1000);
    mose.action("축약 -> 애굽에 10가지 재앙을 내림");
    baroKing.action("마지막 재앙을 받고 이스라엘 백성들을 해방시킴.");
    Thread.sleep(1000);
    israelPeople.action("모세를 따라 애굽을 나옴");
    baroKing.action("군대를 일으켜 모세와 백성들을 추격함.");
    Thread.sleep(500);
    mose.action("백성들을 이끌고 하나님께 구하여 홍해바다를 건넘");
    Thread.sleep(500);
    baroKing.action("모세를 추격하여 홍해바다를 건너다 익사");
    Thread.sleep(1500);

    //신광야 10계명
    israelPeople.action("물이 없어 불평함.");
    Thread.sleep(500);
    mose.action("기적 행함.");
    Thread.sleep(500);
    israelPeople.action("먹을것 없어 불평함. 모세 원망");
    Thread.sleep(500);
    mose.action("저녁에는 고기 와 아침에는 떡 주심 백성들에게 아침까지 남겨두지 말라고 함.");
    Thread.sleep(500);
    israelPeople.action("모세 말을 안들음. 벌레가 생기고 냄새나서 못 먹게 됨. 모세를 원망함.");
    Thread.sleep(500);
    israelPeople.action("배은망덕 시전.");
    Thread.sleep(500);
    mose.action("하나님께 간청함.");
    Thread.sleep(500);
    mose.action("시내산 올라감");
    Thread.sleep(500);
    Thread action = new Thread(this::run);
    action.start();
    mose.action("이스라엘 백성들이 우상숭배하는 모습보고 빡침, 돌판을 부수고 다시 십계명 받음");
    Thread.sleep(500);
    israelPeople.action("불평불만이 끊어지지 않음");
    mose.action("가나안 입성 허락치 않음. 40년 후 다음세대 입성.");
    Thread.sleep(1500);

    //예언
    isaiah.action("예수님 초림을 예언");
    Thread.sleep(1500);
    daniel.action("한때 두때 반때를 예언");
    Thread.sleep(1500);
  }

  @Override
  public void run() {
    try {
      for (int i = 0; i < 10; i++) {
        mose.action("십계명 받는중...."+i+"번째");
        israelPeople.action("우상숭배 ing....");
        Thread.sleep(2000);
      }
    }catch (Exception e){
      e.printStackTrace();
    }
  }
}
