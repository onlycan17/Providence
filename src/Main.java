import byPerid.AchievePromise;
import byPerid.NewPromise;
import byPerid.OldPromise;
import character.MainCharacter;
import character.SubCharacter;
import type.ByPeridtype;
import type.ProvidenceRatingtype;

public class Main {
  public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        //구약소개
        OldPromise oldPromise = main.addOldProvise();
        oldPromise.history();

        //신약소개
        NewPromise newPromise  = main.addNewProvise();
        newPromise.history();

        //성약소개
        AchievePromise achievePromise = main.addAchievePromise();
        achievePromise.history();
  }

  public OldPromise addOldProvise(){
   return OldPromise.builder().mose(
        MainCharacter.builder()
            .name("모세")
            .nickName("이스라엘 영도자")
            .byPeridtype(ByPeridtype.OldPromise)
            .providenceRatingtype(ProvidenceRatingtype.종).build()
    ).baroKing(
        SubCharacter.builder()
            .name("바로왕")
            .nickName("마음이 완악한자")
            .byPeridtype(ByPeridtype.OldPromise)
            .providenceRatingtype(ProvidenceRatingtype.종).build()
    ).israelPeople(
        SubCharacter.builder()
            .name("이스라엘 백성들")
            .nickName("불만불평 끝판왕")
            .byPeridtype(ByPeridtype.OldPromise)
            .providenceRatingtype(ProvidenceRatingtype.종).build()
    ) .isaiah(
        MainCharacter.builder()
            .name("이사야")
            .nickName("선지자 / 예언자")
            .byPeridtype(ByPeridtype.OldPromise)
            .providenceRatingtype(ProvidenceRatingtype.종)
            .build()
    ).daniel(
        MainCharacter.builder()
            .name("다니엘")
            .nickName("선지자 / 예언자")
            .byPeridtype(ByPeridtype.OldPromise)
            .providenceRatingtype(ProvidenceRatingtype.종)
            .build()
    ).build();

  }
  public NewPromise addNewProvise(){
    return NewPromise.builder()
        .jesus(
            MainCharacter.builder()
                .name("예수님")
                .nickName("그리스도 / 메시아 / 나사렛 예수 / 만왕의 왕 만주의 주 / 성자강림 분체 등등..")
                .byPeridtype(ByPeridtype.NewPromise)
                .providenceRatingtype(ProvidenceRatingtype.자녀)
                .build()
        ).peter(
            SubCharacter.builder()
                .name("베드로")
                .nickName("예수님 수제자")
                .byPeridtype(ByPeridtype.NewPromise)
                .providenceRatingtype(ProvidenceRatingtype.자녀)
                .build()
        ).paul(
            SubCharacter.builder()
                .name("바울")
                .nickName("회심자 / 전도자 / 사도")
                .byPeridtype(ByPeridtype.NewPromise)
                .providenceRatingtype(ProvidenceRatingtype.자녀)
                .build()
        ).judasIscariot(
            SubCharacter.builder()
                .name("가룟유다")
                .nickName("배신자 / 나지 않음이 좋을 뻔한 자 / 주를 판 자")
                .byPeridtype(ByPeridtype.NewPromise)
                .providenceRatingtype(ProvidenceRatingtype.구원없음)
                .build()
        ).apostleJohn(
            SubCharacter.builder()
                .name("요한")
                .nickName("애제자 / 사도")
                .byPeridtype(ByPeridtype.NewPromise)
                .providenceRatingtype(ProvidenceRatingtype.자녀)
                .build()
        ).johnTheBapist(
            SubCharacter.builder()
                .name("세례 요한")
                .nickName("주의 첩경을 평탄케 하는 자 / 세례자 / 인간으로 낳은 자중 큰자 / 변질자")
                .byPeridtype(ByPeridtype.NewPromise)
                .providenceRatingtype(ProvidenceRatingtype.구원없음)
                .build()
        ).pontiff(
            SubCharacter.builder()
                .name("제사장")
                .nickName("벙어리들 / 장님들 /무지한자들 / 외식하는 자들 / 악한자들")
                .byPeridtype(ByPeridtype.NewPromise)
                .providenceRatingtype(ProvidenceRatingtype.구원없음)
                .build()
        ).pontiusPilate(
            SubCharacter.builder()
                .name("본디오빌라도")
                .nickName("로마 군인 / 총독")
                .byPeridtype(ByPeridtype.NewPromise)
                .providenceRatingtype(ProvidenceRatingtype.구원없음)
                .build()
        ).build();
  }
  public  AchievePromise addAchievePromise(){
    return AchievePromise.builder()
        .road(
            MainCharacter.builder()
                .name("선생님")
                .nickName("선생님 / 총재 / JRR / MSA 기타등등...")
                .byPeridtype(ByPeridtype.AchievePromise)
                .providenceRatingtype(ProvidenceRatingtype.신부)
                .build()
        )
        .joan(
            SubCharacter.builder()
                .name("정조은")
                .nickName("주 증거자 / 사도 / SS부장교사 / 체계질서를 잡는 자 기타등등..")
                .byPeridtype(ByPeridtype.AchievePromise)
                .providenceRatingtype(ProvidenceRatingtype.신부)
                .build()
        )
        .belevers(
            SubCharacter.builder()
                .name("성도들")
                .nickName("믿고 따른 자들")
                .byPeridtype(ByPeridtype.AchievePromise)
                .providenceRatingtype(ProvidenceRatingtype.신부)
                .build()
        )
        .naviePeople(
            SubCharacter.builder()
                .name("동네 주민들")
                .nickName("동네 주민들")
                .byPeridtype(ByPeridtype.AchievePromise)
                .providenceRatingtype(ProvidenceRatingtype.자녀)
                .build()
        )
        .orderPeople(
            SubCharacter.builder()
                .name("기성인들 중 반대자들")
                .nickName("신약 바리새인 2세들")
                .byPeridtype(ByPeridtype.AchievePromise)
                .providenceRatingtype(ProvidenceRatingtype.구원없음)
                .build()
        )
        .knave(
            SubCharacter.builder()
                .name("악평자들")
                .nickName("악평자들 / 악인들 / 사탄주관자들")
                .byPeridtype(ByPeridtype.AchievePromise)
                .providenceRatingtype(ProvidenceRatingtype.구원없음)
                .build()
        ).build();
  }
}
