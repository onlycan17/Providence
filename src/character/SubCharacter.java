package character;

import character.Character;
import lombok.Builder;
import lombok.Data;
import type.ByPeridtype;
import type.ProvidenceRatingtype;

@Data
@Builder
public class SubCharacter implements Character {

  private String name;
  private String nickName;
  private ByPeridtype byPeridtype;
  private ProvidenceRatingtype providenceRatingtype;

  @Override
  public void action(String action) {
    System.out.println(action);
  }
}
