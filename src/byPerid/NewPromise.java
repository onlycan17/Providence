package byPerid;

import character.MainCharacter;
import character.SubCharacter;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewPromise implements IProvidence {

  MainCharacter jesus; //예수
  SubCharacter judasIscariot; //가룟유다
  SubCharacter peter; //베드로
  SubCharacter paul; //사도바울
  SubCharacter pontiff; // 제사장
  SubCharacter johnTheBapist; //세례요한
  SubCharacter pontiusPilate; //본디오빌라도
  SubCharacter apostleJohn; //사도요한


  @Override
  public void history() throws InterruptedException {
    //복음 전파와 믿음 불신
    jesus.action("자녀역사 복음 전파. 자녀급이 되면서 만물을 통한 제사에서 직접 몸을 통해 예배형식으로 전환.");
    peter.action("예수님을 믿고 따름");
    apostleJohn.action("예수님을 믿고 따름");
    johnTheBapist.action("처음에는 예수님을 믿다가 점점 믿음이 흔들림. \\n 헤롯왕 꾐에 걸려 처형 당함.");
    pontiff.action("예수님 불신함");
    Thread.sleep(1500);

    //불신자들에 의해 순교
    judasIscariot.action("예수님을 믿다가 자기주관에 빠져 예수님을 팔아넘김");
    pontiff.action("예수님을 모욕하고 침을 뱉고 때림. 본디오 빌라도에게 재판신청");
    pontiusPilate.action("폭동이 생길까 염려하여 그들의 바램대로 예수님께 십자가형을 내림.");
    Thread.sleep(1500);
    //영적부활
    jesus.action("십자가 처형, 사흘 후 영적부활. 다시 올 것을 약속(재림)후 40일 후 승천");
    Thread.sleep(1500);
    //사도시대
    peter.action("부활한 예수님 영접 후. 복음전파 시작.");
    paul.action("예수님을 만나고 눈이 멀어버림. 아나니아의 세례로 눈이 다시 밝아짐. 회심 후 복음 전파.");
    Thread.sleep(1000);
    peter.action("복음전파 후 순교");
    paul.action("복음전파 후 순교");
    apostleJohn.action("예수님의 말씀과 본인이 체험한 영적현상과 앞으로 있을 여러가지 징조들을 기록하여 계시록을 남김. 밧모섬에서 마지막을 보냄.");
  }
}
