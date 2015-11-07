/* Battle Ground is the FlyWeightFactory*/
package fivearmies;

import java.util.*;

/**
 * The class maintains a list of characters in an HashMap. If the character
 * already exists, it returns the same. Else, creates a new character. It is
 * responsible for creating both Shared and UnShared Characters.
 * 
 * @version 1.2
 */
public class BattleGround {

	private HashMap<String, SharedCharacter> charactersList = new HashMap<String, SharedCharacter>();

	public SharedCharacter createCharacter(String charName, CharacterExtrinsic extrinsic) {
		charName = charName.toLowerCase();
		if (charactersList.get(charName) == null)
			charactersList.put(charName, new SharedCharacter(charName, this.getCharacterIntrinsicState(charName)));

		charactersList.get(charName).setExtrinsicState(extrinsic);

		return charactersList.get(charName);
	}

	public CharacterIntrinsic getCharacterIntrinsicState(String charName) {
		CharacterIntrinsic intrinsicState = new CharacterIntrinsic();

		if (charName.equalsIgnoreCase("Orc")) {
			intrinsicState.setHeight(225);
			intrinsicState.setStrength(84);
		} else if (charName.equalsIgnoreCase("Archer")) {
			intrinsicState.setHeight(175);
			intrinsicState.setStrength(78);
		}

		return intrinsicState;
	}

	public UnSharedCharacter createUnSharedCharacter(String charName, CharacterExtrinsic extrinsicState) {
		return new UnSharedCharacter(charName, extrinsicState);
	}
}
