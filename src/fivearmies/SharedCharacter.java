package fivearmies;

/**
 * Represents the shared character of FiveArmies. Examples include Orcs,
 * Archers. Implements the Extrinsic functions from the Character class.
 * Contains intrinsic and extrinsic state.
 * 
 * @version 1.1
 */
public class SharedCharacter implements Character {

	private String charName;
	private CharacterIntrinsic intrinsicState;
	private CharacterExtrinsic extrinsicState;

	SharedCharacter(String charName) {
		this.charName = charName;
		this.intrinsicState = null;
		this.extrinsicState = null;
	}

	SharedCharacter(String charName, CharacterIntrinsic intrinsicState) {
		this.charName = charName;
		this.intrinsicState = intrinsicState;
	}

	SharedCharacter(String charName, CharacterIntrinsic intrinsicState, CharacterExtrinsic extrinsicState) {
		this.charName = charName;
		this.intrinsicState = intrinsicState;
		this.extrinsicState = extrinsicState;
	}

	public String getCharName() {
		return charName;
	}

	public CharacterIntrinsic getIntrinsicState() {
		return intrinsicState;
	}

	public void setIntrinsicState(CharacterIntrinsic intrinsicState) {
		this.intrinsicState = intrinsicState;
	}

	public CharacterExtrinsic getExtrinsicState() {
		return extrinsicState;
	}

	public void setExtrinsicState(CharacterExtrinsic extrinsicState) {
		this.extrinsicState = extrinsicState;
	}

	@Override
	public void attackEnemy() {
		System.out.println(this.charName + this.extrinsicState.getId() + " is attacking the enemy.\n"
				+ this.intrinsicState.toString() + "\n" + this.extrinsicState.toString() + "\n");
	}
}