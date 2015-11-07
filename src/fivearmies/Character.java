/*Character is the FlyWeight interface*/
package fivearmies;

/**
 * The character interface specifies the extrinsic operations.
 * 
 * @version 1.0
 */
public interface Character {

	public void attackEnemy();
}

/**
 * Specifies the intrinsic properties of all the Shared characters.
 * 
 * @version 1.1
 */
class CharacterIntrinsic {
	private int strength = 0;
	private int height = 0;

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "IntrinsicState [strength=" + this.strength + ", height=" + this.height + ", hashCode()="
				+ this.hashCode() + "]";
	}
}

/**
 * Contains the extrinsic properties of both Shared and UnShared Characters.
 * 
 * @version 1.1
 */
class CharacterExtrinsic {
	private int id = 0;
	private int position = 0;
	private int health = 100;

	public CharacterExtrinsic() {
	}

	public CharacterExtrinsic(int id, int position, int health) {
		this.id = id++;
		this.position = position;
		this.health = health;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "ExtrinsicState [id=" + this.id + ", position=" + this.position + ", health=" + this.health
				+ ", hashCode()=" + this.hashCode() + "]";
	}
}
