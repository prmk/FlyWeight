package fivearmies;

/**
 * Represents the unshared character of FiveArmies. Examples include Army chief,
 * King. Implements the Extrinsic functions from the Character class. Contains
 * extrinsic state.
 * 
 * @version 1.1
 */
public class UnSharedCharacter implements Character {
	private String charName;
	private CharacterExtrinsic extrinsicState;

	UnSharedCharacter(String charName) {
		this.charName = charName;
		this.extrinsicState = null;
	}

	UnSharedCharacter(String charName, CharacterExtrinsic extrinsicState) {
		this.charName = charName;
		this.extrinsicState = extrinsicState;
	}

	public String getCharName() {
		return charName;
	}

	public CharacterExtrinsic getExtrinsicState() {
		return extrinsicState;
	}

	public void setExtrinsicState(CharacterExtrinsic extrinsicState) {
		this.extrinsicState = extrinsicState;
	}

	public void LeadArmy() {
		System.out.println(this.charName + " is leading the army\n");
	}

	@Override
	public void attackEnemy() {
		System.out.println(this.charName + " is attacking the enemy.\n" + this.extrinsicState.toString() + "\n");
	}
}